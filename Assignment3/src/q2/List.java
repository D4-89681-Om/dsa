package q2;

public class List {
	static class Node {
		int data;
		Node next;

		public Node(int val) {
			data = val;
			next = null;
		}
	}

	private Node head;

	public List() {
		head = null;
	}

	public void addFirst(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;

	}

	public void addLast(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			addFirst(val);
			return;
		}
		Node trav = head;

		while (trav.next != null) {
			trav = trav.next;
		}
		trav.next = newNode;
	}

	public void insertBeforeGivenNode(int val, int node) {
		Node newNode = new Node(val);

		Node prev = null;
		Node trav = head;
		if (trav.data >= node) {
			newNode.next = head;
			head = newNode;
			return;
		}
		while (trav != null) {
			if (trav.data == node)
				break;
			prev = trav;
			trav = trav.next;
		}
		newNode.next = trav;
		prev.next = newNode;
	}

	public void insertAfterGivenNode(int val ,int node) {
		Node newNode = new Node(val);

		Node trav = head;
		while (trav.next != null) {
			if (trav.data == node)
				break;

			trav = trav.next;
		}
		newNode.next = trav.next;
		trav.next = newNode;
	}

	public void display() {
		Node trav = head;
		System.out.print("Head");
		while (trav != null) {
			System.out.print("-> " + trav.data);
			trav = trav.next;
		}
		System.out.println();
	}
}
