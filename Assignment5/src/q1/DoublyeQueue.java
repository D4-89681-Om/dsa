package q1;

public class DoublyeQueue {

	static class Node {
		private int data;
		private Node prev;
		private Node next;

		Node(int val) {
			data = val;
			prev = null;
			next = null;
		}
	}

	private Node head;
	private Node tail;

	public DoublyeQueue() {
		head = null;
		tail = null;
	}

	public void push(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		if (head == tail) {
			System.out.println("Popped value - " + head.data);
			head = tail = null;
			return;
		}

		System.out.println("Popped value - " + head.data);
		head = head.next;
		head.prev = null;
	}

	public void peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}

		System.out.println("Peeked value - " + head.data);
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		System.out.print("Head");
		Node trav = head;
		while(trav != null) {
			System.out.print("-> "+trav.data);
			trav= trav.next;
		}
		System.out.println();
		
	}
}
