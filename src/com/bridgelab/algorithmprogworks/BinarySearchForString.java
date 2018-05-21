package com.bridgelab.algorithmprogworks;

import com.bridgelabz.utility.Utility;

public class BinarySearchForString {

	public static void main(String[] args) 
	{
		System.out.println("enter your string:");
		String str=Utility.readString();
		str=Utility.bubbleSortForString(str);
		char [] a=str.toCharArray();
		System.out.println("enter search letter:");
		char search=Utility.readCharacter();
		int start=0;
	     int end = a.length-1;
		Utility.binarySearchForString(a, start, end, search);
		

	}

}
