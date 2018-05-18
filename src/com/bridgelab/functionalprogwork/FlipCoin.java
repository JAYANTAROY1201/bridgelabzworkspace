package com.bridgelab.functionalprogwork;

import com.bridgelabz.utility.Utility;


/**
 *  Purpose: To flip a coin n no of time(s) and find no percent of head and tail
 *
 *  @author  Jayanta Roy
 *  @version 1.0
 *  @since   17-05-2018
 *
 */


public class FlipCoin {
	
	public static void main(String[] args) {
	   int noOfFlip;
	   Utility util=new Utility();
	   System.out.println("enter no of time the coin will be flipped:");
	   noOfFlip = util.readInteger(); 
	   util.findFlipPercent(noOfFlip);
	   

	}

	

}
