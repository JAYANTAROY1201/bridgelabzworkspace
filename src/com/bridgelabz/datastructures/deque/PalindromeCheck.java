package com.bridgelabz.datastructures.deque;

import com.bridgelabz.utility.Utility;

public class PalindromeCheck {

	public static void main(String[] args) {
		
		System.out.println("enter your string to check palindrome");
		String str=Utility.readString();
<<<<<<< HEAD
		if(UtilityDeque.checkPalindromeByDeque(str))
			System.out.println(str+" is palindrome");
=======
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
		 myDeque.addRear(ch[i]);	
		}
      
		int flag=0;
		if(str.length()%2==0 
		{
		while(myDeque.size()>1)
		{
			if( myDeque.removeFront().compareTo(myDeque.removeRear())!=0)
			{
				flag=1;
				break;
			}
		}
		}
		else
	        {
		while(myDeque.size()>2)
		{
			if( myDeque.removeFront().compareTo(myDeque.removeRear())!=0)
			{
				flag=1;
				break;
			}
		}
		}

		if(flag==0)
		{
			System.out.println("String is palindrome");
		}
>>>>>>> 1d1a8978c6aca09fad265a0e02c557719c3c63a8
		else
		System.out.println(str+" is not palindrome");
}
}
