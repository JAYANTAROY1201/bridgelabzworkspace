package com.bridgelabz.oops.addressbook;

import java.io.Serializable;
import java.util.Comparator;

import com.bridgelabz.utility.Utility;

/**
 * Purpose: This class is designed to maintain information about a single individual.
 * @author Jayanta Roy
 * @version 1.0
 * @since 05/06/18
 */
public class Person extends Object implements Serializable {

	static String firstName;
	static String lastName;
	static String address;
	static String city;
	static String state;
	static String zip;
	static String mobile;

	/**
	 * 
	 */
	public Person() {
		setFirstName();
		setLastName();
		setAddress();
		setCity();
		setState();
		setZip();
		setMobile();
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
	public Person(String firstName, String lastName, String address, String city, String state, String zip, String mobile) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.mobile = mobile;
	}

	/**
	 * 
	 */
	public void setFirstName() {
		this.firstName = Utility.readString();
	}

	/**
	 * 
	 */
	public void setLastName() {
		this.lastName = Utility.readString();
	}

	/**
	 * 
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 
	 */
	public void setAddress() {
		
		this.address =  Utility.readString();
	}
	/**
	 * 
	 */
	public void setCity() {
		this.city = Utility.readString();
	}
	
	/**
	 * 
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * 
	 */
	public void setState() {
		this.state = Utility.readString();
	}
	/**
	 * 
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * 
	 */
	public void setZip() {
		this.zip =Utility.readString();
	}
	/**
	 * 
	 */
	public void setZip(String zip) {
		this.zip =zip;
	}
	/**
	 * 
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * 
	 */
	public void setMobile() {
		this.mobile = Utility.readString();
	}
	
	/**
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return
	 */
	public String getState() {
		return state;
	}

	/**
	 * @return
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * @return
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param address
	 * @param city
	 * @param state
	 * @param zip
	 * @param mobile
	 */
	public void update(String address, String city, String state, String zip, String mobile) {
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.mobile = mobile;

	}

	/**
	 * @author administrator
	 *
	 */
	public static class CompareByName {

		/**
		 * 
		 */
		public CompareByName() {
		}

		/**
		 * @param obj1
		 * @param obj2
		 * @return
		 * @throws ClassCastException if either parameter is not a
		 *			   Person object
		 */
		public int compare(Object obj1, Object obj2) throws ClassCastException {
			Person person1 = (Person) obj1;
			Person person2 = (Person) obj2;
			int compareByLastName=person1.lastName.compareTo(person2.lastName);
			if(compareByLastName!=0)
			{
				return compareByLastName;
			}
			else {
				return (person1.firstName.compareTo(person2.firstName));
			}
		}

		/**
		 * @param obj1
		 * @param obj2
		 * @return true if both persons have same name otherwise false
		 * @throws ClassCastException if either parameter is not a
		 *			   Person object
		 */
		public boolean equals(Object obj1, Object obj2) throws ClassCastException {
			Person person1 = (Person) obj1;
			Person person2 = (Person) obj2;
			return compare(person1,person2) == 0 ? true : false;
		}

	}

	/**
	 * @author administrator
	 *
	 */
	public static class CompareByZip {

		/**
		 * 
		 */
		public CompareByZip() {
		}

		/**
		 * @param obj1
		 * @param obj2
		 * @return
		 * @throws ClassCastException if either parameter is not a
		 *			   Person object
		 */
		public int compare(Object obj1, Object obj2) throws ClassCastException {
			Person person1 = (Person) obj1;
			Person person2 = (Person) obj2;
			int compareByZip=person1.zip.compareTo(person2.zip);
			if(compareByZip!=0)
			{
				return compareByZip;
			}
			else {
				return new CompareByName().compare(person1, person2);
			}
			
		}

		/**
		 * @param obj1
		 * @param obj2
		 * @return
		 * @throws ClassCastException if either parameter is not a
		 *			   Person object
		 */
		public boolean equals(Object obj1, Object obj2) throws ClassCastException {
			Person person1 = (Person) obj1;
			Person person2 = (Person) obj2;
			return person1.zip.compareTo(person2.zip) == 0 ? true : false;
		}
	}
}
