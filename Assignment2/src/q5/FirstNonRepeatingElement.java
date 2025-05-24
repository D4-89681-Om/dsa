package q5;

import java.util.Scanner;

public class FirstNonRepeatingElement {
	private static int firstNonRepeatingElement(int[] arr) {
		int size = arr.length;
		for (int i = 0; i < size - 1; i++) {
			int j =  0;
			while (j < size) {
				if (arr[i] == arr[j])
					break;
				j++;
			}
			if (j == size)
			{
				return arr[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		int arr[] = { 1, 1,2,2 };

		int result = firstNonRepeatingElement(arr);

		if (result == -1)
			System.out.println("No non repeating value");
		else
			System.out.println("Output : " + result);
		sc.close();
	}

}
