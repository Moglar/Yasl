package csc426.ast;

import java.util.List;

import csc426.parser.Position;

public final class ProcDecl extends AST {
	private final String id;
	private final List<Param> params;
	private final Block block;

	public ProcDecl(String id, List<Param> params, Block block, Position position) {
		super(position);
		this.id = id;
		this.params = params;
		this.block = block;
	}

}