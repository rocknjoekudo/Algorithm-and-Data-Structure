// Yunning ZHOU, MACS. A Circular Vector Class.
package dataStructure;

public class CircularVector {
	private Object data[];
	private int first;
	private int count;
	private int capacity;

	public CircularVector(int capacity) {
		count = 0;
		first = 0;
		data = new Object[capacity];
		this.capacity = capacity;
	}

	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		return (count == 0);
	}

	public void addFirst(Object element) {
		// add your code here
		if (count == 0) {
			data[0] = element;
		}
		else {
			first = (first + capacity - 1) % capacity;
			data[first] = element;
		}
		count++;
	}

	public void addLast(Object element) {
		// add your code here
		data[(first + count) % capacity] = element;
		count++;
	}

	public Object getFirst() {
		// add your code
		return data[first];
		
	}

	public Object getLast() {
		// add your code
		return data[(first + count) % capacity];
	}

	public void removeFirst() {
		if (count > 0) {
			first = (first + 1) % capacity;
			count--;
		}
	}

	public void removeLast() {
		// add your code
		if (count > 0) {
			count--;
		}
	}

	public String toString() {
		String s = "[";
		for (int i = 0; i < count; i++) {
			s = s + data[(first + i) % capacity] + " ";
		}
		s = s + "]";
		return s;
	}
}