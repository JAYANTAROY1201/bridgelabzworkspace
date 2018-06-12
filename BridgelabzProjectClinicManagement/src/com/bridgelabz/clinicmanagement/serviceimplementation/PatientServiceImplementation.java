package com.bridgelabz.clinicmanagement.serviceimplementation;

import java.io.FileNotFoundException;

import org.json.simple.JSONObject;

import com.bridgelabz.clinicmanagement.model.Appointment;
import com.bridgelabz.clinicmanagement.model.Patient;
import com.bridgelabz.clinicmanagement.service.GeneralPatientService;
import com.bridgelabz.clinicmanagement.utility.UtilityClinic;

/**
 * Purpose: this class is designed to implements the method of
 * GeneralPatientService
 * 
 * @author Jayanta Roy
 * @version 1.0
 * @since 11/06/18
 */
public class PatientServiceImplementation implements GeneralPatientService {
	static int count;
	static String pMob;
	static String pId;
	static String pName;
    
	UtilityClinic util = new UtilityClinic();

	/** 
	 * overridden method to show all patients details
	 * @see com.bridgelabz.clinicmanagement.service.GeneralPatientService#showPatientDetails()
	 */
	@Override
	public void showPatientDetails() {
		if (UtilityClinic.patFile == null) {
			try {
				util.accessExistingPatJson();
			} catch (FileNotFoundException e) {
				System.out.println("File not found");
				return;
			}
		}
		util.readFromPatJson(UtilityClinic.patFile);
		System.out.println();
		System.out.println("S.No  Patient's name     ID       Mobile    Age");
		for (int i = 1; i <= UtilityClinic.patJson.size(); i++) {
			JSONObject jsnobj = (JSONObject) UtilityClinic.patJson.get(i - 1);
			System.out.print(" " + i + "     " + jsnobj.get("Patient's name") + "        " + jsnobj.get("Patient's ID")
					+ "   " + jsnobj.get("Mobile") + "  " + jsnobj.get("Age") + "\n");
		}
		System.out.println();
	}

	/**
	 * Overrriden method to search a patient by name
	 * @see com.bridgelabz.clinicmanagement.service.GeneralPatientService#searchByName()
	 */
	@Override
	public void searchByName() {
		count = 0;
		if (UtilityClinic.patFile == null) {
			try {
				util.accessExistingPatJson();
			} catch (FileNotFoundException e) {
				System.out.println("File not found");
				return;
			}
		}
		util.readFromPatJson(UtilityClinic.patFile);
		System.out.println("Enter search.....");
		String search = UtilityClinic.readString();
		System.out.println("Showing search result(s).......");
		for (int i = 0; i < UtilityClinic.patJson.size(); i++) {
			JSONObject jsnobj = (JSONObject) UtilityClinic.patJson.get(i);
			if (jsnobj.get("Patient's name").toString().equals(search))
				System.out.print(
						++count + "   Name:" + jsnobj.get("Patient's name") + "   ID:" + jsnobj.get("Patient's ID")
								+ "   Mobile:" + jsnobj.get("Mobile") + "  Age:" + jsnobj.get("Age"));
		}
		if (count == 0) {
			System.out.println("No results found.....");
		}
	}

	/**
	 * Overrriden method to search a patient by name
	 * @see com.bridgelabz.clinicmanagement.service.GeneralPatientService#searchByID()
	 */
	@Override
	public void searchByID() {
		count = 0;
		if (UtilityClinic.patFile == null) {
			try {
				util.accessExistingPatJson();
			} catch (FileNotFoundException e) {
				System.out.println("File not found");
				return;
			}
		}
		util.readFromPatJson(UtilityClinic.patFile);
		System.out.println("Enter search.....");
		String search = UtilityClinic.readString();
		System.out.println("Showing search result(s).......");
		for (int i = 0; i < UtilityClinic.patJson.size(); i++) {
			JSONObject jsnobj = (JSONObject) UtilityClinic.patJson.get(i);
			if (jsnobj.get("Patient's ID").toString().equals(search))
				System.out.print(
						++count + "   Name:" + jsnobj.get("Patient's name") + "   ID:" + jsnobj.get("Patient's ID")
								+ "   Mobile:" + jsnobj.get("Mobile") + "  Age:" + jsnobj.get("Age"));
		}
		if (count == 0) {
			System.out.println("No results found.....");
		}
		System.out.println();
	}

