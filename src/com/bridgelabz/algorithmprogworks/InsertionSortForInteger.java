package com.bridgelabz.algorithmprogworks;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To sort integer using insertion sort
 * @author JAYANTA ROY
 * @version 1.0
 * @since 22-05-2018
 */

public class InsertionSortForInteger {

	public static void main(String[] args) {
		Integer[] ar = Utility.createOneDimensionalIntArray();
		System.out.println(" Before sorting");
		Utility.printOneDimensionArray(ar);
		Utility.insertionSortForInt(ar);
		System.out.println();
		System.out.println(" After sorting");
		Utility.printOneDimensionArray(Utility.insertionSortForInt(ar));
	}
}
