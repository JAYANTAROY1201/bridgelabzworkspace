package com.bridgelabz.clinicmanagement.service;

/**
 * Purpose: this interface is designed to generalize all methods of patient 
 * @author Jayanta Roy
 * @version 1.0
 * @since 11/06/18
 */
public interface GeneralPatientService {
	public void showPatientDetails();

	public void searchByName();

	public void searchByID();

	public void searchByMobile();

	public void takeAppointment();
}
