//Yunning ZHOU, MACS. A Priority Queue class based on Tree.
package dataStructure;

import java.util.Comparator;

public class PriorityQueueTree {
	private class PriorityPair implements Comparable {
		private Object element;
		private Comparable priority;

		public PriorityPair(Object element, Comparable priority) {
			this.element = element;
			this.priority = priority;
		}

		public int compareTo(Object o) {
			PriorityPair p2 = (PriorityPair) o;
			return priority.compareTo(p2.priority);
		}

		public String toString() {
			return "(" + element + ", " + priority + ")";
		}
	}

	private Tree data;

	public PriorityQueueTree() {
		data = new Tree();
	}

	public void push(Object o, int priority) {
		// make a pair of o and priority
		// add this pair to the sorted linked list .
		data.insert(new PriorityPair(o, priority));
	}

	public Object pop() {
		// add your code here
		PriorityPair p = (PriorityPair) data.maxNode();
		Object o = p.element;
		data.remove(p);
		return o;

	}

	public Object top() {
		// add your code here
		return ((PriorityPair) data.maxNode()).element;
	}

	public String toString() {
		return data.toString();
	}
}
