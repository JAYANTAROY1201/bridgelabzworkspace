package com.bridgelabz.datastructures.deque;

import com.bridgelabz.utility.Utility;

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
