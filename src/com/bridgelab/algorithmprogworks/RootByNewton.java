package com.bridgelab.algorithmprogworks;

import com.bridgelabz.utility.Utility;
/**
 * Purpose : To find the root of a given number using newton method
 * @author JAYANTA ROY
 * @version 1.0
 * @since   22-05-2018
 */
public class RootByNewton {

	public static void main(String[] args) {
		System.out.println("Enter your number:");
		int c= Utility.readInteger();
		Utility.findSquareRoot(c);	
	}
}
