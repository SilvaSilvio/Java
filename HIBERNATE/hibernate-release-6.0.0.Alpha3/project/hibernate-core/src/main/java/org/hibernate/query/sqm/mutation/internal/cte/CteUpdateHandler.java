/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.query.sqm.mutation.internal.cte;

import org.hibernate.NotYetImplementedFor6Exception;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.query.sqm.internal.DomainParameterXref;
import org.hibernate.query.sqm.mutation.internal.UpdateHandler;
import org.hibernate.query.sqm.tree.update.SqmUpdateStatement;
import org.hibernate.sql.ast.tree.cte.CteTable;
import org.hibernate.sql.exec.spi.ExecutionContext;

/**
 *
 * @author Evandro Pires da Silva
 * @author Vlad Mihalcea
 * @author Steve Ebersole
 */
public class CteUpdateHandler
		extends AbstractCteMutationHandler
		implements UpdateHandler {

	@SuppressWarnings("WeakerAccess")
	public CteUpdateHandler(
			CteTable cteTable,
			SqmUpdateStatement sqmStatement,
			DomainParameterXref domainParameterXref,
			CteStrategy strategy,
			SessionFactoryImplementor sessionFactory) {
		super( cteTable, sqmStatement, domainParameterXref, strategy, sessionFactory );
	}

	@Override
	public int execute(ExecutionContext executionContext) {
		throw new NotYetImplementedFor6Exception();
	}
}
