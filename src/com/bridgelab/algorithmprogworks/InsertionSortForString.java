package com.bridgelab.algorithmprogworks;

import com.bridgelabz.utility.Utility;

public class InsertionSortForString {

	public static void main(String[] args)
	{
		System.out.println("Enter your string:");
	    String str= Utility.readString();
		System.out.println("Before sorting");
		System.out.println(str);
	
		System.out.println();
		System.out.println("After sorting");
        System.out.println(Utility.insertionSortForString(str));

	}

}
