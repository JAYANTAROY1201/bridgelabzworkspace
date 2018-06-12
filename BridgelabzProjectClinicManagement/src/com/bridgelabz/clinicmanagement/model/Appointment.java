package com.bridgelabz.clinicmanagement.model;

/**
 * Purpose: this class is designed to maintain appointment
 * @author Jayanta Roy
 * @version 1.0
 * @since 11/06/18
 */
public class Appointment {

	static String doctorName;
	static String doctorId;
	static String patientName;
	static String patientId;
	static String timeStamp;

	public Appointment(String doctorName, String doctorId, String patientName, String patientId, String timeStamp) {
		this.doctorName = doctorName;
		this.doctorId = doctorId;
		this.patientName = patientName;
		this.patientId = patientId;
		this.timeStamp = timeStamp;
	}

	/**
	 * this method is written to get the doctor name of appointment
	 * 
	 * @return doctor's name
	 */
	public String getDoctorName() {
		return doctorName;
	}

	/**
	 * this method is written to get the doctor id of an appointment
	 * 
	 * @return doctor's id
	 */
	public String getDoctorId() {
		return doctorId;
	}

	/**
	 * this method is written to get the patient's name of appointment
	 * 
	 * @return patient's name
	 */
	public String getPatientName() {
		return patientName;
	}

	/**
	 * this method is written to get the patient's idof appointment
	 * 
	 * @return patient's id
	 */
	public String getPatientId() {
		return patientId;
	}

	/**
	 * this method is written to get timing of appointment
	 * 
	 * @return
	 */
	public String getTime() {
		return timeStamp;
	}

}
