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
		boolean close = false;
		while (close == false) {
			System.out.println("--------------FILE MENU--------------");
			System.out.println("1.NEW \n2.ADD \n3.EDIT \n4.DELETE \n5.SAVE \n6.SORT BY NAME \n7.SORT BY ZIP \n8.EXIT \n9.OPEN");
			System.out.println("Enter choice");
			int choice = Utility.readInteger();
			switch (choice) {
			case 1:
				ac.doNew();
				break;
			case 2:
				ac.doAdd();
				break;
			case 3:
				try {
					ac.doEdit();
				} catch (IOException | ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:
				try {
					ac.doDelete();
				} catch (IOException | ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 5:
				ac.doSave();
				break;
			case 6:
				ac.doSortByName();
				break;
			case 7:
				ac.doSortByZip();
				break;
			case 8:
				ac.doExit();
				close = true;
				break;
			case 9:
				ac.doOpen();
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}

		}

	}

}
