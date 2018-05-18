package com.bridgelab.functionalprogwork;

import com.bridgelabz.utility.Utility;


/**
 *  Purpose: To find harmonic progression till given no.
 *
 *  @author  Jayanta Roy
 *  @version 1.0
 *  @since   17-05-2018
 *
 */

public class HarmonicProgress {
   public static void main(String[] args) {
	   int num;
	   
	   Utility util=new Utility();
	   System.out.println("Enter your number:");
	   num=util.readInteger();
	   util.findHarmonic(num);
	 }
}
