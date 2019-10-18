// Yunning ZHOU, MACS. A Stack class based on Vector.
package dataStructure;

public class Stack {
	private Vector data;

	public Stack() {
		// todo
		data = new Vector(1);
	}

	public void push(Comparable o) {
		// todo
		data.addLast(o);
	}

	public Comparable pop() {
		// todo
		Comparable o = data.getLast();
		data.removeLast();
		return o;
	}

	public Comparable top() {
		// todo
		return data.getLast();
	}

	public int size() {
		// todo
		return data.size();
	}

	public boolean empty() {
		// todo
		return data.isEmpty();
	}

	public String toString() {
		return data.toString();
	}

}