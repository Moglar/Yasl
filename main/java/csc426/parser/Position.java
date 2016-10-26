package csc426.parser;

/**
 * Represent a location (line:column number) in the source file.
 */
public class Position {
	private final int line;
    private final int column;
	
	public Position(int line, int column) {
		this.line = line;
		this.column = column;
	}

	@Override
	public String toString() {
		return line + ":" + column;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + column;
		result = prime * result + line;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Position other = (Position) obj;
        return column == other.column && line == other.line;
    }
}
