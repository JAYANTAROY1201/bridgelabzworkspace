package com.bridgelabz.algorithmprogworks;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To sort integer using bubble sort
 * @author JAYANTA ROY
 * @version 1.0
 * @since 22-05-2018
 */
public class BubbleSortOfIntegers {
	public static void main(String[] args) {
		Integer a[] = Utility.createOneDimensionalIntArray();
		System.out.println("After sorting");
		Utility.PrintOneDimensionArray(Utility.bubbleSortForInt(a));
	}
}
