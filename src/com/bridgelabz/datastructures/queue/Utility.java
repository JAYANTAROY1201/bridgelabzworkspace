package com.bridgelabz.datastructures.queue;

import java.util.Random;

/**
 * purpose: utility class of banking transaction
 * @author JAYANTA ROY
 * @version: 1.0
 * @since:25-05-2018
 */
public class Utility {

	public static void bankTransaction(Queue myQueue)
	{
		int sum=10000;
		System.out.println("initial amount to the bank "+sum);
		System.out.println();
		Random rand= new Random();
		int noOfPerson=rand.nextInt(20);
		System.out.println(noOfPerson+" people are in queue");
		for(int i=0;i<noOfPerson;i++)
		{
			myQueue.enqueue((i+1)+" person");
		}
		for(int i=0;i<noOfPerson;i++)
		{
			System.out.println("Press 1 to deposit");
			System.out.println("Press 2 to withdraw");
			int choice=com.bridgelabz.utility.Utility.readInteger();
			switch(choice)
			{
			case 1: System.out.println("Enter the amount you want to deposit:");
			        int depositMoney=com.bridgelabz.utility.Utility.readInteger();
			        sum=sum+depositMoney;
			        System.out.println("Transaction successfull");
			        myQueue.dequeue();
		            break;
		    
			case 2: System.out.println("Enter the amount you want to withdraw:");
			        int withdrawMoney=com.bridgelabz.utility.Utility.readInteger();
			        if(withdrawMoney>sum)
			        {
			        	System.out.println("No enough money in the bank");
			        	System.out.println("Transaction unsuccessfull");
			        	myQueue.dequeue();
			        }
			        else {
			        	sum=sum-withdrawMoney;
			        	System.out.println("Transaction successfull");
			        	myQueue.dequeue();			        	
			        }
			        break;
			default:System.out.println("Invalid choice");
			        i--;
			        break;
			}
			System.out.println("Updated money to bank:"+ sum);
		}	
	}
	}

