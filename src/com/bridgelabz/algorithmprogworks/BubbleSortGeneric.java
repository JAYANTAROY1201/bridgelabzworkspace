package com.bridgelabz.algorithmprogworks;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To sort arrays using bubble sort
 * @author JAYANTA ROY
 * @version 1.0
 * @since 22-05-2018
 */
public class BubbleSortGeneric {

	public static void main(String[] args) {
		Integer a[] = Utility.createOneDimensionalIntArray();
		String[] s = { "s", "g", "y", "h" };
		System.out.println("After sorting");
		Utility.bubbleSortGeneric(a);
		Utility.bubbleSortGeneric(s);
	}
}
