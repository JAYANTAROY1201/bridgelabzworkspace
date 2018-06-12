package com.bridgelabz.clinicmanagement.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Purpose: this class is designed to utilize all general methods of clinic
 * management
 * 
 * @author Jayanta Roy
 * @version 1.0
 * @since 11/06/18
 */
public class UtilityClinic {
	public static JSONArray docJson;
	public static JSONArray patJson;
	public static JSONArray appJson;
	public static File file = null;
	public static File docFile = null;
	public static File patFile = null;
	public static File appFile = null;

	public static JSONArray jsArray;
	static Scanner sc = new Scanner(System.in);
	public static ArrayList<Integer> docWisePatCounter = new ArrayList<Integer>();

	/**
	 * number variable stores the number entered by the user as the input
	 */
	public static Integer readInteger() {
		Integer number = sc.nextInt();
		return number;
	}

	/**
	 * number variable stores the number entered by the user as the input
	 */
	public static Long readLong() {
		Long number = sc.nextLong();
		return number;
	}

	/**
	 * number variable stores the number entered by the user as the input
	 */
	public static Double readDouble() {
		Double number = sc.nextDouble();

		return number;
	}

	/**
	 * String variable stores the String entered by the user as the input
	 */
	public static String readString() {
		String str = sc.next();
		return str;
	}

	/**
	 * String variable stores the String entered by the user as the input
	 */
	public static String readStringLine() {
		String str = sc.nextLine();
		return str;
	}

	/**
	 * String variable stores the String entered by the user as the input
	 */
	public static char readCharacter() {
		char str = sc.next().charAt(0);
		return str;
	}

	/**
	 * this method is written to create JSON file
	 */
	public void createJsonFile() {
		System.out.println("Enter file name:");
		String fileName = readString();
		file = new File("/home/administrator/eclipse-workspace/BridgelabzProject/src/files/" + fileName + ".json");
		try {
			if (file.createNewFile()) {
				System.out.println("new JSON file created with file name " + fileName);
			} else {
				System.out.println("File found....");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * this method is written to write a json file
	 * 
	 * @param arrayJson
	 * @param jsonFile
	 */
	public void writetoJson(JSONArray arrayJson, File jsonFile) {
		try {
			FileWriter fw = new FileWriter(jsonFile);
			fw.write(arrayJson.toString());
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * this method is written to set doctors file name
	 * 
	 * @param file
	 */
	@SuppressWarnings("static-access")
	public void setDocFileName(File file) {
		this.docFile = file;
	}

	/**
	 * this method is written to get doctors file name
	 * 
	 * @return Doctor's file name
	 */
	public File getDocFileName() {
		return docFile;
	}

	/**
	 * this method is written to read a json file and load it into local JSON array
	 * 
	 * @param jsonFile
	 */
	public void readFromDocJson(File jsonFile) {
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader(jsonFile));
			docJson = (JSONArray) obj;
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
	}

	/**
	 * this method is written to create a JSONfile for store doctor details
	 */
	public void createDocJson() {
		createJsonFile();
		setDocFileName(file);
		docJson = new JSONArray();
		writetoJson(docJson, getDocFileName());
	}

	/**
	 * this method is written to access details from a doctor json file
	 * 
	 * @throws FileNotFoundException
	 */
	public void accessExistingDocJson() throws FileNotFoundException {
		System.out.println("Enter doctor's file name:");
		String temp = readString();
		File mfile = new File("/home/administrator/eclipse-workspace/BridgelabzProject/src/files/" + temp + ".json");
		try {
			if (mfile.createNewFile()) {
				createDocJson();
			} else {
				setDocFileName(mfile);
				readFromDocJson(getDocFileName());
				writetoJson(docJson, getDocFileName());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * this method is written to set patients file name
	 * 
	 * @param file
	 */
	@SuppressWarnings("static-access")
	public void setPatFileName(File file) {
		this.patFile = file;
	}

	/**
	 * this method is written to get patient's file name
	 * 
	 * @return patient's file name
	 */
	public File getPatFileName() {
		return patFile;
	}

	/**
	 * this method is written to read a json file and load it into local JSON array
	 * 
	 * @param jsonFile
	 */
	public void readFromPatJson(File jsonFile) {
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader(jsonFile));
			patJson = (JSONArray) obj;

		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
	}

	/**
	 * this method is written to create a JSONfile for store patient's details
	 */
	public void createPatJson() {
		createJsonFile();
		setPatFileName(file);
		patJson = new JSONArray();
		writetoJson(patJson, getPatFileName());
	}

	/**
	 * this method is written to access details from a patient json file
	 * 
	 * @throws FileNotFoundException
	 */
	public void accessExistingPatJson() throws FileNotFoundException {
		System.out.println("Enter patient's file name:");
		String temp = readString();
		File mfile = new File("/home/administrator/eclipse-workspace/BridgelabzProject/src/files/" + temp + ".json");
		try {
			if (mfile.createNewFile()) {
				createPatJson();
			} else {
				setPatFileName(mfile);
				readFromPatJson(getPatFileName());
				writetoJson(patJson, getPatFileName());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * this method is written to set appointment file name
	 * 
	 * @param file
	 */
	@SuppressWarnings("static-access")
	public void setAppFileName(File file) {
		this.appFile = file;
	}

	/**
	 * this method is written to get appointment's file name
	 * 
	 * @return appointment's file name
	 */
	public File getAppFileName() {
		return appFile;
	}

	/**
	 * this method is written to read a json file and load it into local JSON array
	 * 
	 * @param jsonFile
	 */
	public void readFromAppJson(File jsonFile) {
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader(jsonFile));
			appJson = (JSONArray) obj;

		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
	}

	/**
	 * this method is written to create a JSONfile for store appointments details
	 */
	public void createAppJson() {
		createJsonFile();
		setAppFileName(file);
		appJson = new JSONArray();
		writetoJson(appJson, getAppFileName());
	}

	/**
	 * this method is written to access details from a appointment json file
	 * 
	 * @throws FileNotFoundException
	 */
	public void accessExistingAppJson() throws FileNotFoundException {
		System.out.println("Enter appointment file name:");
		String temp = readString();
		File mfile = new File("/home/administrator/eclipse-workspace/BridgelabzProject/src/files/" + temp + ".json");
		try {
			if (mfile.createNewFile()) {
				createAppJson();
			} else {
				setAppFileName(mfile);
				readFromAppJson(getAppFileName());
				writetoJson(appJson, getAppFileName());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
