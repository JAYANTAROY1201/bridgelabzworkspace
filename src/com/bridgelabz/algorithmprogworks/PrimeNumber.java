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
		int starts;
		System.out.println("Enter starting point");
		starts = Utility.readInteger();
		int ends;
		System.out.println("Enter ending point");
		ends = Utility.readInteger();
		Utility.findPrimeNumbers(starts, ends);
	}
}
