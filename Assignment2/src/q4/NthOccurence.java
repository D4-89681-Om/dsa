package q4;

import java.util.Scanner;

public class NthOccurence {
	private static int nthOccurence(int[] arr, int ele, int occ) {
		if(occ == 0) return -1;
		int size = arr.length;
		int i = 0;
		while(i<size && occ>0)
		{
			if(arr[i] == ele) occ--;
			i++;
		}
		if(occ == 0) return i;
		else return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = { 99, 88, 77, 66, 55, 77, 33, 22, 11 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.print("Enter the element -");
		int ele = sc.nextInt();
		System.out.print("Enter the nth occurance -");
		int occ = sc.nextInt();

		int index = nthOccurence(arr, ele, occ);

		if(index == -1) System.out.println("Invalid occurence");
		else System.out.println("Index - "+index);
		sc.close();
	}

	

}
