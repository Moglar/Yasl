package csc426.ast;

import csc426.parser.Position;

/**
 * Base statement class.
 */
public abstract class Stmt extends AST {
	Stmt(Position position) {
		super(position);
	}
}