package com.bridgelabz.clinicmanagement.serviceimpl;

import java.io.FileNotFoundException;

import org.json.simple.JSONObject;

import com.bridgelabz.clinicmanagement.utility.UtilityClinic;

public class PatientServiceImplementation {
UtilityClinic util=new UtilityClinic();
	
	public void showPatientDetails()
	{
		if(UtilityClinic.patFile==null)
		{
			try {
				util.accessExistingPatJson();
			} catch (FileNotFoundException e) {
              System.out.println("File not found");
              return;
			}
		}
		util.readFromPatJson(UtilityClinic.patFile);
		System.out.println("S.No  Patient's name     ID     Mobile   Age");
		for (int i = 1; i <= UtilityClinic.patJson.size(); i++) {
			JSONObject jsnobj=(JSONObject) UtilityClinic.patJson.get(i-1);
			System.out.print(" "+i+"   "+jsnobj.get("Patient's name")+"   "+jsnobj.get("Patient's ID")+"   "+
					jsnobj.get("Mobile")+"  "+jsnobj.get("Age"));			
		}
    }
	
	public void searchByName()
	{
		int count=0;
		if(UtilityClinic.patFile==null)
		{
			try {
				util.accessExistingPatJson();
			} catch (FileNotFoundException e) {
              System.out.println("File not found");
              return;
			}
		}
		util.readFromPatJson(UtilityClinic.docFile);
		System.out.println("Enter search.....");
		String search=UtilityClinic.readString();
		System.out.println("Showing search result(s).......");
		for (int i = 0; i < UtilityClinic.patJson.size(); i++) {			
			JSONObject jsnobj=(JSONObject) UtilityClinic.patJson.get(i);
			if(jsnobj.get("Patient's name").toString().equals(search))
				System.out.print(++count+"   Name:"+jsnobj.get("Patient's name")+"   ID:"+jsnobj.get("Patient's ID")+"   Mobile:"+
						jsnobj.get("Mobile")+"  Age:"+jsnobj.get("Age"));			
		}
		if(count==0)
		{
			System.out.println("No results found.....");
		}
	}
	
	public void searchByID()
	{
		int count=0;
		if(UtilityClinic.patFile==null)
		{
			try {
				util.accessExistingPatJson();
			} catch (FileNotFoundException e) {
              System.out.println("File not found");
              return;
			}
		}
		util.readFromPatJson(UtilityClinic.patFile);
		System.out.println("Enter search.....");
		String search=UtilityClinic.readString();
		System.out.println("Showing search result(s).......");
		for (int i = 0; i < UtilityClinic.patJson.size(); i++) {			
			JSONObject jsnobj=(JSONObject) UtilityClinic.patJson.get(i);
			if(jsnobj.get("Patient's ID").toString().equals(search))
				System.out.print(++count+"   Name:"+jsnobj.get("Patient's name")+"   ID:"+jsnobj.get("Patient's ID")+"   Mobile:"+
						jsnobj.get("Mobile")+"  Age:"+jsnobj.get("Age"));			
		}
		if(count==0)
		{
			System.out.println("No results found.....");
		}
	}
	
	
	public void searchByMobile()
	{
		int count=0;
		if(UtilityClinic.patFile==null)
		{
			try {
				util.accessExistingPatJson();
			} catch (FileNotFoundException e) {
              System.out.println("File not found");
              return;
			}
		}
		util.readFromPatJson(UtilityClinic.patFile);
		System.out.println("Enter search.....");
		String search=UtilityClinic.readString();
		System.out.println("Showing search result(s).......");
		for (int i = 0; i < UtilityClinic.patJson.size(); i++) {			
			JSONObject jsnobj=(JSONObject) UtilityClinic.patJson.get(i);
			if(jsnobj.get("Mobile").toString().equals(search))
				System.out.print(++count+"   Name:"+jsnobj.get("Patient's name")+"   ID:"+jsnobj.get("Patient's ID")+"   Mobile:"+
						jsnobj.get("Mobile")+"  Age:"+jsnobj.get("Age"));			
		}
		if(count==0)
		{
			System.out.println("No results found.....");
		}
	}
	
	
}
