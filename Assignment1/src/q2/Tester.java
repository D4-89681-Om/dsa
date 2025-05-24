package q2;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of Stack - ");
		int size = sc.nextInt();

		DescendingStack ds = new DescendingStack(size);

		int choice;

		do {
			System.out.println("1. Push\n2. Pop\n3. Peek");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter value to be inserted : ");
				int value = sc.nextInt();
				ds.push(value);
				break;
			case 2:
				ds.pop();
				break;
			case 3:
				ds.peek();
				break;
			}
		} while (choice != 0);

		sc.close();

	}

}
