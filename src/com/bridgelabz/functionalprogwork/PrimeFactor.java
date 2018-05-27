package com.bridgelabz.functionalprogwork;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To find the prime factors of a given no
 * @author JAYANTA ROY
 * @version 1.0
 * @since 22-05-2018
 */
public class PrimeFactor {
	public static void main(String[] args) {
		int num;
		Utility util = new Utility();
		System.out.println("Enter your number:");
		num = Utility.readInteger();
		util.findPrimeFactor(num);
	}
}
