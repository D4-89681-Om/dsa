package q3;

import java.util.Scanner;

public class BinarySearchInDescendingArray {

	public static int binarySearchInDescendingArray(int arr[], int key)
	{
		int size = arr.length;
		
		int left = 0;
		int right = size-1;
		
		while(left <= right)
		{
			int mid = (left+right)/2;
			if(arr[mid] == key ) return mid;
			else if(arr[mid] < key) right = mid -1;
			else left = mid + 1;
		}
		
		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = { 99, 88, 77, 66, 55, 44, 33, 22, 11 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.print("Enter the key -");
		int key = sc.nextInt();

		int index = binarySearchInDescendingArray(arr, key);

		if(index == -1) System.out.println("Key not found");
		else System.out.println("Index - "+index);
		sc.close();

	}

}
