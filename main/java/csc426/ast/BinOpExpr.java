package csc426.ast;

import csc426.parser.Position;

/**
 *  Glue these Ops together. OOOOHH that looks much nicer.
 */

public final class BinOpExpr extends Expr {
	private final Expr left;
	private final Op2 op;
	private final Expr right;

	public BinOpExpr(Expr left, Op2 op, Expr right, Position position) {
		super(position);
		this.left = left;
		this.op = op;
		this.right = right;
	}

}