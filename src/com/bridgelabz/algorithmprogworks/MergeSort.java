package com.bridgelabz.algorithmprogworks;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To sort String using bubble sort
 * 
 * @author JAYANTA ROY
 * @version 1.0
 * @since 22-05-2018
 */
public class MergeSort {

	public static void main(String[] args) {
		// Unsorted array
		Integer[] a = Utility.createOneDimensionalIntArray();

		// Call merge sort
		Comparable[] sortArray = Utility.mergeSort(a);

		// Check the output which is sorted array
		System.out.println("After Sorting:");
		for (int i = 0; i < sortArray.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
