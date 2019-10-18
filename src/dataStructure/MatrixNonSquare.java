// Yunning ZHOU, MACS. A Non-Squared Matrix class based on two-dimensional array of JAVA.
package dataStructure;

public class MatrixNonSquare {
	// some appropriate private members.
	private Object data[][];
	private int row;
	private int column;

	public MatrixNonSquare(int row, int column) {
		// allocate an N-by-N matrix where N = nrNodes
		// all elements are initially 0
		this.row = row;
		this.column = column;
		data = new Object[row][column];
		for (int i = 0; i <= row - 1; i++) {
			for (int j = 0; j <= column - 1; j++) {
				data[i][j] = null;
			}
		}
	}

	public void set(int row, int col, Object o) {
		// store the weight at the given row and column.
		data[row][col] = o;
	}

	public Object get(int row, int col) {
		// return the weight at the given row and column.
		return data[row][col];
	}
	
	public int size() {
		return row * column;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getColumn(){
		return column;
	}
	
	public String toString() {
		String s = "[";
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= column - 1; j++) {
				s = s + "(" + data[i][j] + ") ";
			}
			s += "\n";
		}
		s += "]";
		return s;		
	}
	
	
}