package com.bridgelabz.algorithmprogworks;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To find minimum sorting and searching time
 * @author JAYANTA ROY
 * @version 1.0
 * @since 22-05-2018
 */
public class TemperatureConversion {

	public static void main(String[] args) {
		int choice;
		System.out.println("Press 1 for convert celsius to fahrenheit");
		System.out.println("press 2 for convert fahrenheit to celsius");
		choice = Utility.readInteger();
		switch (choice) {
		case 1:
			Utility.tempConversionCelToFahr();
			break;
		case 2:
			Utility.tempConversionFahrenToCel();
			break;
		default:
			System.out.println("Wrong choice");
			break;
		}
	}
}
