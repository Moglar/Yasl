package csc426.ast;

import csc426.parser.Position;

/**
 * Base class for Tree Nodes. Keeps track of a position.
 */
public abstract class AST {
	public Position position;

	AST(Position position) {
		this.position = position;
	}

}
