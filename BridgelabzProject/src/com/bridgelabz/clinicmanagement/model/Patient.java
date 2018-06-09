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
	setPatId();	
	setPatMob();
	setpatAge();
	}
	
	@SuppressWarnings("static-access")
	public void setPatName() {
		String patName = UtilityClinic.readString();
		this.patName = patName;
	}

	@SuppressWarnings("static-access")
	public void setPatId() {
		String patId = UtilityClinic.readString();
		this.patId = patId;
	}

	@SuppressWarnings("static-access")
	public void setPatMob() {
		String patMob = UtilityClinic.readString();
		this.patMob = patMob;
	}

	@SuppressWarnings("static-access")
	public void setpatAge() {
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

}
