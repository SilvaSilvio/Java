/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.query;

import java.util.Objects;

import org.hibernate.DotIdentifierSequence;
import org.hibernate.internal.util.StringHelper;
import org.hibernate.metamodel.model.domain.NavigableRole;

/**
 * A representation of the path to a particular Navigable
 * as part of a query relative to a "navigable root".
 *
 * @see NavigableRole
 *
 * @author Steve Ebersole
 */
public class NavigablePath implements DotIdentifierSequence {
	public static final String IDENTIFIER_MAPPER_PROPERTY = "_identifierMapper";

	private final NavigablePath parent;
	private final String fullPath;

	private final int hashCode;

	public NavigablePath(NavigablePath parent, String navigableName) {
		this.parent = parent;

		// the _identifierMapper is a "hidden property" on entities with composite keys.
		// concatenating it will prevent the path from correctly being used to look up
		// various things such as criteria paths and fetch profile association paths
		if ( IDENTIFIER_MAPPER_PROPERTY.equals( navigableName ) ) {
			this.fullPath = parent != null ? parent.getFullPath() : "";
		}
		else {
			if ( parent != null ) {
				final String parentFullPath = parent.getFullPath();
				this.fullPath = StringHelper.isEmpty( parentFullPath )
						? navigableName
						: parentFullPath + "." + navigableName;
			}
			else {
				this.fullPath = navigableName;
			}
		}

		this.hashCode = fullPath.hashCode();
	}

	public NavigablePath(String localName) {
		this( localName, null );
	}

	public NavigablePath(String rootName, String alias) {
		this.parent = null;

		this.fullPath = alias == null ? rootName : rootName + "(" + alias + ")";

		this.hashCode = fullPath.hashCode();
	}

	public NavigablePath() {
		this( "" );
	}

	public NavigablePath append(String property) {
		return new NavigablePath( this, property );
	}

	public NavigablePath append(String property, String alias) {
		return new NavigablePath( this, property );
	}

	public NavigablePath getParent() {
		return parent;
	}

	public String getLocalName() {
		return parent == null ? fullPath : StringHelper.unqualify( fullPath );
	}

	public String getFullPath() {
		return fullPath;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[" + fullPath + "]";
	}

	@Override
	public int hashCode() {
		return hashCode;
	}

	@Override
	public boolean equals(Object o) {
		if ( this == o ) {
			return true;
		}
		if ( o == null || getClass() != o.getClass() ) {
			return false;
		}

		final NavigablePath other = (NavigablePath) o;
		return Objects.equals( getFullPath(), other.getFullPath() );
	}
}
