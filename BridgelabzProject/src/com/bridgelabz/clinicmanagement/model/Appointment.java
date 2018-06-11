package com.bridgelabz.clinicmanagement.model;

/**
 * @author administrator
 *
 */
public class Appointment {

	static String doctorName;
	static String doctorId;
	static String patientName;
	static String patientId;
	static String timeStamp;

	@SuppressWarnings("static-access")
	public Appointment(String doctorName, String doctorId, String patientName, String patientId, String timeStamp) {
		this.doctorName = doctorName;
		this.doctorId = doctorId;
		this.patientName = patientName;
		this.patientId = patientId;
		this.timeStamp = timeStamp;
	}

	/**
	 * @return
	 */
	public String getDoctorName() {
		return doctorName;
	}

	/**
	 * @return
	 */
	public String getDoctorId() {
		return doctorId;
	}

	/**
	 * @return
	 */
	public String getPatientName() {
		return patientName;
	}

	/**
	 * @return
	 */
	public String getPatientId() {
		return patientId;
	}

	/**
	 * @return
	 */
	public String getTime() {
		return timeStamp;
	}

}
