/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.query.hql.internal;

import org.hibernate.query.hql.HqlLogger;

import org.jboss.logging.Logger;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

/**
 * Leverages Antlr to build a parse tree from an HQL query
 *
 * @author Steve Ebersole
 */
public class HqlParseTreeBuilder {
	private static final Logger LOGGER = HqlLogger.subLogger( "reservedWordAsIdentifier" );
	private static final boolean DEBUG_ENABLED = LOGGER.isDebugEnabled();

	/**
	 * Singleton access
	 */
	public static final HqlParseTreeBuilder INSTANCE = new HqlParseTreeBuilder();

	public HqlParser generateHqlParser(String hql) {
		// Build the lexer
		HqlLexer hqlLexer = new HqlLexer( CharStreams.fromString( hql ) );

		// Build the parser...
		return new HqlParser( new CommonTokenStream( hqlLexer ) ) {
			@Override
			protected void logUseOfReservedWordAsIdentifier(Token token) {
				if ( DEBUG_ENABLED ) {
					LOGGER.debugf( "Encountered use of reserved word as identifier : %s", token.getText() );
				}
			}
		};
	}
}
