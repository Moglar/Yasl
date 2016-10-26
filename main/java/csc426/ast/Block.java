package csc426.ast;

import java.util.List;

import csc426.parser.Position;

/**
 * Let's keep track of things like vars, conts, etc.... In case we need to use them later...
 */

public final class Block extends AST {
	private final List<ConstDecl> consts;
	private final List<VarDecl> vars;
	private final List<ProcDecl> procs;
	private final List<Stmt> stmts;

	public Block(List<ConstDecl> consts, List<VarDecl> vars, List<ProcDecl> procs, List<Stmt> stmts, Position position) {
		super(position);
		this.consts = consts;
		this.vars = vars;
		this.procs = procs;
		this.stmts = stmts;
	}

}