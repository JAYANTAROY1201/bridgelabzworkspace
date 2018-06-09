package com.bridgelabz.clinicmanagement.serviceimpl;

import java.io.FileNotFoundException;

import org.json.simple.JSONObject;

import com.bridgelabz.clinicmanagement.utility.UtilityClinic;

public class DoctorServiceImplementation {
	UtilityClinic util=new UtilityClinic();
	
	public void showDoctorDetails()
	{
		if(UtilityClinic.docFile==null)
		{
			try {
				util.accessExistingDocJson();
			} catch (FileNotFoundException e) {
              System.out.println("File not found");
              return;
			}
		}
		util.readFromDocJson(UtilityClinic.docFile);
		System.out.println("S.No  Doctor's Name  ID  Specialization  Availibility day  Availibility time");
		for (int i = 1; i <= UtilityClinic.docJson.size(); i++) {
			JSONObject jsnobj=(JSONObject) UtilityClinic.docJson.get(i-1);
			System.out.print(" "+i+"   "+jsnobj.get("Doctor's name")+"   "+jsnobj.get("Doctor's ID")+"      "+
					jsnobj.get("Specialization")+"      "+jsnobj.get("Availibility day")+"       "
					+jsnobj.get("Availibility time"));			
		}
	}
	
	public void searchBySpecialization()
	{
		if(UtilityClinic.docFile==null)
		{
			try {
				util.accessExistingDocJson();
			} catch (FileNotFoundException e) {
              System.out.println("File not found");
              return;
			}
		}
		util.readFromDocJson(UtilityClinic.docFile);
		System.out.println("Choose your search option from the list");
		for (int i = 0; i < UtilityClinic.docJson.size(); i++) {
			JSONObject jsobj=(JSONObject) UtilityClinic.docJson.get(i);
			System.out.println(jsobj.get("Specialization"));		
		}
		System.out.println("Enter search.....");
		String search=UtilityClinic.readString();
		System.out.println("Showing doctors list");
		int count=0;
		for (int i = 0; i < UtilityClinic.docJson.size(); i++) {
			
			JSONObject jsnobj=(JSONObject) UtilityClinic.docJson.get(i);
			if(jsnobj.get("Specialization").toString().equals(search))
				System.out.print(++count+"   Name:"+jsnobj.get("Doctor's name")+"   ID:"+jsnobj.get("Doctor's ID")+"   Specialization:"+
						jsnobj.get("Specialization")+"  Available on:"+jsnobj.get("Availibility day")+"  Timing:"
						+jsnobj.get("Availibility time"));		
		}
		if(count==0)
		{
			System.out.println("No results found.....");
		}
		
	}
	
	public void searchByName()
	{
		int count=0;
		if(UtilityClinic.docFile==null)
		{
			try {
				util.accessExistingDocJson();
			} catch (FileNotFoundException e) {
              System.out.println("File not found");
              return;
			}
		}
		util.readFromDocJson(UtilityClinic.docFile);
		System.out.println("Enter search.....");
		String search=UtilityClinic.readString();
		System.out.println("Showing search result(s).......");
		for (int i = 0; i < UtilityClinic.docJson.size(); i++) {			
			JSONObject jsnobj=(JSONObject) UtilityClinic.docJson.get(i);
			if(jsnobj.get("Doctor's name").toString().equals(search))
				System.out.print(++count+"   Name:"+jsnobj.get("Doctor's name")+"   ID:"+jsnobj.get("Doctor's ID")+"   Specialization:"+
						jsnobj.get("Specialization")+"  Available on:"+jsnobj.get("Availibility day")+"  Timing:"
						+jsnobj.get("Availibility time"));		
		}
		if(count==0)
		{
			System.out.println("No results found.....");
		}
	}
}
