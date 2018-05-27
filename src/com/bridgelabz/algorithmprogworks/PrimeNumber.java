package com.bridgelabz.algorithmprogworks;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To find a number prime or not
 * @author JAYANTA ROY
 * @version 1.0
 * @since 22-05-2018
 */
public class PrimeNumber {

	public static void main(String[] args) {
		int start;
		System.out.println("Enter starting range");
		start = Utility.readInteger();
		int end;
		System.out.println("Enter ending range");
		end = Utility.readInteger();
		Utility.findPrimeNumbers(start, end);
	}
}
