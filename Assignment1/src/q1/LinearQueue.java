package q1;

public class LinearQueue {
	private int arr[];
	private final int SIZE;
	private int front,rear;
	
	public LinearQueue(int size) {
		SIZE =size;
		arr = new int[SIZE];
		front =rear = 0;
	}
	
	public void push(int val)
	{
		if(isFull()) System.out.println("Queue is full ...");
		else {
			arr[rear++] = val;
		}
	}
	
	public void pop() {
		if(isEmpty()) System.out.println("Queue is empty ... ");
		else
		{
			int temp = arr[front++];
			System.out.println("Popped value - "+temp);
			if(front == rear) front=rear=0;
		}
	}
	public void peek()
	{
		if(isEmpty()) System.out.println("Queue is empty ... ");
		else
		{
			int temp = arr[front];
			System.out.println("Peeked value - "+temp);
		}
	}
	public boolean isEmpty()
	{
		return front == rear;
	}
	public boolean isFull()
	{
		return rear == SIZE;
	}
	
}
