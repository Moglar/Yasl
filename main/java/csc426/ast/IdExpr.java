package csc426.ast;

import csc426.parser.Position;

public final class IdExpr extends Expr {
	private final String id;

	public IdExpr(String id, Position position) {
		super(position);
		this.id = id;
	}

}