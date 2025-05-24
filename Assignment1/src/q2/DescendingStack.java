package q2;

public class DescendingStack {

	private int top;
	private final int SIZE;
	private int arr[];
	
	public DescendingStack(int size)
	{
		SIZE = size;
		arr = new int[size];
		top = size-1;
	}
	
	public void push(int val)
	{
		if(isFull()) System.out.println("Stack is full ...");
		else {
			arr[top] = val;
			top--;
		}
	}
	
	public void pop() {
		if(isEmpty()) System.out.println("Stack is empty ...");
		else {
			int temp = arr[top+1];
			top++;
			System.out.println("Poped value - "+temp);
		}
	}
	
	public void peek()
	{
		
		if(isEmpty()) System.out.println("Stack is Empty ...");
		else {
			int temp = arr[top+1];
			System.out.println("Peeked value - "+temp);
		}
		
	}
	public boolean isEmpty()
	{
		return top == SIZE-1;
	}
	public boolean isFull()
	{
		return top == -1;
	}

}
