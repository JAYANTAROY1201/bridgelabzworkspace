package com.bridgelabz.algorithmprogworks;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To convert decimal to binary
 * @author JAYANTA ROY
 * @version 1.0
 * @since 22-05-2018
 */
public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println("Enter a decimal no:");
		int num = Utility.readInteger();
		String str = Utility.toBin(num);
		System.out.println("Binary format of " + num + " is " + str);
		System.out.println("After swapping nibble decimal value become :"
				+ Utility.binToDec(Utility.swapNibbles(Utility.toBin(num))));
	}
}
