package q3;

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

	public void addPos(int val, int pos) {
		Node newNode = new Node(val);
		if (pos <= 1) {
			addFirst(val);
			return;
		}
		if (head == null) {
			head = newNode;
		}
		Node trav = head;
		pos--;
		while (trav.next != null && pos-1 != 0) {
			trav = trav.next;
			pos--;
		}
		newNode.next = trav.next;
		trav.next = newNode;
	}

	private void displayFrontRecursively(Node temp) {
		if (temp == null)
			return;
		System.out.print(" ->" + temp.data);
		displayFrontRecursively(temp.next);
	}
	private void displayReverseRecursively(Node temp) {
		if (temp == null)
			return;
		displayReverseRecursively(temp.next);
		System.out.print(" ->" + temp.data);
	}

	public void displayFront() {
		if (head == null)
			System.out.println("List is empty ..");
		else {
			System.out.print("head");
			displayFrontRecursively(head);
			System.out.println();
		}
	}

	public void displayRev() {
		if (head == null)
			System.out.println("List is empty ..");
		else {
			System.out.print("head");
			displayReverseRecursively(head);
			System.out.println();
		}
	}

}
