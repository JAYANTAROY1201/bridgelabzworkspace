package com.bridgelabz.clinicmanagement.model;

import com.bridgelabz.clinicmanagement.utility.UtilityClinic;

public class Patient {
	static String patName;
	static String patId;
	static String patMob;
	static String patAge;
	
	public Patient()
	{
	setPatName();
	setPatMob();
	setPatId();	
	setpatAge();
	viewPat();
	}
	
	@SuppressWarnings("static-access")
	public void setPatName() {
		System.err.println("Enter patient name");
		String patName = UtilityClinic.readStringLine();
		this.patName = patName;
	}

	@SuppressWarnings("static-access")
	public void setPatId() {
		String patId = getPatName().substring(0,4)+getPatMob().substring(7, getPatMob().length());
		this.patId = patId;
	}

	@SuppressWarnings("static-access")
	public void setPatMob() {
		System.err.println("Enter patient Mobile number:");
		String patMob = UtilityClinic.readString();
		this.patMob = patMob;
	}

	@SuppressWarnings("static-access")
	public void setpatAge() {
		System.err.println("Enter patient age:");
		String patAge = UtilityClinic.readString();
		this.patAge = patAge;
	}
	
	public String getPatName() {
		return patName;
	}

	public String getPatId() {
		return patId;
	}

	public String getPatMob() {
		return patMob;
	}

	public String getpatAge() {
		return patAge;
	}
	
	public void viewPat()
	{
		System.out.println("Name:"+getPatName());
		System.out.println("ID:"+getPatId());
		System.out.println("Age:"+getpatAge());
		System.out.println("Mobile:"+getPatMob());
	}

}
