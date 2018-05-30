package com.bridgelabz.oops.regex;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.utility.Utility;

/**
 * Purpose: to replace particular words by using REGEX
 * @author Jayanta Roy
 * @version 1.0
 * @since 30/05/18
 */
public class ReplaceUsingREGEX {
	static String template = "Hello <<name>>, We have your full "
			+ "name as <<full name>> in our system. Your contact number is 91-­xxxxxxxxxx.\n"
			+ "Please,let us know in case of any clarification.\n"
			+"Thank you BridgeLabz 01/01/2016.";

	public static void main(String[] args) {
		System.out.println("Enter the first name:");
		String fName = Utility.readString();
		System.out.println("Enter your last name:");
		String lName = Utility.readString();
		System.out.println("Enter your phone number:");
		String mobile = Utility.readString();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String date = dateFormat.format(new Date());

		String regexName = "(\\<<)(name)(\\>>)";
		String regexFullName = "(\\<<)(full name)(\\>>)";
		String regexDate = "(01/01/2016)";
		String regexMobile = "(xxxxxxxxxx)";
		template = UtilityRegex.regexReplacement(template, regexName, fName);
		template = UtilityRegex.regexReplacement(template, regexFullName, (fName + " " + lName));
		template = UtilityRegex.regexReplacement(template, regexDate, date);
		template = UtilityRegex.regexReplacement(template, regexMobile, mobile);

		System.out.println(template);
	}

}
