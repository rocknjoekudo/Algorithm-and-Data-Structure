// Yunning ZHOU, MACS. A Tree class with parent node implementation and deleting method, which is different from the template codes.
package dataStructure;

import java.util.Comparator;

public class Tree {
	/*
	 * private class NaturalComparator implements Comparator { public int
	 * compare(Object a, Object b) { return ((Comparable)a).compareTo(b); } }
	 */
	// the class for implementing a node in the tree.
	// contains a value, a pointer to the left child and a pointer to the right
	// child

	public class TreeNode implements Comparable {
		protected Comparable value;
		protected TreeNode leftNode;
		protected TreeNode rightNode;
		protected TreeNode parentNode;

		public TreeNode(Comparable v, TreeNode left, TreeNode right, TreeNode parent) {
			value = v;
			leftNode = left;
			rightNode = right;
			parentNode = parent;
		}

		public TreeNode(Comparable v) {
			this(v, null, null, null);
		}

		public TreeNode getLeftTree() {
			return leftNode;
		}

		public TreeNode getRightTree() {
			return rightNode;
		}

		public TreeNode getParent() {
			return parentNode;
		}

		public Comparable getValue() {
			return value;
		}

		@Override
		public int compareTo(Object arg0) {
			// TODO Auto-generated method stub
			return value.compareTo(((TreeNode) arg0).getValue());
		}

		public String toString() {
			return value.toString();
		}

	}

	// start of the actual tree class

	// the root of our tree
	protected TreeNode root;

	public Tree() {
		root = null;
	}

	public void traverse(TreeAction action) {
		Queue t = new Queue();
		// Stack t = new Stack();
		t.push(root);
		while (!t.empty()) {
			TreeNode n = (TreeNode) t.pop();
			action.run(n);

			if (n.getLeftTree() != null)
				t.push(n.getLeftTree());
			if (n.getRightTree() != null)
				t.push(n.getRightTree());
		}
	}

	public void traverseNode(TreeNode n, TreeAction action) {
		if (n != null) {
			if (n.getLeftTree() != null)
				traverseNode(n.getLeftTree(), action);
			action.run(n);
			if (n.getRightTree() != null)
				traverseNode(n.getRightTree(), action);
		}
	}

	public void traverseInOrder(TreeAction action) {
		traverseNode(root, action);
	}

	public void print() {
		Queue t = new Queue();
		t.push(root);
		while (!t.empty()) {
			TreeNode n = (TreeNode) t.pop();
			System.out.println(n.value);
			if (n.getRightTree() != null)
				t.push(n.getRightTree());
			if (n.getLeftTree() != null)
				t.push(n.getLeftTree());
		}
	}

	public void printAnonymous() {
		traverse(new TreeAction() {
			public void run(TreeNode n) {
				System.out.println(n.value);
			}
		});
	}

	public void insert(Comparable element) {
		insertAtNode(element, root, null);
	}

	
	// Modified to be adapted to the implementation with parentNode.
	// we traverse the tree.
	// Current holds the pointer to the TreeNode we are currently checking
	// Parent holds the pointer to the parent of the current TreeNode
	private void insertAtNode(Comparable element, TreeNode current, TreeNode parent) {
		// if the node we check is empty
		if (current == null) {
			TreeNode newNode = new TreeNode(element);
			// the current node is empty, but we have a parent
			if (parent != null) {
				// do we add it to the left?
				if (element.compareTo(parent.value) < 0) {
					parent.leftNode = newNode;
				}
				// or do we add it to the right?
				else {
					parent.rightNode = newNode;
				}
			}
			// the current node is empty and it has no parent, we actually have an empty
			// tree
			else
				root = newNode;
				newNode.parentNode = parent;
		} else if (element.compareTo(current.value) == 0) {
			// if the element is already in the tree, what to do?
		}
		// if the element is smaller than current, go left
		else if (element.compareTo(current.value) < 0) {
			insertAtNode(element, current.getLeftTree(), current);
		}
		// if the element is bigger than current, go right
		else
			insertAtNode(element, current.getRightTree(), current);
	}

