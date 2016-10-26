package csc426.ast;

import java.util.List;

import csc426.parser.Position;

public final class CallStmt extends Stmt {
	private final String id;
	private final List<Expr> args;

	public CallStmt(String id, List<Expr> args, Position position) {
		super(position);
		this.id = id;
		this.args = args;
	}

}