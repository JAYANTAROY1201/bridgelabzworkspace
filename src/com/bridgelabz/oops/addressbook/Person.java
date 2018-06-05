package com.bridgelabz.oops.addressbook;

import java.io.Serializable;

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
	static Long zip;
	static Long mobile;

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
	public Person(String firstName, String lastName, String address, String city, String state, Long zip, Long mobile) {
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
	public void setAddress() {
		this.address = Utility.readString();
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
	public void setState() {
		this.state = Utility.readString();
	}

	/**
	 * 
	 */
	public void setZip() {
		this.zip = Utility.readLong();
	}

	/**
	 * 
	 */
	public void setMobile() {
		this.mobile = Utility.readLong();
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
	public Long getZip() {
		return zip;
	}

	/**
	 * @return
	 */
	public Long getMobile() {
		return mobile;
	}

	/**
	 * @param address
	 * @param city
	 * @param state
	 * @param zip
	 * @param mobile
	 */
	public void update(String address, String city, String state, Long zip, Long mobile) {
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
	public static class PersonCompareByName {

		/**
		 * 
		 */
		public PersonCompareByName() {
		}

		/**
		 * @param obj1
		 * @param obj2
		 * @return
		 * @throws ClassCastException
		 */
		public int compare(Object obj1, Object obj2) throws ClassCastException {
			Person person1 = (Person) obj1;
			Person person2 = (Person) obj2;
			return person1.lastName.compareTo(person2.lastName) != 0 ? (person1.lastName.compareTo(person2.lastName))
					: (person1.firstName.compareTo(person2.firstName));
		}

		/**
		 * @param obj1
		 * @param obj2
		 * @return
		 * @throws ClassCastException
		 */
		public boolean equals(Object obj1, Object obj2) throws ClassCastException {
			Person person1 = (Person) obj1;
			Person person2 = (Person) obj2;
			return person1.firstName.compareTo(person2.firstName) == 0 ? true : false;
		}

	}

	/**
	 * @author administrator
	 *
	 */
	public static class PersonCompareByZip {

		/**
		 * 
		 */
		public PersonCompareByZip() {
		}

		/**
		 * @param obj1
		 * @param obj2
		 * @return
		 * @throws ClassCastException
		 */
		public int compare(Object obj1, Object obj2) throws ClassCastException {
			Person person1 = (Person) obj1;
			Person person2 = (Person) obj2;
			return person1.zip.compareTo(person2.zip);
		}

		/**
		 * @param obj1
		 * @param obj2
		 * @return
		 * @throws ClassCastException
		 */
		public boolean equals(Object obj1, Object obj2) throws ClassCastException {
			Person person1 = (Person) obj1;
			Person person2 = (Person) obj2;
			return person1.zip.compareTo(person2.zip) == 0 ? true : false;
		}
	}
}
