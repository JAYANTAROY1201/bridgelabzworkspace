package com.bridgelabz.datastructures.binarysearchtree;

public class UtilityBinarySearchTree {

	public static long findPossibleTree(int node) {
		return (factorial(2 * node) / (factorial(node + 1) * factorial(node)));
	}

	public static long factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	public static long count(long count) {
		long intsum = 0;
		if (count == 0 || count == 1) {
			return 1;
		} else if (count == 2) {
			return 2;
		} else {
			for (long i = 0; i < count; i++) {
				intsum = intsum + count(i) * count(count - i - 1);
			}
			return intsum;
		}
	}
}
