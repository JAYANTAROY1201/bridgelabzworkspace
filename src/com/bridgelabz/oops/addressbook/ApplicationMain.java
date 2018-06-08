package com.bridgelabz.oops.addressbook;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

/**
 * @author Jayanta Roy
 * @version 1.0
 * @since 06/06/18
 */
public class ApplicationMain {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

		AddressbookController ac = new AddressbookController();

		System.out.println("**********************SIMPLE ADDRESSBOOK**********************");
		boolean quit=false;
		while(quit==false)
		{
		 System.out.println("Opening File Menu:");
		 System.out.println("1.NEW \n2.OPEN \n3.QUIT");
		 System.out.println("Enter your choice:");
		 int choice=Utility.readInteger();
		 switch(choice)
		 {
		 case 1:ac.doNew();
		       boolean close=false;
		       while(close==false)
		     {
		       System.out.println("1.Add person \n2.Save & exit \n3.Close");
		       int ch=Utility.readInteger();
		       switch(ch)
		       {
		       case 1:ac.doAdd();;
	           break;
		              
		       case 2:ac.doSave(); 
		              close=true;
		              System.out.println("Saved and exit from address book");
		       break;
		       case 3:ac.doExit();
		              System.out.println("Address book closed");
		    	      close=true;
		       break;
		       default:close=true;
		       break;
		       }
		     }
		 break;
		 case 2:ac.doOpen();
		 boolean closed=false;
		 while(closed==false)
		 {
			 System.out.println("1.Add person \n2.Edit person \n3.Delete person \n4.Sort by name \n5.Sort by ZIP \n6.Save \n7.Close");
		     int ch=Utility.readInteger(); 
		     switch(ch)
		     {
		     case 1:ac.doAddagain();
		     break;
		     case 2:ac.doEdit();
		     System.out.println("Address book closed");
   	         closed=true;
		     break;
		     case 3:ac.doDelete();
		     System.out.println("Address book closed");
   	         closed=true;
		     break;
		     case 4:ac.doSortByName();
		     System.out.println("Address book closed");
   	         closed=true;
		     break;
		     case 5:ac.doSortByZip();
		     System.out.println("Address book closed");
   	         closed=true;
		     break;
		     case 6:ac.doSave();
		     System.out.println("Address book closed");
   	         closed=true;
		     break;
		     case 7:ac.doExit();
		     System.out.println("Address book closed");
   	         closed=true;
		     }
		 }
		 break;
		 case 3:quit=true;
		 break;
		 default:quit=true;
		         System.out.println("Invalid choice.......\n Program terminated");
	     break;       
		 }
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		boolean close = false;
//		while (close == false) {
//			System.out.println("--------------FILE MENU--------------");
//			System.out.println("1.NEW \n2.ADD \n3.EDIT \n4.DELETE \n5.SAVE \n6.SORT BY NAME \n7.SORT BY ZIP \n8.EXIT \n9.OPEN");
//			System.out.println("Enter choice");
//			int choice = Utility.readInteger();
//			switch (choice) {
//			case 1:
//				ac.doNew();
//				break;
//			case 2:
//				ac.doAdd();
//				break;
//			case 3:
//				try {
//					ac.doEdit();
//				} catch (IOException | ParseException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				break;
//			case 4:
//				try {
//					ac.doDelete();
//				} catch (IOException | ParseException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				break;
//			case 5:
//				ac.doSave();
//				break;
//			case 6:
//				ac.doSortByName();
//				break;
//			case 7:
//				ac.doSortByZip();
//				break;
//			case 8:
//				ac.doExit();
//				close = true;
//				break;
//			case 9:
//				ac.doOpen();
//				break;
//			default:
//				System.out.println("Invalid choice");
//				break;
//			}
//
//		}
//
//	}

}
