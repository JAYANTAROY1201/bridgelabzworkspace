package com.bridgelabz.datastructures.deque;

import com.bridgelabz.utility.Utility;

public class PalindromeCheck {

	public static void main(String[] args) {
		
		DequeList myDeque= new DequeList();
		System.out.println("enter your string to check palindrome");
		String str=Utility.readString();
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
		 myDeque.addRear(ch[i]);	
		}
      
		int flag=0;

		while(myDeque.size()>1)
		{
			if( myDeque.removeFront().compareTo(myDeque.removeRear())!=0)
			{
				flag=1;
				break;
			}
		}

		if(flag==0)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
}
	}

}
