package csc426.ast;

import csc426.parser.Position;

/**
 * Base class for expression ASTs.
 */
public abstract class Expr extends AST {
	Expr(Position position) {
		super(position);
	}
}