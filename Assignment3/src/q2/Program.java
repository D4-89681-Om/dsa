package q2;

public class Program {

	public static void main(String[] args) {
		List list = new List();
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(50);
		list.addLast(70);
		list.display();
		
		list.insertBeforeGivenNode(40,20);
		list.display();
		list.insertBeforeGivenNode(90,90);
		list.display();
		
		list.insertAfterGivenNode(11,40);
		list.display();
		list.insertAfterGivenNode(12,11);
		list.display();
	}

}
