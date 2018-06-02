package com.bridgelabz.oops.commercialdataprocessing;

import com.bridgelabz.datastructures.singlelinkedlist.SingleLinkedList;
import com.bridgelabz.utility.Utility;

public class User {

	static String name;
	static double currbalance;
	static StockAccount useraccount;
//	static SingleLinkedList l;
	public User(String name, double currbalance)
	{
		this.name=name;
		this.currbalance=currbalance;
		useraccount=new StockAccount();		
	}
	public User()

	{	
		useraccount=new StockAccount();
	}
	public void setUserName()
	{
		System.out.println("Enter name");
		String name=Utility.readString();
		this.name=name;
	}
	public String getUserName()
	{
		return name;
	}
	public void setUserBalance()
	{
		System.out.println("Enter initial balance:");
		int currbalance=Utility.readInteger();
		this.currbalance=currbalance;
	}
	public double getUserBalance()
	{
		return currbalance;
	}
	
	public static void actions()
	{
		System.out.println("press 1 for buy\n press 2 for sell");
		useraccount.buy();
	}
}

