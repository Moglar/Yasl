package csc426.ast;

import csc426.parser.Position;

public final class StringItem extends Item {
	private final String message;

	public StringItem(String message, Position position) {
		super(position);
		this.message = message;
	}

}