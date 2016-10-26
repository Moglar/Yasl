package csc426.ast;

import csc426.parser.Position;

/**
 * Print Items class.
 */
public abstract class Item extends AST {
	Item(Position position) {
		super(position);
	}
}