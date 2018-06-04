package com.bridgelabz.oops.commercialdataprocessing;

import java.io.IOException;
import org.json.simple.parser.ParseException;
import com.bridgelabz.utility.Utility;

/**
 * purpose: to create a user
 * @author Jayanta Roy
 * @version 1.0
 * @since 04/06/2018
 */
public class User {

	static String name;
	static int currbalance;
	static StockAccount userstockaccount;

	// static SingleLinkedList l;
	public User(String name, int currbalance) {
		this.name = name;
		this.currbalance = currbalance;
		userstockaccount = new StockAccount(name);
	}

	public User()

	{
		setUserName();
		setUserBalance();
		userstockaccount = new StockAccount(name);
	}

	/**
	 * this method is written to set user name
	 */
	public void setUserName() {
		System.out.println("Enter name");
		String name = Utility.readString();
		this.name = name;
	}

	/**
	 * this method is written to get user name 
	 * @return name
	 */
	public String getUserName() {
		return name;
	}

	/**
	 * this method is written to set user balance
	 */
	public void setUserBalance() {
		System.out.println("Enter initial balance:");
		int currbalance = Utility.readInteger();
		this.currbalance = currbalance;
	}

	/**
	 * this method is written to get user balance
	 * @return
	 */
	public double getUserBalance() {
		return currbalance;
	}

	/**
	 * this method is written to perfeom action
	 * @throws IOException
	 * @throws NumberFormatException
	 * @throws ParseException
	 */
	public static void actions() throws IOException, NumberFormatException, ParseException {
		System.out.println(" press 1 for buy\n press 2 for sell");
		int choice = Utility.readInteger();
		switch (choice) {
		case 1:
			System.out.println("Enter company's name from where you wants to buy share:");
			String symbol = Utility.readString();
			userstockaccount.buy(currbalance, symbol);
		}

	}
}
