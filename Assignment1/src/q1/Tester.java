package q1;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of queue - ");
		int size = sc.nextInt();

		LinearQueue q = new LinearQueue(size);

		int choice;

		do {
			System.out.println("1. Push\n2. Pop\n3. Peek");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter value to be inserted : ");
				int value = sc.nextInt();
				q.push(value);
				break;
			case 2:
				q.pop();
				break;
			case 3:
				q.peek();
				break;
			}
		} while (choice != 0);

		sc.close();

	}

}
