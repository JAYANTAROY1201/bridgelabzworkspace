package com.bridgelab.functionalprogwork;

import com.bridgelabz.utility.Utility;

/**
 *  Purpose: To find the table of power of two
 *  @author  Jayanta Roy
 *  @version 1.0
 *  @since   17-05-2018
 *
 */

public class PowerOfTwo 
{
	public static void main(String[] args)
	{
	   int num;
	   Utility util=new Utility();
	   num=Integer.parseInt(args[0]);
	   if(num<31)
	   util.findPowerOfTwo(num);
	   

	}


}
