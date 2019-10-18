// Yunning ZHOU, MACS. A Stack class based on LinkedList.
package dataStructure;

public class StackLinkedList {
	private LinkedList data;

	public StackLinkedList() {
		// todo
		data = new LinkedList();
	}

	public void push(Comparable o) {
		// todo
		data.addFirst(o);
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