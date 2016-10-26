package csc426.ast;

import csc426.parser.Position;

public final class IfThenStmt extends Stmt {
	private final Expr test;
	private final Stmt trueClause;

	public IfThenStmt(Expr test, Stmt trueClause, Position position) {
		super(position);
		this.test = test;
		this.trueClause = trueClause;
	}

}