package csc426.ast;

import csc426.parser.Position;

public final class Prompt2Stmt extends Stmt {
	private final String message;
	private final String id;

	public Prompt2Stmt(String message, String id, Position position) {
		super(position);
		this.message = message;
		this.id = id;
	}

}