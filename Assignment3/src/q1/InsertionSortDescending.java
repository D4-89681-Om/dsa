package q1;

import java.util.Arrays;

public class InsertionSortDescending {

	public static void insertionSortDesc(int arr[], int N) {
		for (int i = 1; i < N; i++) {
			int temp = arr[i];
			int j;
			for (j = i - 1; j >= 0; j--) {

				if (arr[j] < temp)
					arr[j + 1] = arr[j];
				else
					break;
			}
			arr[j + 1] = temp;
		}

	}

	public static void main(String[] args) {
		int arr[] = { 55, 44, 22, 66, 11, 33 };

		System.out.println("Before sort : " + Arrays.toString(arr));

		insertionSortDesc(arr, arr.length);

		System.out.println("After sort : " + Arrays.toString(arr));

	}

}
