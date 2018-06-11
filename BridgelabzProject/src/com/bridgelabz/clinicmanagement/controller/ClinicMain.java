package com.bridgelabz.clinicmanagement.controller;

import com.bridgelabz.clinicmanagement.serviceimplementation.DoctorServiceImplementation;
import com.bridgelabz.clinicmanagement.serviceimplementation.ManagerServiceImplementation;
import com.bridgelabz.clinicmanagement.serviceimplementation.PatientServiceImplementation;
import com.bridgelabz.clinicmanagement.utility.UtilityClinic;

public class ClinicMain {

	public static void main(String[] args) {
		ManagerServiceImplementation mgr=new ManagerServiceImplementation();
		DoctorServiceImplementation dr= new DoctorServiceImplementation();
		PatientServiceImplementation pnt=new PatientServiceImplementation();
		boolean quit=false;
		while(quit==false)
		{
		System.out.println("***************************************************************************************************");	
		System.out.println("*----------------------------------GENERAL HEALTH CLINIC------------------------------------------*");
		System.out.println("***************************************************************************************************");	

		System.out.println("Enter choice:\n1 for ADD DOCTOR \n"
				+ "2 for ADD PATIENT\n"
				+ "3 for SHOW ALL DOCTORS\n"
				+ "4 for SEARCH DOCTOR \n"				
				+ "5 for SHOW ALL PATIENT INFORMATION\n"
				+ "6 for SEARCH PATIENT \n"
				+ "7 for TAKE APPOINTMENT\n"
				+ "Any other for exit");
		int cho=UtilityClinic.readInteger();
		switch(cho)
		{
		case 1: mgr.addDoctor();
		break;
		case 2:mgr.addPatient();
		break;
		case 3:dr.showDoctorDetails();
		break;
		case 4:System.out.println("Enter choice:\n1 for SEARCH BY NAME \n"
				+ "2 for SEARCH BY SPECIALIZATION\n"
				+ "Any other to CANCEL SEARCH\n\n");
		        int choi=UtilityClinic.readInteger();
		        switch(choi)
		        {
		        case 1:dr.searchByName();
		        break;
		        case 2:dr.searchBySpecialization();
		        break;
		        default:System.out.println("Search cancelled...");
		        break;
		        }
			
		break;		
		case 5:pnt.showPatientDetails();
		break;
		case 6:System.out.println("Enter choice:\n1 for SEARCH BY NAME \n"
				+ "2 for SEARCH BY ID\n"
				+ "3 for SEARCH BY MOBILE\n"
				+ "Any other to CANCEL SEARCH\n\n");
		        int choice=UtilityClinic.readInteger();
		        switch(choice)
		        {
		        case 1:pnt.searchByName();
		        break;
		        case 2:pnt.searchByID();
		        break;
		        case 3:pnt.searchByMobile();
		        break;
		        default:System.out.println("Search cancelled...");
		        break;
		        }
		break;
		case 7: pnt.takeAppointment();
		break;
		default:quit=true;
		break;
		}
	}
  }
}
