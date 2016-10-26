package csc426.ast;

import csc426.parser.Position;

public final class NumExpr extends Expr {
	private final int value;

	public NumExpr(int value, Position position) {
		super(position);
		this.value = value;
	}

}