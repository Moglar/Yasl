package csc426.ast;

import csc426.parser.Position;

public final class AssignStmt extends Stmt {
	private final String id;
	private final Expr expr;

	public AssignStmt(String id, Expr expr, Position position) {
		super(position);
		this.id = id;
		this.expr = expr;
	}

}