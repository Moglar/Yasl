package csc426.ast;

import csc426.parser.Position;

public final class Program extends AST {
	private final String name;
	private final Block block;

	public Program(String name, Block block, Position position) {
		super(position);
		this.name = name;
		this.block = block;
	}

}