// Yunning ZHOU, MACS. A Queue Class based on Circular Vector.
package dataStructure;

public class QueueCircularVector {
	private CircularVector data;

	public QueueCircularVector() {
		data = new CircularVector(10);
	}

	public void push(Object o) {
		// todo
		data.addLast(o);
	}

	public Object pop() {
		// todo
		Object o = data.getFirst();
		data.removeFirst();
		return o;
	}

	public Object top() {
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
