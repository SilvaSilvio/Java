/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.sql.ast;

import org.hibernate.sql.ast.spi.SqlAstToJdbcOperationConverter;
import org.hibernate.sql.ast.spi.SqlAstWalker;
import org.hibernate.sql.ast.tree.cte.CteStatement;
import org.hibernate.sql.ast.tree.delete.DeleteStatement;
import org.hibernate.sql.exec.spi.JdbcDelete;

/**
 * @author Steve Ebersole
 */
public interface SqlAstDeleteTranslator extends SqlAstWalker, SqlAstToJdbcOperationConverter {
	JdbcDelete translate(DeleteStatement sqlAst);

	@Override
	JdbcDelete translate(CteStatement cteStatement);
}
