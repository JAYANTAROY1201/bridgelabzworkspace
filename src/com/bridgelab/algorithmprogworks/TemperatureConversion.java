package com.bridgelab.algorithmprogworks;

import com.bridgelabz.utility.Utility;

public class TemperatureConversion {

	public static void main(String[] args) {
		int choice;
		System.out.println("Press 1 for convert celsius to fahrenheit");
		System.out.println("press 2 for convert fahrenheit to celsius");
		choice=Utility.readInteger();
		switch(choice)
		{
		case 1: Utility.tempConversionCelToFahr();
		break;
		case 2: Utility.tempConversionFahrenToCel();
		break;
		default:System.out.println("Wrong choice");
		}

	}
	
	
}