	/**
	 * Overrriden method to search a patient by mobile
	 * @see com.bridgelabz.clinicmanagement.service.GeneralPatientService#searchByMobile()
	 */
	@Override
	public void searchByMobile() {
		count = 0;
		if (UtilityClinic.patFile == null) {
			try {
				util.accessExistingPatJson();
			} catch (FileNotFoundException e) {
				System.out.println("File not found");
				return;
			}
		}
		util.readFromPatJson(UtilityClinic.patFile);
		System.out.println("Enter search.....");
		String search = UtilityClinic.readString();
		System.out.println("Showing search result(s).......");
		for (int i = 0; i < UtilityClinic.patJson.size(); i++) {
			JSONObject jsnobj = (JSONObject) UtilityClinic.patJson.get(i);
			if (jsnobj.get("Mobile").toString().equals(search)) {
				pMob = jsnobj.get("Mobile").toString();
				pName = jsnobj.get("Patient's name").toString();
				pId = jsnobj.get("Patient's ID").toString();
				System.out.print(++count + "   Name:" + pName + "   ID:" + pId + "   Mobile:" + pMob + "  Age:"
						+ jsnobj.get("Age") + "\n\n");
			}
		}
		if (count == 0) {
			System.out.println("No results found.....");
		}
		System.out.println();
	}

	/**
	 * Overrriden method to take an appointment
	 * @see com.bridgelabz.clinicmanagement.service.GeneralPatientService#takeAppointment()
	 */
	@Override
	public void takeAppointment() {
		searchByMobile();
		if (count == 0) {
			new ManagerServiceImplementation().addPatient();
		}
		new DoctorServiceImplementation().showDoctorDetails();
		System.out.println("Enter doctor's ID:");
		String dID = UtilityClinic.readString();
		for (int i = 0; i < UtilityClinic.docJson.size(); i++) {
			JSONObject obj = (JSONObject) UtilityClinic.docJson.get(i);
			if (obj.get("Doctor's ID").toString().equals(dID)) {
				if (UtilityClinic.docWisePatCounter.isEmpty()) {
					for (int j = 0; j < UtilityClinic.docJson.size(); j++) {
						UtilityClinic.docWisePatCounter.add(0);
					}
				}
				if (UtilityClinic.docWisePatCounter.get(i) < 5) {
					new Appointment(obj.get("Doctor's name").toString(), dID, pName, pId,
							obj.get("Availibility time").toString());
					UtilityClinic.docWisePatCounter.add(i, UtilityClinic.docWisePatCounter.get(i) + 1);

					if (UtilityClinic.appFile == null) {
						try {
							util.accessExistingAppJson();
						} catch (FileNotFoundException e) {
							util.createAppJson();
						}
					}
					util.readFromAppJson(util.appFile);
					JSONObject appObject = new JSONObject();
					Appointment app = new Appointment(obj.get("Doctor's name").toString(), dID, pName, pId,
							obj.get("Availibility time").toString());
					appObject.put("Patient's name", app.getPatientName());
					appObject.put("Patient's ID", app.getPatientId());
					appObject.put("Doctor's name", app.getDoctorName());
					appObject.put("Doctor's ID", app.getDoctorId());
					appObject.put("Time stamp", app.getTime());
					UtilityClinic.appJson.add(appObject);
					util.writetoJson(UtilityClinic.appJson, util.getAppFileName());
					util.readFromAppJson(util.getAppFileName());
					System.out.println("Appointment done.....\n\n");
				} else {
					System.out.println("Sorry!!! Doctor is not available....Please try on next day.");
				}
			}
		}
	}
}
