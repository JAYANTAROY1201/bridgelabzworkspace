package com.bridgelab.algorithmprogworks;

import com.bridgelabz.utility.Utility;

public class PrimePalindrome 
{

	public static void main(String[] args) 
	{
		Utility util=new Utility();
		int start;
		System.out.println("Enter starting range");
		start=Utility.readInteger();
		int end;
		System.out.println("Enter ending range");
      	end= Utility.readInteger();
      	System.out.println("results:");
      	util.primePalindromeChecker(start,end);
		

	}
	
	

}
