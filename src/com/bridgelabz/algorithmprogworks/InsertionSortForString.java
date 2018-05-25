package com.bridgelabz.algorithmprogworks;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To sort string using insertion sort
 * @author JAYANTA ROY
 * @version 1.0
 * @since 22-05-2018
 */
public class InsertionSortForString {

	public static void main(String[] args) {
		System.out.println("Enter your string:");
		String str = Utility.readString();
		System.out.println("Before sorting");
		System.out.println(str);

		System.out.println();
		System.out.println("After sorting");
		System.out.println(Utility.insertionSortForString(str));
	}
}
