package com.bridgelabz.oops.addressbook;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;

import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;
/**
 * @author Jayanta Roy
 * @version 1.0
 * @since 06/06/18
 */
public class AddressbookController {
	static AddressBook a1;
	Vector<String> addressbook = new Vector<String>();

	public void doAdd() {
		a1.addPerson();
	}

	public void doDelete() throws FileNotFoundException, IOException, ParseException {
		a1.removePerson();
	}

	public void doEdit() throws FileNotFoundException, IOException, ParseException {
		a1.updatePerson();
	}

	public void doNew() {
		System.out.println("Set a name for new address book");
		addressbook.add(Utility.readString());
		a1 = new AddressBook();
	}
    public void doOpen() {
    	System.out.println("Choose your address book:");
    	for (int i = 0; i < addressbook.size(); i++) {
		System.out.println((i+1)+" "+addressbook.get(i));	
		}
    	
    	a1=new AddressBook();
  
    }
	public void doSave() {
		a1.toJsonArray(a1.toJsonObject());
	}

	public void doExit()
	{
		a1.writeToJson(a1.contactArray, a1.getFile());		
	}
	public void doSortByName() throws FileNotFoundException, IOException, ParseException {
		a1.sortByName();
		//doSave();
	}

	public void doSortByZip() throws FileNotFoundException, IOException, ParseException {
		a1.sortByZip();
		//doSave();
	}
}
