package com.bridgelab.functionalprogwork;

import com.bridgelabz.utility.Utility;

/**
 *  Purpose: To find prime factors of a given number
 *
 *  @author  Jayanta Roy
 *  @version 1.0
 *  @since   17-05-2018
 *
 */

public class PrimeFactor 
{
	public static void main(String[] args) 
	{
		int num;
		Utility util=new Utility();
		System.out.println("Enter your number:");
		num=Utility.readInteger();
		util.findPrimeFactor(num);   
     }
}

	




