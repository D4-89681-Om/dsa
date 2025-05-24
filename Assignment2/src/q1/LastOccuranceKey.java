package q1;

import java.util.Scanner;

public class LastOccuranceKey {

	public static int linearOccuranceKey(int arr[], int key) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key)
				index = i;
		}
		return index;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = { 11, 88, 33, 33, 88, 66, 33, 88, 11 };

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("Enter the key - ");
		int key = sc.nextInt();
		int index = linearOccuranceKey(arr, key);
		if(index == -1) System.out.println("Key not found");
		else {
			System.out.println("Last Index - "+index);
		}
		sc.close();
	}

}
