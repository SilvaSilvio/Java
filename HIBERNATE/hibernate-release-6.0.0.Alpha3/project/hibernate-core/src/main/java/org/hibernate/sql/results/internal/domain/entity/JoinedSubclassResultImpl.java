/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.sql.results.internal.domain.entity;

import java.util.function.Consumer;

import org.hibernate.metamodel.mapping.EntityDiscriminatorMapping;
import org.hibernate.metamodel.mapping.EntityMappingType;
import org.hibernate.metamodel.mapping.EntityValuedModelPart;
import org.hibernate.persister.entity.JoinedSubclassEntityPersister;
import org.hibernate.query.NavigablePath;
import org.hibernate.sql.ast.tree.from.TableGroup;
import org.hibernate.sql.results.spi.AssemblerCreationState;
import org.hibernate.sql.results.spi.DomainResultAssembler;
import org.hibernate.sql.results.spi.DomainResultCreationState;

/**
 * @author Andrea Boriero
 */
public class JoinedSubclassResultImpl extends EntityResultImpl {
	public JoinedSubclassResultImpl(
			NavigablePath navigablePath,
			EntityValuedModelPart entityValuedModelPart,
			String resultVariable,
			DomainResultCreationState creationState) {
		super( navigablePath, entityValuedModelPart, resultVariable, creationState );
	}

	@Override
	public DomainResultAssembler createResultAssembler(
			Consumer initializerCollector,
			AssemblerCreationState creationState) {
		// todo (6.0) : seems like here is where we ought to determine the SQL selection mappings

		final EntityRootInitializer initializer = new EntityRootInitializer(
				this,
				getNavigablePath(),
				getLockMode(),
				getIdentifierResult(),
				getDiscriminatorResult(),
				getVersionResult(),
				initializerCollector,
				creationState
		);

		return new EntityAssembler( getResultJavaTypeDescriptor(), initializer );
	}

	@Override
	protected EntityDiscriminatorMapping getDiscriminatorMapping(
			EntityMappingType entityDescriptor,
			TableGroup entityTableGroup) {
		final JoinedSubclassEntityPersister joinedSubclassEntityPersister = (JoinedSubclassEntityPersister) entityDescriptor;
		if ( joinedSubclassEntityPersister.hasSubclasses() ) {
			return joinedSubclassEntityPersister.getDiscriminatorMapping( entityTableGroup );
		}
		else {
			return null;
		}
	}
}
