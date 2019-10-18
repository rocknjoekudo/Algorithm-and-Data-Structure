// Yunning ZHOU, MACS. A Dictionary Class based on Vector.
package dataStructure;

public class Dictionary {
	private class DictionaryPair implements Comparable{
		private Comparable key;
		private Object value;

		public DictionaryPair(Comparable someKey, Object someValue) {
			this.key = someKey;
			this.value = someValue;
		}

		public Comparable getKey() {
			return key;
		}

		public Object getValue() {
			return value;
		}

		public void setKey(Comparable newKey) {
			this.key = newKey;
		}

		public void setValue(Object newValue) {
			this.value = newValue;
		}

		public String toString() {
			String s = "[" + key.toString() + ", " + value.toString() + "]";
			return s;
		}

		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			return key.compareTo(((DictionaryPair) o).getKey());
		}
	}

	private Vector data;

	public Dictionary() {
		data = new Vector(10);
	}

	public void add(Comparable key, Object value) {
		int position = this.findPosition(key);
		if (position != -1) {
			((DictionaryPair) data.get(position)).setValue(value);
		} else {
			data.addLast(new DictionaryPair(key, value));
		}

	}

	public int findPosition(Comparable key) {
		int position = -1;
		for (int i = 0; i < data.size(); i++) {
			if (((DictionaryPair) data.get(i)).getKey().equals(key)) {
				position = i;
				break;
			}
		}
		return position;
	}

	public Object find(Comparable key) {
		Object o = null;
		int position = this.findPosition(key);
		if (position != -1) {
			o = ((DictionaryPair) data.get(position)).getValue();
		}
		return o;
	}

	public void remove(Comparable key) {
		int position = this.findPosition(key);
		if (position != -1) {
			data.removeElement(position);
		}
	}

	public int size() {
		return data.size();
	}

	public String toString() {
		return data.toString();
	}

}
