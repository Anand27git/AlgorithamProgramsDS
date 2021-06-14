package com.bridgelabz.algorithms;

/*********
 * 
 * @author ANAND 
 * purpose: Permutation of String Using RecursiveMethod
 *
 */
public class PermutationofString {

	/***********
	 * 
	 * @param ch
	 * @param i
	 * @param j
	 */
	// function to swap two characters in a character array
	private static void swap(char[] ch, int i, int j) {
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}

	/********
	 * 
	 * @param ch
	 * @param currentIndex
	 */

	// Recursive function to generate all permutations of a string
	private static void permutations(char[] ch, int currentIndex) {
		if (currentIndex == ch.length - 1) {
			System.out.println(String.valueOf(ch));
		}

		for (int i = currentIndex; i < ch.length; i++) {
			swap(ch, currentIndex, i);
			permutations(ch, currentIndex + 1);
			swap(ch, currentIndex, i);
		}
	}

	// main method
	public static void main(String[] args) {
		String str = "Anand";
		permutations(str.toCharArray(), 0);
	}
}
