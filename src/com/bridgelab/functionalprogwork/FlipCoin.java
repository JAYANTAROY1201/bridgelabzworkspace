package com.bridgelab.functionalprogwork;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To find head and tail percentage while flipping a coin
 * 
 * @author JAYANTA ROY
 * @version 1.0
 * @since 22-05-2018
 */
public class FlipCoin {

	public static void main(String[] args) {
		int noOfFlip;
		Utility util = new Utility();
		System.out.println("Enter no of time the coin will be flipped:");
		noOfFlip = Utility.readInteger();
		util.findFlipPercent(noOfFlip);
	}
}
