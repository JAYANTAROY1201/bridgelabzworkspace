package com.bridgelabz.functionalprogwork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.bridgelabz.utility.Utility;

/**
 * Purpose : To print username
 * @author JAYANTA ROY
 * @version 1.0
 * @since 22-05-2018
 */
public class Username {
	private static String REGEX = "<<UserName>>";
	private static String userName;
	private static String temp = "Hello <<UserName>>, How are you?";

	public static void main(String[] args) {
		System.out.println("Enter your name:");
		userName = Utility.readString();
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(temp);
		temp = m.replaceAll(userName);
		System.out.println(temp);
	}
}
