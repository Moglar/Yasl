package csc426.ast;

import csc426.parser.Position;

public final class Param extends AST {
	private final String id;
	private final Type type;
	private final boolean isVar;

	public Param(String id, Type type, Position position, boolean isVar) {
		super(position);
		this.id = id;
		this.type = type;
		this.isVar = isVar;
	}

}