package csc426.ast;

import csc426.parser.Position;

public final class ConstDecl extends AST {
	private final String id;
	private final int value;

	public ConstDecl(String id, int value, Position position) {
		super(position);
		this.id = id;
		this.value = value;
	}

}