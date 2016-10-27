package csc426.parser;


public class Token {
	/**
	 * Construct a Token object given its components.
	 */
	public Token(Position position, TokenType type, String lexeme) {
		this.position = position;
		this.type = type;
		this.lexeme = lexeme;
	}

	// Override the default toString() for use in development and debugging.
	public String toString() {
		StringBuilder result = new StringBuilder(type.toString());
		if (type == TokenType.ID || type == TokenType.NUM || type == TokenType.STRING) {
			result.append(" ").append(lexeme);
		}
		result.append(" ").append(position);
		return result.toString();
	}

	public final Position position;
	public final TokenType type;
	public final String lexeme;
}