	private TreeNode findNode(Comparable element, TreeNode current) {
		if (current == null)
			return null;
		else if (element.compareTo(current.value) == 0)
			return current;
		else if (element.compareTo(current.value) < 0) {
			return findNode(element, current.getLeftTree());
		} else
			return findNode(element, current.getRightTree());
	}

	public TreeNode find(Comparable element) {
		return findNode(element, root);
	}

	public int depth() {
		return depthAtNode(root);
	}

	private int depthAtNode(TreeNode n) {
		if (n == null) {
			return 0;
		} else {
			int leftTreeDepth = depthAtNode(n.leftNode);
			int rightTreeDepth = depthAtNode(n.rightNode);
			if (leftTreeDepth > rightTreeDepth) {
				return leftTreeDepth + 1;
			} else
				return rightTreeDepth + 1;
		}
	}

	public int size() {
		return sizeAtNode(root);
	}

	private int sizeAtNode(TreeNode n) {
		if (n == null) {
			return 0;
		} else {
			return (sizeAtNode(n.getLeftTree()) + sizeAtNode(n.getRightTree()) + 1);
		}
	}

	// minNode, copied from the course slides
	public TreeNode minNode(TreeNode current) {
		if (current == null) {
			return null;
		} else if (current.getLeftTree() == null) {
			return current;
		} else
			return minNode(current.getLeftTree());
	}

	// transplant, copied from the course slides, to replace a subtree with another
	// one.
	private void transplant(TreeNode oldNode, TreeNode newNode) {
		if (oldNode.parentNode == null) {
			root = newNode;
		} else if (oldNode.parentNode.getLeftTree() == oldNode) {
			oldNode.parentNode.leftNode = newNode;
		} else
			oldNode.parentNode.rightNode = newNode;
		if (newNode != null) {
			newNode.parentNode = oldNode.parentNode;
		}
	}

	// remove, copied from the course slides, to remove an element from a BST.
	public void remove(Comparable element) {
		removeNode(element, root);
	}

	private void removeNode(Comparable element, TreeNode current) {
		if (current == null) {
			return; // just skip this case
		} else if (element.compareTo(current.value) == 0) {
			if (current.leftNode == null) {
				transplant(current, current.rightNode);
			} else if (current.rightNode == null) {
				transplant(current, current.leftNode);
			} else {
				TreeNode y = minNode(current.rightNode);
				if (y.parentNode != current) {
					transplant(y, y.rightNode);
					y.rightNode = current.rightNode;
					y.rightNode.parentNode = y;
				}
				transplant(current, y);
				y.leftNode = current.leftNode;
				y.leftNode.parentNode = y;
			}
		} else if (element.compareTo(current.value) < 0) {
			removeNode(element, current.getLeftTree());
		} else
			removeNode(element, current.getRightTree());
	}

	public Comparable maxNode() {
		if (root == null) {
			return null;
		} else {
			return maxAtNode(root);
		}
	}

	private Comparable maxAtNode(TreeNode n) {
		if (n.rightNode == null) {
			return n.value;
		} else {
			return maxAtNode(n.rightNode);
		}
	}

	public void swapTree() {
		this.swapTreeAtNode(root);
	}

	private void swapTreeAtNode(TreeNode n) {
		if (n != null) {
			TreeNode leftNode = n.getLeftTree();
			TreeNode rightNode = n.getRightTree();
			n.leftNode = rightNode;
			n.rightNode = leftNode;
			swapTreeAtNode(rightNode);
			swapTreeAtNode(leftNode);
		}
	}
	
	public String toString() {
		String s = "{";
		Queue t = new Queue();
		t.push(root);
		while (!t.empty()) {
			TreeNode n = (TreeNode) t.pop();
			s = s + "[" + n.value.toString() + "] ";
			if (n.getRightTree() != null)
				t.push(n.getRightTree());
			if (n.getLeftTree() != null)
				t.push(n.getLeftTree());
		}
		s = s + "}";
		return s;
	}

}
