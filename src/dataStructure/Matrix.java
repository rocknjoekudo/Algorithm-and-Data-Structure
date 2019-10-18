// Yunning ZHOU, MACS. A Matrix class based on two-dimensional array of JAVA.
package dataStructure;

public class Matrix {
	// some appropriate private members.
	private double data[][];
	private int size;

	public Matrix(int nrNodes) {
		// allocate an N-by-N matrix where N = nrNodes
		// all elements are initially 0
		size = nrNodes;
		data = new double[nrNodes][nrNodes];
		for (int i = 0; i <= nrNodes - 1; i++) {
			for (int j = 0; j <= nrNodes - 1; j++) {
				data[i][j] = 0;
			}
		}
	}

	public void set(int row, int col, double weight) {
		// store the weight at the given row and column.
		data[row][col] = weight;
	}

	public Comparable get(int row, int col) {
		// return the weight at the given row and column.
		return data[row][col];
	}
	
	public String toString() {
		String s = "[";
		for (int i = 0; i <= size - 1; i++) {
			for (int j = 0; j <= size - 1; j++) {
				s = s + "(" + data[i][j] + ") ";
			}
			s += "\n";
		}
		s += "]";
		return s;		
	}
	
	
}