package q3;

public class Program {

	public static void main(String[] args) {
		List list = new List();
		
		list.displayFront();
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		list.addLast(40);
		list.addLast(50);
		list.addPos(60, 5);
		System.out.println("In front - ");
		list.displayFront();
		System.out.println("In reverse - ");
		list.displayRev();
	}

}
