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
	static JSONArray contactArray=new JSONArray();
	public AddressBook() {
		setFile();
//		loadObject();
		
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
		System.out.println("Contact added successfully");		
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
		JSONParser parser=new JSONParser();
		Person temp=null;
		Object obj= parser.parse(new FileReader(getFile()));
		
		JSONArray oldarray= (JSONArray) obj;
		Vector<Person>abook=new Vector<Person>();
		System.out.println("choose your contact based on your index:");
		int index = Utility.readInteger();
		for(int i=0;i<oldarray.size();i++)
		{
			JSONObject objson=(JSONObject) oldarray.get(i);
			if(i==index)
			{
			
			temp=new Person( objson.get("First Name").toString(), objson.get("Last Name").toString(),
					objson.get("Address").toString(), objson.get("City").toString(), objson.get("State").toString(),
					objson.get("ZIP").toString(),objson.get("Mobile").toString());
		}
			else
			{
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
        JSONObject tempobj=new JSONObject();
        tempobj.put("First Name", temp.getFirstName());
        tempobj.put("Last Name", temp.getLastName());
        tempobj.put("Address", temp.getAddress());
        tempobj.put("City", temp.getCity());
        tempobj.put("State", temp.getState());
        tempobj.put("ZIP", temp.getZip());
        tempobj.put("Mobile", temp.getMobile());
        contactArray.add(tempobj);
		
        

		writeToJson(contactArray, getFile());

	}
	
	public void removeOld(int index) throws FileNotFoundException, IOException, ParseException {	
		JSONParser parser= new JSONParser();
		Object javaObjct=parser.parse(new FileReader(getFile()));
		JSONArray oldjsonArray=(JSONArray) javaObjct;	
		JSONArray newArray=new JSONArray();
		for (int i = 0; i <oldjsonArray.size(); i++) {
			JSONObject newObj= (JSONObject)oldjsonArray.get(i);
			if(i!=index)
			{
				newArray.add(newObj);
		    }
		}	
		contactArray=newArray;
		writeToJson(contactArray, getFile());
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
		JSONParser parser= new JSONParser();
		Object javaObjct=parser.parse(new FileReader(getFile()));
		JSONArray oldjsonArray=(JSONArray) javaObjct;	
		JSONArray newArray=new JSONArray();
		for (int i = 0; i <oldjsonArray.size(); i++) {
			JSONObject newObj= (JSONObject)oldjsonArray.get(i);
			if(i!=index)
			{
				newArray.add(newObj);
		    }
		}	
		contactArray=newArray;		
	}

	/**
	 * @throws ParseException 
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * 
	 */
	public void sortByName() throws FileNotFoundException, IOException, ParseException {
		Object obj = new JSONParser().parse(new FileReader(getFile()));
        JSONArray addressArray = (JSONArray) obj;
        for(int i=0;i<addressArray.size()-1;i++) {
            for(int j =0;j<addressArray.size()-i-1;j++)
            {
                JSONObject person = (JSONObject)addressArray.get(j);
                JSONObject person2=(JSONObject)addressArray.get(j+1);
                if(person.get("First Name").toString().compareToIgnoreCase(person2.get("First Name").toString())>0)
                {
                    JSONObject temp = person;
                    addressArray.set(j, person2);
                    addressArray.set(j+1, temp);
                }
            }
	 }
       writeToJson(addressArray, getFile()); 
	}

	/**
	 * @throws ParseException 
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * 
	 */
	public void sortByZip() throws FileNotFoundException, IOException, ParseException {
		Object obj = new JSONParser().parse(new FileReader(getFile()));
        JSONArray addressArray = (JSONArray) obj;
        for(int i=0;i<addressArray.size()-1;i++) {
            for(int j =0;j<addressArray.size()-i-1;j++)
            {
                JSONObject person = (JSONObject)addressArray.get(j);
                JSONObject person2=(JSONObject)addressArray.get(j+1);
                if(person.get("ZIP").toString().compareToIgnoreCase(person2.get("ZIP").toString())>0)
                {
                    JSONObject temp = person;
                    addressArray.set(j, person2);
                    addressArray.set(j+1, temp);
                }
            }
	 }
       writeToJson(addressArray, getFile()); 
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
	

   public void vectorToJson(Vector<Person> addressBook)
   {
	   for(int i=0;i<addressBook.size();i++)
	   {
		   Person p=new Person();
		   p=addressBook.get(i);
		  JSONObject perobj=new JSONObject();
		  perobj.put("First Name", p.firstName);
		  perobj.put("Last Name", p.lastName);
		  perobj.put("Address", p.address);
		  perobj.put("City", p.city);
		  perobj.put("State", p.state);
		  perobj.put("ZIP", p.zip);
		  perobj.put("Mobile", p.mobile);
		  toJsonArray(perobj);
		  
	   }
	   writeToJson(contactArray, getFile());
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
		//toJsonArray(contactObject);
		//writeToJson(contactArray, fileLocation);
		return contactObject;

	}

	public void toJsonArray(JSONObject contactObject) {	
		contactArray.add(contactObject);
		
	}

	public void writeToJson(JSONArray contactArray, File fileLocation) {
		try {
			// if file doesnt exists, then create it
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

	public void setFile() {
		System.out.println("enter file name:");
		String file = Utility.readString();
		fileLocation = new File("/home/administrator/eclipse-workspace/"
				+ "BridgelabzModules/src/com/bridgelabz/oops/addressbook/"+file+".json");
	}
	
    
	public void setFile(String file) {
		fileLocation = new File("/home/administrator/eclipse-workspace/"
				+ "BridgelabzModules/src/com/bridgelabz/oops/addressbook/"+file+".json");
	}

	public File getFile() {
		return fileLocation;
	}
    public void loadObject()
    {
    	Vector<Person> tempvector=new Vector<Person>();
    	JSONParser parser = new JSONParser();
		Object obj=null;
		try {
			obj = parser.parse(new FileReader(getFile()));
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		JSONArray name = (JSONArray) obj;
		for (int i = 0; i < name.size(); i++) {
			JSONObject nameobj = (JSONObject) name.get(i);
			
			tempvector.add(new Person(nameobj.get("First Name").toString(), nameobj.get("Last Name").toString(),
				nameobj.get("Address").toString(),nameobj.get("City").toString(),nameobj.get("State").toString(),
				nameobj.get("ZIP").toString(),nameobj.get("Mobile").toString()));
        
		}
		addressBook=tempvector;
		}
    
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
