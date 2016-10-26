package csc426.ast;

import csc426.parser.Position;

public final class ExprItem extends Item {
	private final Expr expr;

	public ExprItem(Expr expr, Position position) {
		super(position);
		this.expr = expr;
	}

}