package com.bridgelabz.algorithmprogworks;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To find minimum denomination we can get for a given amount
 * @author JAYANTA ROY
 * @version 1.0
 * @since 22-05-2018
 */
public class CurrencyVendingSystem {
	public static void main(String[] args) {
		int[] denomination = { 1000, 500, 200, 100, 50,20, 10, 5, 2, 1 };
		System.out.println("Enter your amount:");
		int num = Utility.readInteger();
		Utility.changeGenerator(num, denomination);
	}
}
