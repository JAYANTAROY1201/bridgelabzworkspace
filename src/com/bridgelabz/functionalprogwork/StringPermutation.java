package com.bridgelabz.functionalprogwork;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To find the different string combination
 * @author JAYANTA ROY
 * @version 1.0
 * @since 22-05-2018
 */
public class StringPermutation {
	public static void main(String[] args) {
		String inputString;
		System.out.println("Enter your string: ");
		inputString = Utility.readString();
		System.out.println("All possible combinations are:");
		Utility.stringPermutation(inputString);
	}
}
