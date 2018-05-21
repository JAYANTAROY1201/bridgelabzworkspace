package com.bridgelab.algorithmprogworks;

import com.bridgelabz.utility.Utility;

public class InsertionSortForInteger {

	public static void main(String[] args) {
		int[] a= Utility.createOneDimensionalIntArray();
		System.out.println("Before sorting");
		Utility.PrintOneDimensionArray(a);
		Utility.insertionSortForInt(a);
		System.out.println();
		System.out.println("After sorting");
        Utility.PrintOneDimensionArray(Utility.insertionSortForInt(a));

	}

}
