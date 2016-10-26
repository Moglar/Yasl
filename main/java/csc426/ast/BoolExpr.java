package csc426.ast;

import csc426.parser.Position;

public final class BoolExpr extends Expr {
	private final boolean value;
	
	public BoolExpr(boolean value, Position position) {
		super(position);
		this.value = value;
	}

}