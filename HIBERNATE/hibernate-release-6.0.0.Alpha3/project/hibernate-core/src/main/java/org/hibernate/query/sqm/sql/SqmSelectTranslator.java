/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.query.sqm.sql;

import org.hibernate.query.sqm.spi.JdbcParameterBySqmParameterAccess;
import org.hibernate.query.sqm.tree.select.SqmQuerySpec;
import org.hibernate.query.sqm.tree.select.SqmSelectStatement;
import org.hibernate.sql.ast.spi.FromClauseAccess;

/**
 * @author Steve Ebersole
 */
public interface SqmSelectTranslator extends SqmToSqlAstConverter, FromClauseAccess, JdbcParameterBySqmParameterAccess, SqmTranslator {
	SqmSelectTranslation translate(SqmSelectStatement sqmStatement);
	SqmQuerySpecTranslation translate(SqmQuerySpec sqmQuerySpec);
}
