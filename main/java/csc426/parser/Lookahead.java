package csc426.parser;

import java.io.IOException;
import java.util.EnumSet;

/**
 * This is a wrapper class around a Lexer. It provides us with methods to check the next token
 * and compare it to the current token for correct parsing.
 */
public class Lookahead {
	public Lookahead(Lexer lexer, ErrorLog log) {
		this.lexer = lexer;
		this.log = log;
		this.current = lexer.next();
	}

	public Token current() {
		return current;
	}

	public boolean check(TokenType type) {
		return current.type == type;
	}

	public Token match(TokenType type) {
		if (current.type == type) {
			return skip();
		} else {
			log.add("Error: Expected a " + type + ", found " + current);
			return new Token(current.position, type, "");
		}
	}

	public Token skip() {
		Token token = current;
		current = lexer.next();
		return token;
	}

	public void close() {
		try {
			lexer.close();
		} catch (IOException e) {
			log.add(e.getMessage());
		}
	}

	public void logError(String message) {
		log.add(message);
	}


	public void synchronize(EnumSet<TokenType> valid, EnumSet<TokenType> stop) {
		if (valid.contains(current.type)) {
			return;
		}
		log.add("Error: Unexpected token " + current);
		while (!valid.contains(current.type) && !stop.contains(current.type)) {
			current = lexer.next();
		}
	}

	private Lexer lexer;
	private ErrorLog log;
	private Token current;
}
