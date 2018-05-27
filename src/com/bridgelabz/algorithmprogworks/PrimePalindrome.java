package com.bridgelabz.algorithmprogworks;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To find a num which is prime as well as palindrome
 * @author JAYANTA ROY
 * @version 1.0
 * @since 22-05-2018
 */
public class PrimePalindrome {

	public static void main(String[] args) {
		Utility util = new Utility();
		int start;
		System.out.println("Enter starting range");
		start = Utility.readInteger();
		int end;
		System.out.println("Enter ending range");
		end = Utility.readInteger();
		System.out.println("results:");
		util.primePalindromeChecker(start, end);
	}
}
