package com.bridgelabz.clinicmanagement.model;

import com.bridgelabz.clinicmanagement.utility.UtilityClinic;

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

	@SuppressWarnings("static-access")
	public void setDocName() {
		String docName = UtilityClinic.readString();
		this.docName = docName;
	}

	@SuppressWarnings("static-access")
	public void setDocId() {
		String docId = UtilityClinic.readString();
		this.docId = docId;
	}

	@SuppressWarnings("static-access")
	public void setDocSpecialization() {
		String specialization = UtilityClinic.readString();
		this.specialization = specialization;
	}

	@SuppressWarnings("static-access")
	public void setDocAvailibilityDay() {
		String availibilityDay = UtilityClinic.readString();
		this.availibilityDay = availibilityDay;
	}

	@SuppressWarnings("static-access")
	public void setDocAvailibilityTime() {
		String availibilityTime = UtilityClinic.readString();
		this.availibilityTime = availibilityTime;
	}

	public String getDocName() {
		return docName;
	}

	public String getDocId() {
		return docId;
	}

	public String getDocSpecialization() {
		return specialization;
	}

	public String getDocAvailibilityDay() {
		return availibilityDay;
	}

	public String getDocAvailibilityTime() {
		return availibilityTime;
	}

}
