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
	Vector<Person> addressBook;
	static File fileLocation;
	static JSONArray contactArray = new JSONArray();

	public AddressBook() {
		setFile();
		
	}
	
	/**
	 * this method is written to read json file and adding into an vector
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	public void readfromJson() throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(fileLocation));
		JSONArray oldarray = (JSONArray) obj;
		if(oldarray.isEmpty())
		{
			contactArray=new JSONArray();
		}
		else {
		for (int i = 0; i < oldarray.size(); i++) {
			JSONObject objson = (JSONObject) oldarray.get(i);
			contactArray.add(objson);
		}
		}
	}

	/**
	 * to add a person into address book
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param city
	 * @param state
	 * @param zip
	 * @param mobile
	 * @throws ParseException
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public void addfirstPerson() throws FileNotFoundException, IOException, ParseException {
		readfromJson();
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
		loadObject();
		addressBook.add(new Person(firstName, lastName, address, city, state, zip, mobile));
		System.out.println("Contact added successfully!!! Please save to avoid deleting the details");
	}
	
	

	/**
	 *to add person afterwards
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	public void addPerson() throws FileNotFoundException, IOException, ParseException {
		loadObject();
		readfromJson();
		System.out.println("Enter first name:");
		String fistName = Utility.readString();
		System.out.println("Enter last name:");
		String lstName = Utility.readString();
		System.out.println("Enter address:");
		String adress = Utility.readString();
		System.out.println("Enter city:");
		String cty = Utility.readString();
		System.out.println("Enter state:");
		String stat = Utility.readString();
		System.out.println("Enter zip:");
		String zp = Utility.readString();
		System.out.println("Enter mobile:");
		String mob = Utility.readString();
		addressBook.add(new Person(fistName, lstName, adress, cty, stat, zp, mob));
		System.out.println("Contact added successfully!!! Please save to avoid deleting the details");
	}

	/**
	 * 
	 * this method is written to update details of a person
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
		JSONParser parser = new JSONParser();
		Person temp = null;
		Object obj = parser.parse(new FileReader(getFile()));

		JSONArray oldarray = (JSONArray) obj;
		Vector<Person> abook = new Vector<Person>();
		System.out.println("choose your contact based on your index:");
		int index = Utility.readInteger();
		for (int i = 0; i < oldarray.size(); i++) {
			JSONObject objson = (JSONObject) oldarray.get(i);
			if (i == index) {

				temp = new Person(objson.get("First Name").toString(), objson.get("Last Name").toString(),
						objson.get("Address").toString(), objson.get("City").toString(), objson.get("State").toString(),
						objson.get("ZIP").toString(), objson.get("Mobile").toString());
			} else {
				contactArray.add(objson);
			}			
		}

		System.out.println("choose what you want to update");
		System.out.println("1 for Address \n2. for City \n3 for State \n4 for ZIP \n5 for Mobile \n");
		int choice = Utility.readInteger();
		switch (choice) {
		case 1:
			temp.setAddress();
			break;
		case 2:
			temp.setCity();
			break;
		case 3:
			temp.setState();
			break;
		case 4:
			temp.setZip();
			break;
		case 5:
			temp.setMobile();
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		removeOld(index);
		JSONObject tempobj = new JSONObject();
		tempobj.put("First Name", temp.getFirstName());
		tempobj.put("Last Name", temp.getLastName());
		tempobj.put("Address", temp.getAddress());
		tempobj.put("City", temp.getCity());
		tempobj.put("State", temp.getState());
		tempobj.put("ZIP", temp.getZip());
		tempobj.put("Mobile", temp.getMobile());
		contactArray.add(tempobj);
		System.out.println("file saved and write successfully");
		writeToJson(contactArray, getFile());

	}


	/**
	 * this method is written to remove a person for json file to add a new one
	 * @param index
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	public void removeOld(int index) throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object javaObjct = parser.parse(new FileReader(getFile()));
		JSONArray oldjsonArray = (JSONArray) javaObjct;
		JSONArray newArray = new JSONArray();
		for (int i = 0; i < oldjsonArray.size(); i++) {
			JSONObject newObj = (JSONObject) oldjsonArray.get(i);
			if (i != index) {
				newArray.add(newObj);
			}
		}
		contactArray = newArray;
		writeToJson(contactArray, getFile());
	}

	/**
	 * this method is written to remove a person for json file
	 * @param index
	 * @throws ParseException
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public void removePerson() throws FileNotFoundException, IOException, ParseException {
		showNames();
		System.out.println("choose your contact based on your index:");
		int index = Utility.readInteger();
		JSONParser parser = new JSONParser();
		Object javaObjct = parser.parse(new FileReader(getFile()));
		JSONArray oldjsonArray = (JSONArray) javaObjct;
		JSONArray newArray = new JSONArray();
		for (int i = 0; i < oldjsonArray.size(); i++) {
			JSONObject newObj = (JSONObject) oldjsonArray.get(i);
			if (i != index) {
				newArray.add(newObj);
			}
		}
		contactArray = newArray;
		writeToJson(newArray, getFile());
	}

	
	/**
	 * this method is written to sort the persons along with first name
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	@SuppressWarnings("unchecked")
	public void sortByName() throws FileNotFoundException, IOException, ParseException {
		Object obj = new JSONParser().parse(new FileReader(getFile()));
		JSONArray addressArray = (JSONArray) obj;
		for (int i = 0; i < addressArray.size() - 1; i++) {
			for (int j = 0; j < addressArray.size() - i - 1; j++) {
				JSONObject person = (JSONObject) addressArray.get(j);
				JSONObject person2 = (JSONObject) addressArray.get(j + 1);
				if (person.get("First Name").toString().compareToIgnoreCase(person2.get("First Name").toString()) > 0) {
					JSONObject temp = person;
					addressArray.set(j, person2);
					addressArray.set(j + 1, temp);
				}
			}
		}
		contactArray=addressArray;
		writeToJson(addressArray, getFile());
	}

	/**
	 * this method is written to sort the persons along with zip code
	 * @throws ParseException
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public void sortByZip() throws FileNotFoundException, IOException, ParseException {
		Object obj = new JSONParser().parse(new FileReader(getFile()));
		JSONArray addressArray = (JSONArray) obj;
		for (int i = 0; i < addressArray.size() - 1; i++) {
			for (int j = 0; j < addressArray.size() - i - 1; j++) {
				JSONObject person = (JSONObject) addressArray.get(j);
				JSONObject person2 = (JSONObject) addressArray.get(j + 1);
				if (person.get("ZIP").toString().compareToIgnoreCase(person2.get("ZIP").toString()) > 0) {
					JSONObject temp = person;
					addressArray.set(j, person2);
					addressArray.set(j + 1, temp);
				}
			}
		}
		contactArray=addressArray;
		writeToJson(addressArray, getFile());
	}

	/**
	 * this method is written to put a person details into an json object
	 * @return jsonobject after putting the person's details
	 */
	@SuppressWarnings("unchecked")
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

	/**
	 *this method is written to put an json object into a json array
	 * @param contactObject whwre the json object will be loaded
	 */
	@SuppressWarnings("unchecked")
	public void toJsonArray(JSONObject contactObject) {
		contactArray.add(contactObject);
	}

	/**
	 * this method is written to write a json array to a  json file
	 * @param contactArray i.e. a json array while shold be written
	 * @param fileLocation is the path where it will be written
	 */
	public void writeToJson(JSONArray contactArray, File fileLocation) {
		try {

			if (!fileLocation.exists()) {
				fileLocation.createNewFile();
			}
			FileWriter fw = new FileWriter(fileLocation);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(contactArray.toString());
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * this method is written to set a file name. File path will be asked after calling the method 
	 */
	public void setFile() {
		System.out.println("enter file name:");
		String file = Utility.readString();
		fileLocation = new File("/home/administrator/eclipse-workspace/"
				+ "BridgelabzModules/src/com/bridgelabz/oops/addressbook/" + file + ".json");
	}

	/**
	 * this method is written to set a file name while passing a file while calling the method
	 * @param file address in string format
	 */
	public void setFile(String file) {
		fileLocation = new File("/home/administrator/eclipse-workspace/"
				+ "BridgelabzModules/src/com/bridgelabz/oops/addressbook/" + file + ".json");
	}

	/**
	 * this method is written to get the file location
	 * @return curently using file location
	 */
	public File getFile() {
		return fileLocation;
	}

	/**
	 * this method is written to load all jsonobject into vector whenever we open or create an addressbook i.e json file
	 */
	public void loadObject() {
		Vector<Person> tempvector = new Vector<Person>();
		JSONParser parser = new JSONParser();
		Object obj = null;
		try {
			obj = parser.parse(new FileReader(getFile()));
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		JSONArray name = (JSONArray) obj;
		for (int i = 0; i < name.size(); i++) {
			JSONObject nameobj = (JSONObject) name.get(i);

			tempvector.add(new Person(nameobj.get("First Name").toString(), nameobj.get("Last Name").toString(),
					nameobj.get("Address").toString(), nameobj.get("City").toString(), nameobj.get("State").toString(),
					nameobj.get("ZIP").toString(), nameobj.get("Mobile").toString()));

		}
		addressBook = tempvector;
	}

	/**
	 * this method is written to print all the names of an existing addressbook along with index
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ParseException
	 */
	public void showNames() throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader(getFile()));
		JSONArray name = (JSONArray) obj;
		for (int i = 0; i < name.size(); i++) {
			JSONObject nameobj = (JSONObject) name.get(i);
			System.out.println(i + "     " + nameobj.get("First Name") + " " + nameobj.get("Last Name"));
		}
	}
}
