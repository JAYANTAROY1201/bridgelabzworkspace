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
	@SuppressWarnings("static-access")
	public User(String name, int currbalance) {
		this.name = name;
		this.currbalance = currbalance;
		userstockaccount = new StockAccount(name);
	}

	@SuppressWarnings("static-access")
	public User()

	{
		setUserName();		
		userstockaccount = new StockAccount(name);
		setUserBalance();
	}

	/**
	 * this method is written to set user name
	 */
	@SuppressWarnings("static-access")
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
	@SuppressWarnings("static-access")
	public void setUserBalance() {
		int currbalance = userstockaccount.setNewbalance();
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
	public void actions() throws IOException, NumberFormatException, ParseException {
		System.out.println(" press 1 for buy\n press 2 for sell");
		int choice = Utility.readInteger();
		switch (choice) {
		case 1:
			System.out.println("Enter company's symbol from where you wants to buy share:");
			String symbol = Utility.readString();
			userstockaccount.buy(currbalance, symbol);
			break;
		case 2:
			System.out.println("Enter company's symbol to where you wants to sell share:");
			String sym=Utility.readString();
			userstockaccount.sell(userstockaccount.valueOf(), sym);
		}

	}
}
