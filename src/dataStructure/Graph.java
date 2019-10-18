// Yunning ZHOU, MACS. A Graph Class with adjacency list representation with nodes list based on Vector.
package dataStructure;

public class Graph {
	public class Node implements Comparable {
		private Comparable info;
		private Vector edges;
		private boolean visited;

		public Node(Comparable label) {
			info = label;
			edges = new Vector(10);
			visited = false;
		}

		public void addEdge(Edge e) {
			edges.addLast(e);
		}

		public int compareTo(Object o) {
			// two nodes are equal if they have the same label
			Node n = (Node) o;
			return n.info.compareTo(info);
		}

		public Comparable getLabel() {
			return info;
		}

		public void setVisitedTrue() {
			visited = true;
		}

		public void resetVisted() {
			visited = false;
		}

		public boolean isVisited() {
			return visited;
		}

		// toString method modified to adapt layout for cinema Screenings.
		public String toString() {
			// String s = "[Node: " + info.toString() + ", Edges: " + edges.toString() +
			// "]";
			String s = info.toString();
			return s;
		}

	}

	private class Edge implements Comparable {
		private Node toNode;
		private double weight;

		public Edge(Node to, double weight) {
			toNode = to;
			this.weight = weight;
		}

		public int compareTo(Object o) {
			// two edges are equal if they point
			// to the same node.
			// this assumes that the edges are
			// starting from the same node !!!
			Edge n = (Edge) o;
			return n.toNode.compareTo(toNode);
		}

		public String toString() {
			String s = "(" + toNode.getLabel().toString() + ", " + weight + ")";
			return s;
		}
	}

	private Vector nodes;

	public Graph() {
		nodes = new Vector(10);
	}

	public void addNode(Comparable label) {
		nodes.addLast(new Node(label));
	}

	public Node findNode(Comparable nodeLabel) {
		return ((Node) (nodes.contains2(new Node(nodeLabel))));
	}

	public Vector getAllNodes() {
		Vector res = new Vector(nodes.size());
		for (int i = 0; i < nodes.size(); i++) {
			res.addLast((((Node) nodes.get(i)).getLabel()));
		}
		return res;
	}

	// The old findPath method with a visited list based on LinkedList

	// public Stack findPath(Comparable nodeLabel1, Comparable nodeLabel2) {
	// Node startState = findNode(nodeLabel1);
	// Node endState = findNode(nodeLabel2);
	// Stack toDoList = new Stack();
	// LinkedList vistedList = new LinkedList();
	// Stack res = new Stack();
	// toDoList.push(startState);
	// while (!toDoList.empty()) {
	// Node current = (Node) toDoList.pop();
	// res.push(current.getLabel());
	// vistedList.addFirst(current);
	// if (current == endState)
	// return res;
	// else {
	// for (int i = 0; i < current.edges.size(); i++) {
	// Edge e = (Edge) current.edges.get(i);
	// if (!vistedList.contains(e.toNode)) {
	// toDoList.push(e.toNode);
	// }
	// }
	// }
	// }
	// return null;
	// }

	// Loop-prevented findPath method.
	public Stack findPath(Comparable nodeLabel1, Comparable nodeLabel2) {
		Node startState = findNode(nodeLabel1);
		Node endState = findNode(nodeLabel2);
		// toDoList with Stack: DFS. toDoList with Queue: BFS
		Stack toDoList = new Stack();
		Stack res = new Stack();
		LinkedList vistedList = new LinkedList();
		toDoList.push(startState);
		while (!toDoList.empty()) {
			Node current = (Node) toDoList.pop();
			res.push(current.getLabel());
			vistedList.addFirst(current);
			if (current == endState) {
				return res;
			} else {
				for (int i = 0; i < current.edges.size(); i++) {
					Edge e = (Edge) current.edges.get(i);
					if (!vistedList.contains(e.toNode)) {
						toDoList.push(e.toNode);
					}
				}
			}
		}
		return null;
	}

	public void addEdge(Comparable nodeLabel1, Comparable nodeLabel2, double weight) {
		Node n1 = findNode(nodeLabel1);
		Node n2 = findNode(nodeLabel2);
		n1.addEdge(new Edge(n2, weight));
	}

	// DFS, copied from the course slides
	private void DFS(Node current) {
		current.visited = true;
		for (int i = 0; i < current.edges.size(); i++) {
			Edge e = (Edge) current.edges.get(i);
			Node next = (Node) e.toNode;
			if (!next.visited) {
				DFS(next);
			}
		}
		System.out.println(current.info);
	}

	public void DFS() {
		for (int i = 0; i < nodes.size(); i++) {
			Node current = (Node) nodes.get(i);
			if (!current.visited) {
				DFS(current);
			}
		}
		for (int i = 0; i < nodes.size(); i++) {
			Node current = (Node) nodes.get(i);
			current.resetVisted();
		}
	}

	public String toString() {
		String s = nodes.toString();
		return s;
	}

	public void print() {
		System.out.println(this.toString());
	}
}