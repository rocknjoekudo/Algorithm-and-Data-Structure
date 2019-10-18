// Yunning ZHOU, MACS. A Dictionary Class based on Tree.
package dataStructure;

public class DictionaryTree {
	private class DictionaryPair implements Comparable {
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
			String s = "[" + value.toString() + "]";
			return s;
		}

		@Override
		public int compareTo(Object p2) {
			// TODO Auto-generated method stub
			return key.compareTo(((DictionaryPair) p2).key);
		}
	}

	private Tree data;

	public DictionaryTree() {
		data = new Tree();
	}

	public void add(Comparable key, Object value) {
		Tree.TreeNode n = data.find(new DictionaryPair(key, null));
		if (n == null) {
			data.insert(new DictionaryPair(key, value));
		}
		else {
			((DictionaryPair) n.value).setValue(value);
		}
		
	}

	public Object findKey(Comparable key) {
		Tree.TreeNode n = data.find(new DictionaryPair(key, null));
		if (n == null) {
			return null;
		} else {
			return ((DictionaryPair) n.value).getValue();
		}
	}

	public void remove(Comparable key) {
		data.remove(new DictionaryPair(key, null));
	}

	public int size() {
		return data.size();
	}

	public String toString() {
		return data.toString();
	}

}
