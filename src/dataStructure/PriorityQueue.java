// Yunning ZHOU, MACS. A Priority Queue class.
package dataStructure;

import java.util.Comparator;

public class PriorityQueue {
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

	public PriorityQueue() {
		data = new LinkedList();
	}

	public void push(Object o, int priority) {
		// make a pair of o and priority
		// add this pair to the sorted linked list .
		data.addSorted(new PriorityPair(o, priority));
	}

	public Object pop() {
		// add your code here
		Object o = ((PriorityPair)data.getFirst()).element;
		data.removeFirst();
		return o;
		
	}

	public Object top() {
		// add your code here
		return ((PriorityPair)data.getFirst()).element;
	}
	
	public String toString() {
		return data.toString();
	}
}
