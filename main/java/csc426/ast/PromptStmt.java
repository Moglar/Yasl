package csc426.ast;

import csc426.parser.Position;

public final class PromptStmt extends Stmt {
	private final String message;

	public PromptStmt(String message, Position position) {
		super(position);
		this.message = message;
	}

}