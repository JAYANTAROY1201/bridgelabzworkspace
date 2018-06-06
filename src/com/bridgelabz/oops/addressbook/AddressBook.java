package com.bridgelabz.oops.addressbook;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Vector;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;
/**
 * @author Jayanta Roy
 * @version 1.0
 * @since 06/06/18
 */
public class AddressBook implements Serializable {
	Vector<Person> addressBook = new Vector<Person>();
	static File fileLocation;

	public AddressBook() {
		setFile();
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param city
	 * @param state
	 * @param zip
	 * @param mobile
	 */
	public void addPerson() {

		System.out.println("Enter first name:");
		String firstName = Utility.readString();
		System.out.println("Enter last name:");
		String lastName = Utility.readString();
		System.out.println("Enter address:");
		String address = Utility.readString();
		System.out.println("Enter city:");
		String city = Utility.readString();
		System.out.println("Enter state:");
		String state = Utility.readString();
		System.out.println("Enter zip:");
		String zip = Utility.readString();
		System.out.println("Enter mobile:");
		String mobile = Utility.readString();

		addressBook.add(new Person(firstName, lastName, address, city, state, zip, mobile));
		writeToJson(toJsonArray(toJsonObject()), getFile());
		System.out.println("Contact added successfully");
		printAll();
	}

	/**
	 * @return
	 */
	public int getNumberOfPersons() {
		return addressBook.size();
	}

	/**
	 * @param index
	 * @return
	 */
	public String getFullNameOfPerson(int index) {
		return (addressBook.get(index).getFirstName() + addressBook.get(index).getLastName());
	}

	/**
	 * @param index
	 * @return
	 */
	public String[] getOtherPersonInformation(int index) {
		String[] otherInformation = new String[5];
		otherInformation[0] = addressBook.get(index).getAddress();
		otherInformation[1] = addressBook.get(index).getCity();
		otherInformation[2] = addressBook.get(index).getState();
		otherInformation[3] = addressBook.get(index).getZip();
		otherInformation[4] = addressBook.get(index).getMobile();

		return otherInformation;
	}

	/**
	 * @param index
	 * @param address
	 * @param city
	 * @param state
	 * @param zip
	 * @param mobile
	 * @throws ParseException
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public void updatePerson() throws FileNotFoundException, IOException, ParseException {
		showNames();

		System.out.println("choose your contact based on your index:");
		int index = Utility.readInteger();
		System.out.println("choose what you want to update");
		System.out.println("1 for Address \n2. for City \n3 for State \n4 for ZIP \n5 for Mobile \n");
		int choice = Utility.readInteger();
		switch (choice) {
		case 1:
			addressBook.get(index).setAddress();
			break;
		case 2:
			addressBook.get(index).setCity();
			break;
		case 3:
			addressBook.get(index).setState();
			break;
		case 4:
			addressBook.get(index).setZip();
			break;
		case 5:
			addressBook.get(index).setMobile();
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		writeToJson(toJsonArray(toJsonObject()), getFile());
		System.out.println("Contact updated successfully");

	}

	/**
	 * @param index
	 * @throws ParseException
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public void removePerson() throws FileNotFoundException, IOException, ParseException {
		showNames();
		System.out.println("choose your contact based on your index:");
		int index = Utility.readInteger();
		addressBook.remove(index);
		writeToJson(toJsonArray(toJsonObject()), getFile());
		System.out.println("Contact deleted successfully");
	}

	/**
	 * 
	 */
	public void sortByName() {
		Comparator cmp1 = (Object obj1, Object obj2) -> {
			Person p1 = (Person) obj1;
			Person p2 = (Person) obj2;
			int value = new Person.CompareByName().compare(p1, p2);
			return value;
		};
	}

	/**
	 * 
	 */
	public void sortByZip() {
		Comparator cmp1 = (Object obj1, Object obj2) -> {
			Person p1 = (Person) obj1;
			Person p2 = (Person) obj2;
			int value = new Person.CompareByZip().compare(p1.getZip(), p2.getZip());
			return value;
		};
	}

	public void printAll() {
		for (int i = 0; i < addressBook.size(); i++) {
			System.out.println("First Name: " + addressBook.get(i).getFirstName());
			System.out.println("Last Name: " + addressBook.get(i).getLastName());
			System.out.println("Address: " + addressBook.get(i).getAddress());
			System.out.println("City: " + addressBook.get(i).getCity());
			System.out.println("State: " + addressBook.get(i).getState());
			System.out.println("ZIP : " + addressBook.get(i).getZip());
			System.out.println("Phone: " + addressBook.get(i).getMobile());
		}

	}

	public JSONObject toJsonObject() {
		JSONObject contactObject = new JSONObject();
		contactObject.put("First Name", Person.firstName);
		contactObject.put("Last Name", Person.lastName);
		contactObject.put("Address", Person.address);
		contactObject.put("City", Person.city);
		contactObject.put("State", Person.state);
		contactObject.put("ZIP", Person.zip);
		contactObject.put("Mobile", Person.mobile);
		return contactObject;

	}

	public JSONArray toJsonArray(JSONObject contactObject) {
		JSONArray contactArray = new JSONArray();
		contactArray.add(contactObject);
		return contactArray;
	}

	public void writeToJson(JSONArray contactArray, File fileLocation) {
		try {
			// if file doesnt exists, then create it
			if (!fileLocation.exists()) {
				fileLocation.createNewFile();
			}

			FileWriter fw = new FileWriter(fileLocation.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(contactArray.toString());
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void setFile() {
		System.out.println("enter file name:");
		String file = Utility.readString();
		fileLocation = new File("/home/administrator/eclipse-workspace/"
				+ "BridgelabzModules/src/com/bridgelabz/oops/addressbook/" + file + ".json");
	}

	public File getFile() {
		return fileLocation;
	}

	public void showNames() throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(getFile()));
		JSONArray name = (JSONArray) obj;
		for (int i = 0; i < name.size(); i++) {
			JSONObject nameobj = (JSONObject) name.get(i);
			System.out.println(i + "     " + nameobj.get("First Name") + " " + nameobj.get("First Name"));
		}
	}
}
