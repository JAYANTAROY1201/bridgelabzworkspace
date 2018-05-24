package com.bridgelabz.algorithmprogworks;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To search a string using binary search
 * 
 * @author JAYANTA ROY
 * @version 1.0
 * @since 22-05-2018
 */

public class BinarySearchForString {
	public static void main(String[] args) {
		System.out.println("enter your string:");
		String str = Utility.readString();
		str = Utility.bubbleSortForString(str);
		char[] a = str.toCharArray();
		System.out.println("enter search letter:");
		char search = Utility.readCharacter();
		int start = 0;
		int end = a.length - 1;
		Utility.binarySearchForString(a, start, end, search);
	}
}
