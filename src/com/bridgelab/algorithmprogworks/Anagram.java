package com.bridgelab.algorithmprogworks;

import com.bridgelabz.utility.Utility;

public class Anagram {

	public static void main(String[] args) {
		System.out.println("Enter your First string: ");
		String str1=Utility.readString();
		System.out.println("Enter your second string: ");
		String str2=Utility.readString();
		Utility.checkAnagram(str1,str2);

	}
	
	

}
