//Yunning ZHOU, MACS. A Queue class based on Vector.
package dataStructure;

public class Queue {
	private Vector data;

	public Queue() {
		data = new Vector(1);
	}

	public void push(Comparable o) {
		// todo
		data.addLast(o);
	}

	public Comparable pop() {
		// todo
		Comparable o = data.getFirst();
		data.removeFirst();
		return o;
	}

	public Comparable top() {
		// todo
		return data.getFirst();
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