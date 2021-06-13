package com.bridgelabz.algorithms;

/*******
 * 
 * @author ANAND 
 * purpose: Bubble Sort using array
 *
 */
public class Bubblesort {

	public static void main(String args[]) {

		int arr[] = { 36, 89, 45, 77, 63, 32 };
		Bubblesort bs = new Bubblesort();
		bs.bubbleSort(arr);
		System.out.println("Sorted array");
		bs.printArray(arr);
	}

	// computation
	public void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	// print method to PrintArraylength
	public void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
	}

}
