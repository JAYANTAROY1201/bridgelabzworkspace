package com.bridgelab.algorithmprogworks;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To find tday of a given date
 * 
 * @author JAYANTA ROY
 * @version 1.0
 * @since 23-05-2018
 */
public class DayCalculator {

	public static void main(String[] args) {
		System.out.println("Enter day,month,year respectively:");
		int d = Utility.readInteger();
		int m = Utility.readInteger();
		int y = Utility.readInteger();
		Utility.dayOfWeek(d, m, y);
	}
}
