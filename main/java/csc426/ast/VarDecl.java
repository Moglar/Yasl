package csc426.ast;

import csc426.parser.Position;

public final class VarDecl extends AST {
	private final String id;
	private final Type type;

	public VarDecl(String id, Type type, Position position) {
		super(position);
		this.id = id;
		this.type = type;
	}

}