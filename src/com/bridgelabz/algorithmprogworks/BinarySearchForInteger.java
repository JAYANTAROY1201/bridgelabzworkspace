package com.bridgelabz.algorithmprogworks;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To search an integer using binary search
 * @author JAYANTA ROY
 * @version 1.0
 * @since 22-05-2018
 */

class BinarySearchForInteger {
	// main method implementation of recursive Binary Search
	public static void main(String args[]) {

		Integer a[] = Utility.createOneDimensionalIntArray();
		int start = 0;
		int end = a.length - 1;
		System.out.println("Enter your search element: ");
		int search = Utility.readInteger();
		a = Utility.bubbleSortForInt(a);
		Utility.binarySearchForInteger(a, start, end, search);

	}
}
