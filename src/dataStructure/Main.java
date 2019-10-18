// Yunning ZHOU, MACS. A test class for data structures.
package dataStructure;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Assignment 1.3.1
		// Vector Vector1 = new Vector(3);
		// for (int i = 1; i <= 3; i++) {
		// Vector1.addLast(i);
		// }
		// System.out.println(Vector1.size());
		// System.out.println(Vector1.contains(6));
		// System.out.println(Vector1.contains(101));

		// Assignment 1.3.2
		// System.out.println(Vector1.getFirst());
		// System.out.println(Vector1.getLast());

		// Assignment 1.3.3
		// System.out.println(Vector1);

		// Assignment 1.3.4
		// Vector1.addFirst("a");
		// System.out.println(Vector1);

		// Assignment 1.3.5
		// Vector1.removeLast();
		// System.out.println(Vector1);
		// System.out.println(Vector1.size());
		// Vector1.removeFirst();
		// System.out.println(Vector1);
		// System.out.println(Vector1.size());

		// Assignment 1.3.6
		// Vector1.reverse();
		// System.out.println(Vector1);

		// Assignment 1.3.7
		// System.out.println(Vector1.doubleVector());
		// (Time complexity = t(n), because it only iterates all the original vector
		// only once.)

		// Assignment 1.3.8
		// Vector Vector2 = new Vector(101);
		// for (int i = 4; i <= 7; i++) {
		// Vector2.addLast(i);
		// }
		// System.out.println(Vector1.interleave(Vector2));
		// (Time complexity = t(n1 + n2), because it iterates all the two original
		// vectors only once.)

		// Assignment 1.3.9
		// Vector1.addLast("a");
		// System.out.println(Vector1);

		// Assignment 3.2.1
		// LinkedList linkedlist1 = new LinkedList();
		// linkedlist1.addFirst(1);
		// linkedlist1.addFirst(2);
		// linkedlist1.addFirst(3);
		// linkedlist1.addFirst(4);
		// System.out.println(linkedlist1);

		// Assignment 3.2.2
		// System.out.println(linkedlist1.size());

		// Assignment 3.2.3
		// linkedlist1.set(2, 3);
		// System.out.println(linkedlist1);

		// Assignment 3.2.4
		// System.out.println(linkedlist1.getLast());

		// Assignment 3.2.5
		// linkedlist1.addLast(5);
		// System.out.println(linkedlist1);

		// Assignment 3.2.6
		// System.out.println(linkedlist1.contains(7));
		// System.out.println(linkedlist1.contains(1));

		// Assignment 3.2.7
		// LinkedList l1 = new LinkedList();
		// Vector v1 = new Vector(5);
		// for (int i = 4; i > 0; i--) {
		// l1.addFirst(i);
		// v1.addFirst(i);
		// }
		// System.out.println(l1);
		// System.out.println(v1);
		// System.out.println(l1.isEmpty());
		// System.out.println(v1.isEmpty());
		// System.out.println(l1.size());
		// System.out.println(v1.size());
		// l1.removeFirst();
		// v1.removeFirst();
		// System.out.println(l1);
		// System.out.println(v1);
		// l1.removeLast();
		// v1.removeLast();
		// System.out.println(l1);
		// System.out.println(v1);

		// Assignment 3.2.8
		// l1.fropple();
		// System.out.println(l1);

		// Assignment 3.2.9
		// LinkedList l2 = new LinkedList();
		// for (int i = 7; i > 4; i--) {
		// l2.addFirst(i);
		// }
		// System.out.println(l2);
		// l1.append(l2);
		// System.out.println(l1);
		// System.out.println(l2);

		// Assignment Extra reverse()
		// l1.reverse();
		// System.out.println(l1);

		// Assignment 4.1.1
		// Stack stack1 = new Stack();
		// for (int i = 1; i <= 4; i++) {
		// stack1.push(i);
		// }
		// System.out.println(stack1);
		// System.out.println(stack1.pop());
		// System.out.println(stack1);
		// System.out.println(stack1.top());
		// System.out.println(stack1.size());
		// System.out.println(stack1.empty());

		// Assignment 4.1.3
		// StackLinkedList stack2 = new StackLinkedList();
		// for (int i = 1; i <= 4; i++) {
		// stack2.push(i);
		// }
		// System.out.println(stack2);
		// System.out.println(stack2.pop());
		// System.out.println(stack2);
		// System.out.println(stack2.top());
		// System.out.println(stack2.size());
		// System.out.println(stack2.empty());

		// Assignment 5.1.1
		// Queue queue1 = new Queue();
		// for (int i = 1; i <= 4; i++) {
		// queue1.push(i);
		// }
		// System.out.println(queue1);
		// System.out.println(queue1.pop());
		// System.out.println(queue1);
		// System.out.println(queue1.top());
		// System.out.println(queue1);
		// System.out.println(queue1.size());
		// System.out.println(queue1.empty());

		// Assignment 5.1.3
		// QueueLinkedList queue2 = new QueueLinkedList();
		// for (int i = 1; i <= 4; i++) {
		// queue2.push(i);
		// }
		// System.out.println(queue2);
		// System.out.println(queue2.pop());
		// System.out.println(queue2);
		// System.out.println(queue2.top());
		// System.out.println(queue2);
		// System.out.println(queue2.size());
		// System.out.println(queue2.empty());

		// Assignment 6.3.1
		// PriorityQueue pq1 = new PriorityQueue();
		// pq1.push("a", 2);
		// pq1.push("b", 1);
		// pq1.push("c", 3);
		// System.out.println(pq1);
		// System.out.println(pq1.pop());
		// System.out.println(pq1);
		// System.out.println(pq1.top());

		// Assignment 6.3.2. Done but the solution is not decent. Tested with boundary
		// issues.
		// PriorityQueueUnsorted pqu2 = new PriorityQueueUnsorted();
		// pqu2.push("a", 1);
		// pqu2.push("b", 3);
		// pqu2.push("c", 2);
		// System.out.println(pqu2);
		// System.out.println(pqu2.pop());
		// System.out.println(pqu2);
		// System.out.println(pqu2.top());

		// Assignment 7.6.1
		// CircularVector cv1 = new CircularVector(10);
		// for (int i = 4; i >= 1; i--) {
		// cv1.addFirst(i);
		// }
		// System.out.println(cv1);
		// for (int i = 5; i <= 8; i++) {
		// cv1.addLast(i);
		// }
		// System.out.println(cv1);
		// cv1.removeLast();
		// System.out.println(cv1);

		// Assignment 7.6.2
		// QueueCircularVector qcv1 = new QueueCircularVector();
		// qcv1.push(1);
		// qcv1.push(2);
		// System.out.println(qcv1);
		// System.out.println(qcv1.pop());
		// System.out.println(qcv1);
		// qcv1.push(3);
		// System.out.println(qcv1);
		// System.out.println(qcv1.top());
		// System.out.println(qcv1.size());
		// System.out.println(qcv1.empty());

		// Assignment 9.2.1
		// DoubleLinkedList dll1 = new DoubleLinkedList();
		// for (int i = 1; i <= 4; i++) {
		// dll1.addLast(i);
		// }
		// System.out.println(dll1);

		// Assignment 9.2.2
		// dll1.printReverse();

		// Assignment 9.2.3
		// dll1.removeFirst();
		// System.out.println(dll1);

		// Assignment 9.2.4
		// dll1.removeLast();
		// System.out.println(dll1);

		// Assignment 9.2.5
		// dll1.reverse();
		// System.out.println(dll1);

		// Assignment 8.1.2
		// Dictionary d1 = new Dictionary();
		// d1.add("a", "aaaa");
		// d1.add("b", "bbbb");
		// System.out.println(d1);
		// System.out.println(d1.findPosition("a"));
		// System.out.println(d1.findPosition("c"));
		// System.out.println(d1.find("a"));
		// System.out.println(d1.find("c"));

		// Assignment 8.1.3
		// d1.add("a", "cccc");
		// System.out.println(d1);

		// Assignment 10.2.1
		// Tree t1 = new Tree();
		// for (int i = 1; i <= 6; i++) {
		// t1.insert(i);
		// }
		// t1.print();

		// Assignment 10.2.2 & 3
		// Tree t2 = new Tree();
		// t2.insert(3);
		// t2.insert(1);
		// t2.insert(2);
		// t2.insert(4);
		// t2.print();
		// t2.remove(3);
		// t2.print();

		// Assignment 10.2.4
		// t2.traverse(new TreePrinter());

		// Assignment 10.2.5
		// t2.printAnonymous();

		// Assignment 10.2.6
		// System.out.println(t2.depth());

		// Assignment 10.2.7
		// System.out.println(t2.maxNode());

		// Assignment 10.2.8
		// Skipped for implementation.

		// Assignment 10.2.9
		// t2.traverse(new TreePrinter());
		// t2.swapTree();
		// t2.traverse(new TreePrinter());

		// Assignment 10.2.10
		// PriorityQueueTree pq1 = new PriorityQueueTree();
		// pq1.push("a", 2);
		// pq1.push("b", 1);
		// pq1.push("c", 3);
		// System.out.println(pq1);
		// System.out.println(pq1.top());
		// System.out.println(pq1.pop());
		// System.out.println(pq1);

		// Assignment 10.3
		// DictionaryTree d1 = new DictionaryTree();
		// d1.add("a", "aaaa");
		// d1.add("b", "bbbb");
		// System.out.println(d1);
		// System.out.println(d1.findKey("a"));
		// System.out.println(d1.findKey("c"));
		// d1.remove("a");
		// System.out.println(d1);
		// d1.add("a", "cccc");
		// System.out.println(d1);
		
		// Assignment 12.4.2
		// Matrix m1 = new Matrix(3);
		// System.out.println(m1);
		// m1.set(2, 1, 3.5);
		// System.out.println(m1);
		
		// Assignment 12.4.3
		// MatrixGraph mg1 = new MatrixGraph (3);
		// mg1.addEdge(2, 1, 3.5);
		// System.out.println(mg1);
		// mg1.print();
		
		// Assignment 12.4.4
		// Graph g1 = new Graph();
		// g1.addNode("A");
		// g1.addNode("B");
		// g1.addNode("C");
		// g1.addEdge("A", "B");
		// g1.addEdge("C", "A");
		// g1.addEdge("A", "C");
		// System.out.println(g1);
		// g1.print();
		
		// Assignment 12.4.5
		Graph g2 = new Graph();
		g2.addNode("A");
		g2.addNode("B");
		g2.addNode("C");
		g2.addEdge("A", "B", 1.0);
		g2.addEdge("C", "A", 1.5);
		g2.addEdge("A", "C", 2.0);
		System.out.println(g2);
		
		// Assignment 12.4.6
		System.out.println(g2.findPath("A", "C"));
		
		// Assignment 12.4.7 & 12.4.8 & 12.4.9 & 12.4.11 & 12.4.12
		g2.addEdge("B", "C", 0.5);
		System.out.println(g2);
		System.out.println(g2.findPath("A", "C"));
		
	}
}
