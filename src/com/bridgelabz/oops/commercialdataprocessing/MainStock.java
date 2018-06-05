package com.bridgelabz.oops.commercialdataprocessing;


import java.io.IOException;
import java.nio.file.attribute.UserDefinedFileAttributeView;

import org.json.simple.parser.ParseException;

import com.bridgelabz.datastructures.singlelinkedlist.SingleLinkedList;
import com.bridgelabz.utility.Utility;

/**
 * purpose: to utilize the main
 * @author Jayanta Roy
 * @version 1.0
 * @since 04/06/2018
 */
public class MainStock {

	public static void main(String[] args) throws ParseException, IOException, InterruptedException {
    boolean applicationClose=false;
    
    while(applicationClose==false) {
        User u=new User();
        System.out.println();
        System.out.print("Loading companies details");
        for(int i=0;i<10;i++)
        {
        Thread.sleep(200);
        System.out.print(".");
        }
        System.out.println();
        System.out.println("SYMBOL  COMPANY NAME      SHARE PRICE     NO OF SHARE");
        System.out.println("-------------------------------------------------------");
        StockAccount.showStock();
        boolean processExit=false;
        while(processExit==false)
        {
        u.actions();
       System.out.println("Press 1 for continue  or any other key to stop");
       int choice=Utility.readInteger();
       switch(choice)
       {
       case 1:processExit=false;
       break;
       default:            
    	   processExit=true;
       break;
       }
       }
       System.out.println("Press 1 to continue with another user or press any others key to exit");
       int c=Utility.readInteger();
       switch(c)
       {
       case 1:applicationClose=false;
       break;
       default:applicationClose=true;
       break;
       }
	}
}
}


