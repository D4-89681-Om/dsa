package q1;

public class Program {

	public static void main(String[] args) {
		List list = new List();

		list.addLastNode(10);
		list.addLastNode(20);
		list.addLastNode(30);
		list.addLastNode(40);
		list.addFirstNode(50);
		list.addFirstNode(60);
		list.display();
		System.out.println();
		list.deleteFirst();
		list.display();
		System.out.println();
		list.deleteLast();
		list.display();
	}

}
