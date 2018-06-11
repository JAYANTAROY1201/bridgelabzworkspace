package com.bridgelabz.clinicmanagement.serviceimplementation;

import java.io.FileNotFoundException;

import org.json.simple.JSONObject;

import com.bridgelabz.clinicmanagement.model.Doctor;
import com.bridgelabz.clinicmanagement.model.Patient;
import com.bridgelabz.clinicmanagement.utility.UtilityClinic;;

public class ManagerServiceImplementation {

	UtilityClinic util= new UtilityClinic();
	
	
	 @SuppressWarnings("unchecked")
	public void addDoctor()
	    {
	      if(UtilityClinic.docFile==null)
	      {
	    	  try {
	    		  util.accessExistingDocJson();
			} catch (FileNotFoundException e) {
				util.createDocJson();
			}  
	      }
	      util.readFromDocJson(UtilityClinic.docFile);
	      JSONObject docObject=new JSONObject();
	      Doctor doc=new Doctor();
	      docObject.put("Doctor's name", doc.getDocName());
	      docObject.put("Doctor's ID", doc.getDocId());
	      docObject.put("Specialization", doc.getDocSpecialization());
	      docObject.put("Availibility day", doc.getDocAvailibilityDay());
	      docObject.put("Availibility time", doc.getDocAvailibilityTime());
	      UtilityClinic.docJson.add(docObject);
	      util.writetoJson(UtilityClinic.docJson, util.getDocFileName()); 
	      util.readFromDocJson(util.getDocFileName());
	      
	    }
	    
	 
	    @SuppressWarnings("unchecked")
		public void addPatient()
	    {
	      if(UtilityClinic.patFile==null)
	      {
	    	  try {
				util.accessExistingPatJson();
			} catch (FileNotFoundException e) {
              util.createPatJson();
			}
	      }
	      util.readFromPatJson(util.patFile);
	      JSONObject patObject=new JSONObject();
	      Patient pat=new Patient();
	      patObject.put("Patient's name", pat.getPatName());
	      patObject.put("Patient's ID", pat.getPatId());
	      patObject.put("Mobile", pat.getPatMob());
	      patObject.put("Age", pat.getpatAge());
	      UtilityClinic.patJson.add(patObject);
	      util.writetoJson(UtilityClinic.patJson, util.getPatFileName());
	      util.readFromPatJson(util.getPatFileName());
	    }
}
