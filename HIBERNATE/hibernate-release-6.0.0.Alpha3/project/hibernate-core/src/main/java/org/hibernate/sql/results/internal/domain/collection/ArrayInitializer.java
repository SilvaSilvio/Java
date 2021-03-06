/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.sql.results.internal.domain.collection;

import org.hibernate.LockMode;
import org.hibernate.collection.internal.PersistentArrayHolder;
import org.hibernate.internal.log.LoggingHelper;
import org.hibernate.metamodel.mapping.PluralAttributeMapping;
import org.hibernate.query.NavigablePath;
import org.hibernate.sql.results.spi.DomainResultAssembler;
import org.hibernate.sql.results.spi.FetchParentAccess;
import org.hibernate.sql.results.spi.RowProcessingState;

/**
 * @author Chris Cranford
 */
public class ArrayInitializer extends AbstractImmediateCollectionInitializer {
	private final DomainResultAssembler listIndexAssembler;
	private final DomainResultAssembler elementAssembler;

	private final int indexBase;

	public ArrayInitializer(
			NavigablePath navigablePath,
			PluralAttributeMapping arrayDescriptor,
			FetchParentAccess parentAccess,
			boolean selected,
			LockMode lockMode,
			DomainResultAssembler keyContainerAssembler,
			DomainResultAssembler keyCollectionAssembler,
			DomainResultAssembler listIndexAssembler,
			DomainResultAssembler elementAssembler) {
		super(
				navigablePath,
				arrayDescriptor,
				parentAccess,
				selected,
				lockMode,
				keyContainerAssembler,
				keyCollectionAssembler
		);
		this.listIndexAssembler = listIndexAssembler;
		this.elementAssembler = elementAssembler;

		this.indexBase = getCollectionAttributeMapping().getIndexMetadata().getListIndexBase();
	}

	@Override
	public PersistentArrayHolder getCollectionInstance() {
		return (PersistentArrayHolder) super.getCollectionInstance();
	}

	@Override
	protected void readCollectionRow(RowProcessingState rowProcessingState) {
		int index = (int) listIndexAssembler.assemble( rowProcessingState );
		if ( indexBase != 0 ) {
			index -= indexBase;
		}
		getCollectionInstance().load( index, elementAssembler.assemble( rowProcessingState ) );
	}

	@Override
	public String toString() {
		return "ArrayInitializer{" + LoggingHelper.toLoggableString( getNavigablePath() ) + ")";
	}
}
