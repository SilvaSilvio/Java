/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.sql.ast;

import org.hibernate.sql.ast.tree.cte.CteStatement;
import org.hibernate.sql.ast.tree.update.UpdateStatement;
import org.hibernate.sql.exec.spi.JdbcUpdate;

/**
 * @author Steve Ebersole
 */
public interface SqlAstUpdateTranslator extends SqlAstTranslator {
	JdbcUpdate translate(UpdateStatement sqlAst);

	@Override
	JdbcUpdate translate(CteStatement cteStatement);
}
