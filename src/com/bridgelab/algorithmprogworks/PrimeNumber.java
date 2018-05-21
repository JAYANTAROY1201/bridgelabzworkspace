package com.bridgelab.algorithmprogworks;

import com.bridgelabz.utility.Utility;

public class PrimeNumber {

	public static void main(String[] args)
	{
		int start;
		System.out.println("Enter starting range");
		start=Utility.readInteger();
		int end;
		System.out.println("Enter ending range");
      	end= Utility.readInteger();
		Utility.primeCheckerRange(start,end);
		
	}
	
	
	
	
}
