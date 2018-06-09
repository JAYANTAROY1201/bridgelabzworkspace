package com.bridgelabz.clinicmanagement.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class UtilityClinic {
	public static JSONArray docJson;
	public static JSONArray patJson;
    public static File file=null;
    public static File docFile;
    public static File patFile;
    public static JSONArray jsArray;
	static Scanner sc = new Scanner(System.in);

	/*
	 * number variable stores the number entered by the user as the input
	 */
	public static int readInteger() {
		int number = sc.nextInt();

		return number;
	}
	
	/*
	 * number variable stores the number entered by the user as the input
	 */
	public static Long readLong() {
		Long number = sc.nextLong();

		return number;
	}
	
	/*
	 * number variable stores the number entered by the user as the input
	 */
	public static Double readDouble() {
		Double number = sc.nextDouble();

		return number;
	}
	// ____________________________________________________________________________________________________________

	/*
	 * String variable stores the String entered by the user as the input
	 */
	public static String readString() {
		String str = sc.next();
		return str;
	}

	// _______________________________________________________________________________________

	/*
	 * String variable stores the String entered by the user as the input
	 */
	public static char readCharacter() {
		char str = sc.next().charAt(0);
		// sc.close();
		return str;
	}
	
    public void createJsonFile()
		{
			System.out.println("Enter file name:");
			String fileName=readString();
			file = new File("/home/administrator/eclipse-workspace/BridgelabzModules"
					+ "/src/com/bridgelabz/oops/clinicmanagement/" + fileName+".json");
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
	    
	    public void setDocFileName(File file)
	    {
	       this.docFile=file;	
	    }
	    public File getDocFileName()
	    {
	    	return docFile;
	    }
	    
	    public void setPatFileName(File file)
	    {
	       this.patFile=file;	
	    }
	    public File getPatFileName()
	    {
	    	return patFile;
	    }
	    public void readFromDocJson(File jsonFile)
	    {
	       JSONParser parser=new JSONParser();
	       try {
			Object obj=parser.parse(new FileReader(jsonFile));
			docJson=(JSONArray) obj;
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
	    }
	    public void readFromPatJson(File jsonFile)
	    {
	       JSONParser parser=new JSONParser();
	       try {
			Object obj=parser.parse(new FileReader(jsonFile));
			patJson=(JSONArray) obj;
			
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
	    }

	    
	    public void writetoJson(JSONArray arrayJson, File jsonFile)
	    {
	    	try {
				FileWriter fw=new FileWriter(jsonFile);
				fw.write(arrayJson.toString());
				fw.flush();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    
	    public void createDocJson()
	    {
	    	createJsonFile();
	    	setDocFileName(file);
	    	docJson=new JSONArray();
	    	writetoJson(docJson, getDocFileName());	
	    }
	    
	    
	    public void createPatJson()
	    {
	    	createJsonFile();
	    	setPatFileName(file);
	    	patJson=new JSONArray();
	    	writetoJson(patJson, getPatFileName());	
	    }
	    
	    public void accessExistingDocJson() throws FileNotFoundException
	    {
	    	System.out.println("Enter doctor file name:");  
	    	String temp=readString();
	    	docFile= new File("/home/administrator/eclipse-workspace/BridgelabzModules"
	    			+ "/src/com/bridgelabz/oops/clinicmanagement/" + temp+".json");
	    }
	   
	    
	    public void accessExistingPatJson() throws FileNotFoundException
	    {
	    	System.out.println("Enter patient file name:");  
	    	String temp=readString();
	    	patFile= new File("/home/administrator/eclipse-workspace/BridgelabzModules"
	    			+ "/src/com/bridgelabz/oops/clinicmanagement/" + temp+".json");
	    }
	    
	   

}
