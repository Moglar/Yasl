package csc426.ast;

import java.util.List;

import csc426.parser.Position;

public final class PrintStmt extends Stmt {
	private final List<Item> items;

	public PrintStmt(List<Item> items, Position position) {
		super(position);
		this.items = items;
	}

}