// Yunning ZHOU, MACS. A Priority Queue class without sorting elements when being added.
// This class is not for practical use but for assignments.
package dataStructure;

import java.util.Comparator;

public class PriorityQueueUnsorted {

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

	private LinkedList data;

	public PriorityQueueUnsorted() {
		data = new LinkedList();
	}

	public void push(Object o, int priority) {
		data.addFirst(new PriorityPair(o, priority));
	}

	public Object pop() {
		return ((PriorityPair) data.getRemoveMax()).element;
	}

	public Object top() {
		return ((PriorityPair) data.getMax()).element;
	}

	public String toString() {
		return data.toString();
	}

}
