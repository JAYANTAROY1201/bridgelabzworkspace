package com.bridgelabz.clinicmanagement.model;

import com.bridgelabz.clinicmanagement.utility.UtilityClinic;

/**
 * @author administrator
 *
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
	 * 
	 */
	@SuppressWarnings("static-access")
	public void setDocName() {
		System.out.println("Enter doctor's name:");
		String docName = UtilityClinic.readStringLine();
		this.docName = docName;
	}

	/**
	 * 
	 */
	@SuppressWarnings("static-access")
	public void setDocId() {
		System.out.println("Enter doctor's ID:");
		String docId = UtilityClinic.readString();
		this.docId = docId;
	}

	/**
	 * 
	 */
	@SuppressWarnings("static-access")
	public void setDocSpecialization() {
		System.out.println("Enter doctor's Specialization:");
		String specialization = UtilityClinic.readString();
		this.specialization = specialization;
	}

	/**
	 * 
	 */
	@SuppressWarnings("static-access")
	public void setDocAvailibilityDay() {
		System.out.println("Enter doctor's availibitily day:");
		String availibilityDay = UtilityClinic.readStringLine();
		this.availibilityDay = availibilityDay;
	}

	/**
	 * 
	 */
	@SuppressWarnings("static-access")
	public void setDocAvailibilityTime() {
		System.out.println("Enter doctor's availibility time:");
		String availibilityTime = UtilityClinic.readStringLine();
		this.availibilityTime = availibilityTime;
	}

	/**
	 * @return
	 */
	public String getDocName() {
		return docName;
	}

	/**
	 * @return
	 */
	public String getDocId() {
		return docId;
	}

	/**
	 * @return
	 */
	public String getDocSpecialization() {
		return specialization;
	}

	/**
	 * @return
	 */
	public String getDocAvailibilityDay() {
		return availibilityDay;
	}

	/**
	 * @return
	 */
	public String getDocAvailibilityTime() {
		return availibilityTime;
	}

}
