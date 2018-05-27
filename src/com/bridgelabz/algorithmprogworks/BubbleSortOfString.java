package com.bridgelabz.algorithmprogworks;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To sort String using bubble sort
 * @author JAYANTA ROY
 * @version 1.0
 * @since 22-05-2018
 */
public class BubbleSortOfString {
	public static void main(String[] args) {
		System.out.println("Enter your String");
		String a = Utility.readString();
		System.out.println("After sorting");
		System.out.println(Utility.bubbleSortForString(a));
	}
}
