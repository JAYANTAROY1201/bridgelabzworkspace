package com.bridgelabz.oops.commercialdataprocessing;


import java.io.IOException;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

/**
 * purpose: to utilize the main
 * @author Jayanta Roy
 * @version 1.0
 * @since 04/06/2018
 */
public class MainStock {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ParseException, IOException {
    
        User u=new User();
        System.out.println();
        System.out.println("Showing companies code");
        System.out.println("code  company name");
        System.out.println("-------------------");
        StockAccount.showStock();
        boolean processexit=false;
        while(processexit==false)
        {
        u.actions();
       System.out.println("Press 1 for continue  or any other key to stop");
       int choice=Utility.readInteger();
       switch(choice)
       {
       case 1:processexit=false;
       break;
       default: processexit=true;
       break;
       }
        }
	}
}


