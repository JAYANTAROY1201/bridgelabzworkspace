package com.bridgelabz.datastructures.calender;

/**
 * Purpose: implement a calender using queue
 * @author Jayanta Roy
 * @version 1.0
 * @since 29/05/2018
 */
public class QueueCalender {

	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		
		UtilityCalender.queueCalender(m,y);
		
	}
}
