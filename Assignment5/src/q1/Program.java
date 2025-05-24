package q1;

public class Program {

	public static void main(String[] args) {
		DoublyeQueue dq = new DoublyeQueue();
		
		dq.push(10);
		dq.push(20);
		dq.push(30);
		dq.push(40);

		dq.display();
		
		dq.pop();
		dq.pop();
		dq.display();
		dq.peek();
		dq.pop();
		dq.pop();
		dq.pop();
		
	}

}
