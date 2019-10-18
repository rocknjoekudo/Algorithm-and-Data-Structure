// Yunning ZHOU, MACS. A Double Linked List Class.
package dataStructure;

public class DoubleLinkedList {
	private class DoubleLinkedListElement {
		private Object data;
		private DoubleLinkedListElement nextElement;
		private DoubleLinkedListElement previousElement;

		public DoubleLinkedListElement(Object v, DoubleLinkedListElement next, DoubleLinkedListElement previous) {
			data = v;
			nextElement = next;
			previousElement = previous;
			if (nextElement != null)
				nextElement.previousElement = this;
			if (previousElement != null)
				previousElement.nextElement = this;
		}

		public DoubleLinkedListElement(Object v) {
			this(v, null, null);
		}

		public DoubleLinkedListElement previous() {
			return previousElement;
		}

		public Object value() {
			return data;
		}

		public DoubleLinkedListElement next() {
			return nextElement;
		}

		public void setNext(DoubleLinkedListElement value) {
			nextElement = value;
		}

		public void setPrevious(DoubleLinkedListElement value) {
			previousElement = value;
		}
	}

	private int count;
	private DoubleLinkedListElement head;
	private DoubleLinkedListElement tail;

	public DoubleLinkedList() {
		head = null;
		tail = null;
		count = 0;
	}

	public Object getFirst() {
		return head.value();
	}

	public Object getLast() {
		return tail.value();
	}

	public int size() {
		return count;
	}

	public void addFirst(Object value) {
		head = new DoubleLinkedListElement(value, head, null);
		if (tail == null)
			tail = head;
		count++;
	}

	public void addLast(Object value) {
		tail = new DoubleLinkedListElement(value, null, tail);
		if (head == null)
			head = tail;
		count++;
	}

	public void removeFirst() {
		head = head.next();
		if (head == null)
			tail = null;
		else
			head.setPrevious(null);
		count--;
	}

	public void removeLast() {
		tail = tail.previous();
		if (tail == null)
			head = null;
		else
			tail.setNext(null);
		count--;
	}

	public void reverse() { // Regard one DoubleLinkedList as two separate LinkedLists.
		if (head != null && tail != null) {
			DoubleLinkedListElement currentHead = head;
			DoubleLinkedListElement currentTail = tail;
			DoubleLinkedListElement previousHead = null;
			DoubleLinkedListElement previousTail = null;
			DoubleLinkedListElement nextHead = null;
			DoubleLinkedListElement nextTail = null;
			while (currentHead != null) {
				nextHead = currentHead.next();
				currentHead.setNext(previousHead);
				previousHead = currentHead;
				currentHead = nextHead;
			}
			head = previousHead;
			while (currentTail != null) {
				previousTail = currentTail.previous();
				previousTail.setPrevious(previousTail);
				previousTail = currentTail;
				currentTail = nextTail;
			}
			tail = nextTail;
		}

	}

	public void print() {
		DoubleLinkedListElement d = head;
		System.out.print("(");
		while (d != null) {
			System.out.print(d.value() + " ");
			d = d.next();
		}
		System.out.println(")");
	}

	public void printReverse() {
		DoubleLinkedListElement t = tail;
		System.out.print("(");
		while (t != null) {
			System.out.print(t.value() + " ");
			t = t.previous();
		}
		System.out.println(")");
	}

	public String toString() {
		DoubleLinkedListElement d = head;
		String s = "(";
		while (d != null) {
			s = s + d.value() + " ";
			d = d.next();
		}
		s = s + ")";
		return s;
	}
}