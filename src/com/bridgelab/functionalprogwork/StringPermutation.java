package com.bridgelab.functionalprogwork;

import com.bridgelabz.utility.Utility;

public class StringPermutation 
{  
    public static void main(String[] args) 
	 {
	    String inputString;
	    System.out.println("Enter your string: ");
	    inputString=Utility.readString();
	    System.out.println("All possible combinations are:");
	    Utility.stringPermutation(inputString);
	  }    
}
