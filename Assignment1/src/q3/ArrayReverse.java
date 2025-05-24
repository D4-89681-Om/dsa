package q3;

import java.util.Scanner;
import java.util.Stack;

public class ArrayReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array - ");
		int size = sc.nextInt();

		Stack<Integer> st = new Stack<Integer>();
		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("Enter value at index " + i + " - ");
			int val = sc.nextInt();
			arr[i] = val;
		}
		System.out.println("Before reversing - ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < size; i++) {
			st.push(arr[i]);
		}
		int index = 0;
		while (!st.empty()) {
			arr[index] = st.pop();
			index++;
		}
		System.out.println("After reversing - ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();

	}

}
