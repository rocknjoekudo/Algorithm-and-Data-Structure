// Yunning ZHOU, MACS. A LinkedList class.
package dataStructure;

import java.util.Comparator;

public class LinkedList {

	private class ListElement implements Comparable {
		private Comparable el1;
		private ListElement el2; // A recursive class for definition of ListElement

		public ListElement(Comparable el, ListElement nextElement) {
			el1 = el;
			el2 = nextElement;
		}

		public ListElement(Comparable el) {
			this(el, null);
		} // "this" will call corresponding constructors in the same class, which means
			// "ListElement(el, null)" in this case.

		public Comparable first() {
			return el1;
		}

		public ListElement rest() {
			return el2;
		}

		public void setFirst(Comparable value) {
			el1 = value;
		}

		public void setRest(ListElement value) {
			el2 = value;
		}

		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			return el1.compareTo(((ListElement) o).el1);
		}
	}

	private ListElement head;

	public LinkedList() {
		head = null;
	}

	public void addFirst(Comparable o) {
		head = new ListElement(o, head);
	}

	public void addLast(Comparable o) {
		if (head == null) {
			this.addFirst(o);
		} else {
			ListElement d = head;
			while (d.rest() != null) {
				d = d.rest();
			}
			d.setRest(new ListElement(o));
		}
	}

	public void addSorted(Comparable o) {
		// an empty list , add element in front
		if (head == null)
			head = new ListElement(o, null);
		else if (head.first().compareTo(o) < 0) {
			// we have to add the element in front
			head = new ListElement(o, head);
		} else {
			// we have to find the first element which is bigger
			ListElement d = head;
			while ((d.rest() != null) && (d.rest().first().compareTo(o) > 0)) {
				d = d.rest();
			}
			ListElement next = d.rest();
			d.setRest(new ListElement(o, next));
		}
	}

	public Comparable getMax() {
		Comparable max = head.first();
		ListElement d = head;
		while (d != null) {
			if (max.compareTo(d.first()) < 0) {
				max = d.first();
			}
			d = d.rest();
		}
		return max;
	}

	public Comparable getRemoveMax() {
		Comparable max = head.first();
		ListElement d = head;
		if (d.rest() != null) { // Case 1: There are at least two elements
			ListElement previousofmax = head; // A pointer to the previous element of the max one
			while (d.rest() != null) { // Searching for the position of the max element, and record the max value.
				if (max.compareTo(d.rest().first()) < 0) { // Comparison of the candidate max and current element
					max = d.rest().first();
					previousofmax = d;
				}
				d = d.rest();

			}
			if (previousofmax.rest() != null && !head.first().equals(max)) { // Case 1.1: if the max element is not the
																				// first or the last
				previousofmax.setRest(previousofmax.rest().rest());
			} else if (head.first().equals(max)) { // Case 1.2: if the max element is the first one.
				this.removeFirst();
			} else { // Case 1.3: if the max one is the last one.
				previousofmax.setRest(null);
			}

		} else { // Case 2: if there is only one element
			this.removeFirst();
		}
		return max;

	}

	public Comparable getFirst() {
		return head.first();
	}

	public Comparable getLast() {
		ListElement d = head;
		while (d.rest() != null) {
			d = d.rest();
		}
		return d.first();
	}

	public void removeFirst() {
		head = head.rest();

	}

	public void removeLast() {
		ListElement d = head;
		if (head != null) {
			while (d.rest().rest() != null) {
				d = d.rest();
			}
			d.setRest(null);

		}

	}

	public Comparable get(int n) {
		ListElement d = head;
		while (n > 0) {
			d = d.rest();
			n--;
		}
		return d.first();
	}

	public int size() {
		ListElement d = head;
		int size = 0;
		while (d != null) {
			d = d.rest();
			size++;
		}
		return size;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void set(int n, Comparable o) {
		ListElement d = head;
		for (int i = 0; i < n; i++) {
			d = d.rest();
		}
		d.setFirst(o);
	}

	public boolean contains(Comparable o) {
		ListElement d = head;
		boolean b = false;
		while (d != null) {
			if (d.first() == o) {
				b = true;
				break;
			} else {
				d = d.rest();
			}
		}
		return b;
	}
	
	public Comparable contains2(Comparable o) {
		ListElement d = head;
		Comparable res = null;
		while (d != null) {
			if (d.first().compareTo(o) == 0) {
				res = d.first();
				break;
			}
			else {
				d = d.rest();
			}
		}
		return res;
	}

	public LinkedList insertionSort() {
		LinkedList result = new LinkedList();
		ListElement d = head;
		while (d != null) {
			result.addSorted(d.el1);
			d = d.rest();
		}
		return result;
	}

	// O(n). After drawing several times, finally I came up with this code.
	public void fropple() {
		ListElement current = head;
		ListElement previous = head;
		while (current != null && current.rest() != null) {
			ListElement next = current.rest();
			ListElement rest = next.rest();
			next.setRest(current);
			current.setRest(rest);
			if (current == head) {
				head = next;
			} else {
				previous.setRest(next);
			}
			previous = current;
			current = rest;
		}

	}

	public void append(LinkedList list2) {
		ListElement d1 = head;
		ListElement d2 = list2.head;
		while (d1.rest() != null) {
			d1 = d1.rest();
		}
		while (d2 != null) {
			d1.setRest(new ListElement(d2.first()));
			d1 = d1.rest();
			d2 = d2.rest();
		}
	}

	public void reverse() { // The solution is from the Internet, much smarter than mine.
		if (head != null) {
			ListElement current = head;
			ListElement previous = null;
			ListElement next = null;
			while (current != null) {
				next = current.rest();
				current.setRest(previous);
				previous = current;
				current = next;

			}
			head = previous;
		}

	}

	public String toString() {
		String s = "(";
		ListElement d = head;
		while (d != null) {
			s += d.first().toString();
			s += " ";
			d = d.rest();
		}
		s += ")";
		return s;
	}

}
