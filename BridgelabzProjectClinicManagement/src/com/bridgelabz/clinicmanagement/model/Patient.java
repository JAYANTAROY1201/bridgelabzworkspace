package com.bridgelabz.clinicmanagement.model;

import com.bridgelabz.clinicmanagement.utility.UtilityClinic;

/**
 * Purpose: this class is designed to maintain doctor list
 * @author Jayanta Roy
 * @version 1.0
 * @since 11/06/18
 */
public class Patient {
	static String patName;
	static String patId;
	static String patMob;
	static String patAge;

	public Patient() {
		setPatName();
		setPatMob();
		setPatId();
		setpatAge();
		viewPat();
	}

	/**
	 * this method is written to set the patient's name
	 */
	@SuppressWarnings("static-access")
	public void setPatName() {
		System.err.println("Enter patient name");
		String patName = UtilityClinic.readStringLine();
		this.patName = patName;
	}

	/**
	 * this method is written to set the patient's id
	 */
	@SuppressWarnings("static-access")
	public void setPatId() {
		String patId = getPatName().substring(0, 4) + getPatMob().substring(7, getPatMob().length());
		this.patId = patId;
	}

	/**
	 * this method is written to set the patient's mobile
	 */
	@SuppressWarnings("static-access")
	public void setPatMob() {
		System.err.println("Enter patient Mobile number:");
		String patMob = UtilityClinic.readString();
		this.patMob = patMob;
	}

	/**
	 * this method is written to set the patient's age
	 */
	@SuppressWarnings("static-access")
	public void setpatAge() {
		System.err.println("Enter patient age:");
		String patAge = UtilityClinic.readString();
		this.patAge = patAge;
	}

	/**
	 * this method is written to get the patient's name
	 * 
	 * @return patient's name
	 */
	public String getPatName() {
		return patName;
	}

	/**
	 * this method is written to set the patient's id
	 * 
	 * @return patient's id
	 */
	public String getPatId() {
		return patId;
	}

	/**
	 * this method is written to set the patient's mobile
	 * 
	 * @return patient's mobile
	 */
	public String getPatMob() {
		return patMob;
	}

	/**
	 * this method is written to set the patient's age
	 * 
	 * @return patient's age
	 */
	public String getpatAge() {
		return patAge;
	}

	/**
	 * this method is written to view patient details
	 */
	public void viewPat() {
		System.out.println("Name:" + getPatName());
		System.out.println("ID:" + getPatId());
		System.out.println("Age:" + getpatAge());
		System.out.println("Mobile:" + getPatMob());
	}
}
