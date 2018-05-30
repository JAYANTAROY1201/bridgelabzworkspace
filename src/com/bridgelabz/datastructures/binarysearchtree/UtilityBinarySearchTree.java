package com.bridgelabz.datastructures.binarysearchtree;

/**
 *Purpose: Utility methods for BST
 * @author Jayanta Roy
 * @version 1.0
 * @since 30/05/2018
 */
public class UtilityBinarySearchTree {

	//to find catalan number
	public static long findPossibleTree(int node) {
		return (factorial(2 * node) / (factorial(node + 1) * factorial(node)));
	}

	// to find  factorial of a given number
	public static long factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	// to count number of possible BST
	public static long countBST(long count) {
		long intsum = 0;
		if (count == 0 || count == 1) {
			return 1;
		} else if (count == 2) {
			return 2;
		} else {
			for (long i = 0; i < count; i++) {
				intsum = intsum + countBST(i) * countBST(count - i - 1);
			}
			return intsum;
		}
	}
}
