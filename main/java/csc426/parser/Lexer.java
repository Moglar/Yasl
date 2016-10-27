package csc426.parser;

import java.io.IOException;
import java.io.Reader;

/**
 * A Lexical Analyzer for YASL. Uses a (Mealy) state machine to
 * extract the next available token from the input each time next() is called.
 */
public class Lexer {
	public Lexer(Reader in, ErrorLog log) {
		source = new Source(in);
		this.log = log;
	}
	/**
	 * Extract the next available token. When the input is exhausted, it will
	 * return an EOF token on all future calls.
	 * 
	 * @return the next Token object
	 */
	public Token next() {
		State state = State.INITIAL_STATE;

		while (state != State.FINAL_STATE) {
			state = State.doTransitionStep(state, source, log);
		}

		return State.currentToken();
	}
	/**
	 * Close the underlying Reader.
	 * 
	 * @throws IOException
	 */
	public void close() throws IOException {
		source.close();
	}

	private Source source;
	private ErrorLog log;
}
