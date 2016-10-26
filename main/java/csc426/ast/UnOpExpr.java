package csc426.ast;

import csc426.parser.Position;

public final class UnOpExpr extends Expr {
	private final Op1 op;
	private final Expr expr;

	public UnOpExpr(Op1 op, Expr expr, Position position) {
		super(position);
		this.op = op;
		this.expr = expr;
	}

}