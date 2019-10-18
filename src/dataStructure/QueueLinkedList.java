//Yunning ZHOU, MACS. A Queue class based on LinkedList.
package dataStructure;

public class QueueLinkedList {
	private LinkedList data;

	public QueueLinkedList() {
		data = new LinkedList();
	}

	public void push(Comparable o) {
		// todo
		data.addFirst(o);
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