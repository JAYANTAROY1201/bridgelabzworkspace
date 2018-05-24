package com.bridgelabz.algorithmprogworks;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To sort integer using insertion sort
 * 
 * @author JAYANTA ROY
 * @version 1.0
 * @since 22-05-2018
 */

public class InsertionSortForInteger {

	public static void main(String[] args) {
		Integer[] a = Utility.createOneDimensionalIntArray();
		System.out.println("Before sorting");
		Utility.PrintOneDimensionArray(a);
		Utility.insertionSortForInt(a);
		System.out.println();
		System.out.println("After sorting");
		Utility.PrintOneDimensionArray(Utility.insertionSortForInt(a));
	}
}
