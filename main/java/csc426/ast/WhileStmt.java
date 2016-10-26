package csc426.ast;

import csc426.parser.Position;

public final class WhileStmt extends Stmt {
	private final Expr test;
	private final Stmt body;

	public WhileStmt(Expr test, Stmt body, Position position) {
		super(position);
		this.test = test;
		this.body = body;
	}

}