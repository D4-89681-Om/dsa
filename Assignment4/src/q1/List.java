package q1;

public class List {
	static class Node {
		int data;
		Node next;

		public Node(int val) {
			data = val;
			next = null;
		}
	}

	private Node tail;

	public List() {
		tail = null;
	}

	public void addLastNode(int val) {
		Node newNode = new Node(val);

		if (tail == null) {
			tail = newNode;
			newNode.next = newNode;
			return;
		}

		Node head = tail.next;
		tail.next = newNode;
		newNode.next = head;
		tail = newNode;

	}

	public void addFirstNode(int val) {
		Node newNode = new Node(val);

		if (tail == null) {
			tail = newNode;
			newNode.next = newNode;
			return;
		}
		newNode.next = tail.next;
		tail.next = newNode;
	}

	public void deleteFirst() {

		if (tail == null)
			return;
		if (tail.next == tail)
			tail = null;
		else
		{
			tail.next = tail.next.next;
		}
	}
	public void deleteLast() {

		if (tail == null)
			return;
		if (tail.next == tail)
			tail = null;
		else
		{
			Node head = tail.next;
			while(head.next != tail)
			{
				head= head.next;
			}
			head.next = tail.next;
			tail=head;
		}
	}

	public void display() {
		if (tail == null)
			return;

		Node trav = tail.next;
		System.out.print("head ");
		do {
			System.out.print("-> " + trav.data);
			trav = trav.next;
		} while (trav != tail.next);
	}
}
