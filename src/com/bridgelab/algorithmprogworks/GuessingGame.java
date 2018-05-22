package com.bridgelab.algorithmprogworks;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To play a simple guessing game by binary search method
 * @author JAYANTA ROY
 * @version 1.0
 * @since   22-05-2018
 */
public class GuessingGame {

	public static void main(String[] args) throws InterruptedException 
	{
		int num=Integer.parseInt(args[0]);
		
		System.out.println("Think a number between 0 to "+num);
		
		 int [] a= new int[num+1];
		 for(int i=0;i<=num;i++) 
		 {
			 a[i]=i;
	     }
		 Thread.sleep(5000);
		 System.out.println();
		 Utility.guessNumber(a,0,(num-1));
	}
}
