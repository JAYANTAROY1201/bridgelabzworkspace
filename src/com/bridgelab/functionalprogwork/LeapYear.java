package com.bridgelab.functionalprogwork;


import com.bridgelabz.utility.Utility;

/**
 *  Purpose: To find a given year leap year or not
 *
 *  @author  Jayanta Roy
 *  @version 1.0
 *  @since   17-05-2018
 *
 */

public class LeapYear
{
	public static void main(String[]args)
	{
		int year;
        System.out.println("Enter year which you want to check :");
	    System.out.println("NOTE: Year must be greater than or equals to 1582");
	    year=Utility.readInteger();
	    Utility.checkLeapYear(year);
	}
}
	