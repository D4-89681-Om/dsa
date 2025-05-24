package q4;

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

	public void insert(int val)
	{
		Node newNode = new Node(val);
		if( head == null)
		{
			head = newNode;
		}
		else if( head.data > val && head.next == null )
		{
			newNode.next = head;
			head = newNode;
		}
		else
		{
			Node trav = head;
			
			while(trav.next!=null && trav.next.data < val)
			{
				trav= trav.next;
			}
			
			if(trav == head && trav.data>val)
			{
				newNode.next = trav;
				head = newNode;
			}
			else {
				newNode.next = trav.next;
				trav.next = newNode;
			}
			
		}
	}
	public void display() {
		if (head == null)
			System.out.println("List is empty ..");
		else {
			Node trav =head;
			System.out.print("head ");
			while(trav != null)
			{
				System.out.print("-> "+trav.data);
				trav = trav.next;
			}
		}
	}
}
