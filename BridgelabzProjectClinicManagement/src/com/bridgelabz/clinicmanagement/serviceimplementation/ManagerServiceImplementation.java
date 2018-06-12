package com.bridgelabz.clinicmanagement.serviceimplementation;

import java.io.FileNotFoundException;

import org.json.simple.JSONObject;

import com.bridgelabz.clinicmanagement.model.Doctor;
import com.bridgelabz.clinicmanagement.model.Patient;
import com.bridgelabz.clinicmanagement.service.GeneralManagerService;
import com.bridgelabz.clinicmanagement.utility.UtilityClinic;;

/**
 * Purpose: this class is designed to implements the method of
 * GeneralManagerService
 * 
 * @author Jayanta Roy
 * @version 1.0
 * @since 11/06/18
 */
public class ManagerServiceImplementation implements GeneralManagerService {

	UtilityClinic util = new UtilityClinic();

	/**
	 * overriden method to add a doctor into database. Here into json file.
	 * 
	 * @see com.bridgelabz.clinicmanagement.service.GeneralManagerService#addDoctor()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void addDoctor() {
		if (UtilityClinic.docFile == null) {
			try {
				util.accessExistingDocJson();
			} catch (FileNotFoundException e) {
				util.createDocJson();
			}
		}
		util.readFromDocJson(UtilityClinic.docFile);
		JSONObject docObject = new JSONObject();
		Doctor doc = new Doctor();
		docObject.put("Doctor's name", doc.getDocName());
		docObject.put("Doctor's ID", doc.getDocId());
		docObject.put("Specialization", doc.getDocSpecialization());
		docObject.put("Availibility day", doc.getDocAvailibilityDay());
		docObject.put("Availibility time", doc.getDocAvailibilityTime());
		UtilityClinic.docJson.add(docObject);
		util.writetoJson(UtilityClinic.docJson, util.getDocFileName());
		util.readFromDocJson(util.getDocFileName());

	}

	/**
	 * overriden method to add a patient into database. Here into json file.
	 * 
	 * @see com.bridgelabz.clinicmanagement.service.GeneralManagerService#addPatient()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void addPatient() {
		if (UtilityClinic.patFile == null) {
			try {
				util.accessExistingPatJson();
			} catch (FileNotFoundException e) {
				util.createPatJson();
			}
		}
		util.readFromPatJson(util.patFile);
		JSONObject patObject = new JSONObject();
		Patient pat = new Patient();
		patObject.put("Patient's name", pat.getPatName());
		patObject.put("Patient's ID", pat.getPatId());
		patObject.put("Mobile", pat.getPatMob());
		patObject.put("Age", pat.getpatAge());
		UtilityClinic.patJson.add(patObject);
		util.writetoJson(UtilityClinic.patJson, util.getPatFileName());
		util.readFromPatJson(util.getPatFileName());
	}
}
