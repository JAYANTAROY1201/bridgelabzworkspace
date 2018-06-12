package com.bridgelabz.clinicmanagement.model;

import com.bridgelabz.clinicmanagement.utility.UtilityClinic;

/**
 * Purpose: this class is designed to maintain doctor list
 * @author Jayanta Roy
 * @version 1.0
 * @since 11/06/18
 */
public class Doctor {
	static String docName;
	static String docId;
	static String specialization;
	static String availibilityDay;
	static String availibilityTime;

	public Doctor() {
		setDocName();
		setDocId();
		setDocSpecialization();
		setDocAvailibilityDay();
		setDocAvailibilityTime();
	}

	/**
	 * this method is written to set the doctor name 
	 */
	@SuppressWarnings("static-access")
	public void setDocName() {
		System.out.println("Enter doctor's name:");
		String docName = UtilityClinic.readStringLine();
		this.docName = docName;
	}

	/**
	 * this method is written to set the doctor id 
	 */
	@SuppressWarnings("static-access")
	public void setDocId() {
		System.out.println("Enter doctor's ID:");
		String docId = UtilityClinic.readString();
		this.docId = docId;
	}

	/**
	 * this method is written to set the doctor's specialization 
	 */
	@SuppressWarnings("static-access")
	public void setDocSpecialization() {
		System.out.println("Enter doctor's Specialization:");
		String specialization = UtilityClinic.readString();
		this.specialization = specialization;
	}

	/**
	 * this method is written to set the doctor's availibity day
	 */
	@SuppressWarnings("static-access")
	public void setDocAvailibilityDay() {
		System.out.println("Enter doctor's availibitily day:");
		String availibilityDay = UtilityClinic.readStringLine();
		this.availibilityDay = availibilityDay;
	}

	/**
	 * this method is written to set the doctor's availibity time
	 */
	@SuppressWarnings("static-access")
	public void setDocAvailibilityTime() {
		System.out.println("Enter doctor's availibility time:");
		String availibilityTime = UtilityClinic.readStringLine();
		this.availibilityTime = availibilityTime;
	}

	/**
	 * this method is written to get the doctor's name
	 * @return doctor's name
	 */
	public String getDocName() {
		return docName;
	}

	/**
	 * this method is written to get the doctor's id
	 * @return doctor's id
	 */
	public String getDocId() {
		return docId;
	}

	/**
	 * this method is written to get the doctor's specialization
	 * @return doctor's specialization
	 */
	public String getDocSpecialization() {
		return specialization;
	}

	/**
	 * this method is written to get the doctor's availibity day
	 * @return doctor's availibity day
	 */
	public String getDocAvailibilityDay() {
		return availibilityDay;
	}

	/**
	 * this method is written to get the doctor's availibity time
	 * @return doctor's availibity time
	 */
	public String getDocAvailibilityTime() {
		return availibilityTime;
	}
}
