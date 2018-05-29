package com.bridgelabz.datastructures.deque;

import com.bridgelabz.utility.Utility;
/**
 * PURPOSE: TO CHECK A NUMBER PALINDROME OR NOT 
 * @author JAYANTA ROY
 * @version 1.0
 * @since 27-05-2018
 */
public class PalindromeCheck {

	public static void main(String[] args) {
		
	    
		System.out.println("enter your string to check palindrome");
		String str=Utility.readString();

		if(UtilityDeque.checkPalindromeByDeque(str))
			System.out.println(str+" is palindrome");

		else
		System.out.println(str+" is not palindrome");
}
}
