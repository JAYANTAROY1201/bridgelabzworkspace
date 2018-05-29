package com.bridgelabz.datastructures.calender;

/**
 * PURPOSE: Utility class for calender
 * @author Jayanta Roy
 * @version 1.0
 * @since 28-05-2018
 */
public class UtilityCalender {

	public static boolean dateValidator(int d, int month, int y) {

		boolean b = true;
		if(((month == 4 || month == 6 || month == 9 || month == 11) && (d >30)) 
				|| (d>31)
				|| (month==2 && y % 100 == 0 && y % 400 != 0 && d > 28) 
				|| (month==2 && y % 400 == 0 && d > 29)
				|| (month==2 && y % 100 != 0 && y % 4 != 0 && d > 28) 
				|| (month==2 && y % 100 != 0 && y % 4 == 0 && d > 29))
		{
			b = false;
		} 
        else {
            b=true;
        }		
		return b;
}
	
	public static int dayStart(int d,int m,int y)
	{
		int y0 = y - (14 - m) / 12;
		int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		return ((d + x + (31 * m0) / 12) % 7);
		
		
	}
	
}
