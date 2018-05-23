package com.bridgelab.algorithmprogworks;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To sort string using insertion sort
 * 
 * @author JAYANTA ROY
 * @version 1.0
 * @since 22-05-2018
 */
public class InsertionSortGeneric {

	public static void main(String[] args) {
		Integer[] a = Utility.createOneDimensionalIntArray();
		System.out.println("Before sorting");
		Utility.PrintOneDimensionArray(a);
		Utility.insertionSortForInt(a);
		System.out.println();
		System.out.println("After sorting");
		Utility.PrintOneDimensionArray(Utility.insertionSortGeneric(a));
	}
}
