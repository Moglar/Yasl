package csc426.ast;

import java.util.List;

import csc426.parser.Position;

public final class SequenceStmt extends Stmt {
	private final List<Stmt> body;

	public SequenceStmt(List<Stmt> body, Position position) {
		super(position);
		this.body = body;
	}

}