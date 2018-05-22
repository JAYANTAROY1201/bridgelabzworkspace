package com.bridgelab.algorithmprogworks;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To find a string anagram or not
 * @author JAYANTA ROY
 * @version 1.0
 * @since   22-05-2018
 */
public class Anagram {

	public static void main(String[] args) {
		System.out.println("Enter your First string: ");
		String str1=Utility.readString();
		System.out.println("Enter your second string: ");
		String str2=Utility.readString();
		Utility.checkAnagram(str1,str2);

	}
	
	

}
