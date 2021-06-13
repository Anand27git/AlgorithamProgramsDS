package com.bridgelabz.algorithms;

/********
 * 
 * @author ANAND
 * purpose: Insertion Sort
 *
 */
public class InsertionSort {

	public static void main(String args[]) {
		// declaration of array values
		int arr[] = { 9, 32, 78, 66, 01, 5 };
		InsertionSort ob = new InsertionSort();
		ob.sort(arr);

		printArray(arr);
	}

	// sort method
	void sort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int value = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > value) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = value;
		}
	}

	// print method
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
