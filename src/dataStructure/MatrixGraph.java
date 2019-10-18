// Yunning ZHOU, MACS. A MatrixGraph Class based on Matrix.
package dataStructure;

public class MatrixGraph {
	private Matrix data;

	public MatrixGraph(int nrNodes) {
		data = new Matrix(nrNodes);
	}

	public void addEdge(int from, int to, double w) {
		data.set(from, to, w);
	}

	public double getEdge(int from, int to) {
		return (Double) data.get(from, to);
	}
	
	public String toString() {
		return data.toString();
	}
	
	public void print() {
		System.out.println(data);
	}
}