package com.bridgelabz.datastructures.calender;

/**
 * Purpose: implement a calender using stack
 * @author Jayanta Roy
 * @version 1.0
 * @since 29/05/2018
 */
public class StackCalender {

	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		UtilityCalender.stackCalender(m, y);
	}

}
