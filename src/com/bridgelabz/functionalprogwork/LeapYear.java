package com.bridgelabz.functionalprogwork;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To find a year leap year or not
 * 
 * @author JAYANTA ROY
 * @version 1.0
 * @since 22-05-2018
 */
public class LeapYear {
	public static void main(String[] args) {
		int year;
		System.out.println("Enter year which you want to check :");
		System.out.println("NOTE: Year must be greater than or equals to 1582");
		year = Utility.readInteger();
		Utility.checkLeapYear(year);
	}
}
