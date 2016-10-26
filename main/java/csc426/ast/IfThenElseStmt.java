package csc426.ast;

import csc426.parser.Position;

public final class IfThenElseStmt extends Stmt {
	private final Expr test;
	private final Stmt trueClause;
	private final Stmt falseClause;

	public IfThenElseStmt(Expr test, Stmt trueClause, Stmt falseClause, Position position) {
		super(position);
		this.test = test;
		this.trueClause = trueClause;
		this.falseClause = falseClause;
	}

}