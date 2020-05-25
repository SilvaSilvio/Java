/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.query.sqm.mutation.internal.inline;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.metamodel.mapping.BasicValuedModelPart;
import org.hibernate.metamodel.mapping.ColumnConsumer;
import org.hibernate.metamodel.mapping.EntityIdentifierMapping;
import org.hibernate.metamodel.mapping.EntityMappingType;
import org.hibernate.metamodel.mapping.JdbcMapping;
import org.hibernate.sql.ast.tree.expression.ColumnReference;
import org.hibernate.sql.ast.tree.expression.Expression;
import org.hibernate.sql.ast.tree.expression.JdbcLiteral;
import org.hibernate.sql.ast.tree.expression.SqlTuple;
import org.hibernate.sql.ast.tree.from.TableReference;
import org.hibernate.sql.ast.tree.predicate.InListPredicate;
import org.hibernate.sql.exec.spi.ExecutionContext;

/**
 * MatchingIdRestrictionProducer producing a restriction based on an in-values-list predicate.  E.g.:
 *
 * ````
 * delete
 * from
 *     entity-table
 * where
 *     ( id ) in (
 *         ( 1 ),
 *         ( 2 ),
 *         ( 3 ),
 *         ( 4 )
 *     )
 * ````
 *
 * @author Steve Ebersole
 */
@SuppressWarnings("unused")
public class InPredicateRestrictionProducer implements MatchingIdRestrictionProducer {
	@Override
	public InListPredicate produceRestriction(
			List<?> matchingIdValues,
			EntityMappingType entityDescriptor,
			TableReference mutatingTableReference,
			Supplier<Consumer<ColumnConsumer>> columnsToMatchVisitationSupplier,
			ExecutionContext executionContext) {
		assert matchingIdValues != null;
		assert ! matchingIdValues.isEmpty();

		final SessionFactoryImplementor sessionFactory = executionContext.getSession().getFactory();

		final EntityIdentifierMapping identifierMapping = entityDescriptor.getIdentifierMapping();
		final int idColumnCount = identifierMapping.getJdbcTypeCount( sessionFactory.getTypeConfiguration() );
		assert idColumnCount > 0;

		final InListPredicate predicate;

		if ( idColumnCount == 1 ) {
			final BasicValuedModelPart basicIdMapping = (BasicValuedModelPart) identifierMapping;
			final String idColumn = basicIdMapping.getMappedColumnExpression();
			final Expression inFixture = new ColumnReference(
					mutatingTableReference,
					idColumn,
					basicIdMapping.getJdbcMapping(),
					sessionFactory
			);
			predicate = new InListPredicate( inFixture );

			for ( int i = 0; i < matchingIdValues.size(); i++ ) {
				final Object matchingId = matchingIdValues.get( i );
				predicate.addExpression( new JdbcLiteral<>( matchingId, basicIdMapping.getJdbcMapping() ) );
			}
		}
		else {
			final List<ColumnReference> columnReferences = new ArrayList<>( idColumnCount );
			final List<JdbcMapping> jdbcMappings = new ArrayList<>( idColumnCount );
			identifierMapping.visitColumns(
					(columnExpression, containingTableExpression, jdbcMapping) -> {
						columnReferences.add( new ColumnReference( mutatingTableReference, columnExpression, jdbcMapping, sessionFactory ) );
						jdbcMappings.add( jdbcMapping );
					}
			);

			final Expression inFixture = new SqlTuple( columnReferences, identifierMapping );
			predicate = new InListPredicate( inFixture );

			for ( int i = 0; i < matchingIdValues.size(); i++ ) {
				final Object matchingId = matchingIdValues.get( i );
				assert matchingId instanceof Object[];
				final Object[] matchingIdParts = (Object[]) matchingId;

				final List<JdbcLiteral> tupleParts = new ArrayList<>( idColumnCount );
				for ( int p = 0; p < matchingIdParts.length; p++ ) {
					tupleParts.add(
							new JdbcLiteral<>( matchingIdParts[p],jdbcMappings.get( p ) )
					);
				}

				predicate.addExpression( new SqlTuple( tupleParts, identifierMapping ) );
			}
		}

		return predicate;
	}
}
