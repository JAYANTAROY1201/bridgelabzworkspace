package com.bridgelab.algorithmprogworks;

import com.bridgelabz.utility.Utility;

public class BubbleSortOfString {

	public static void main(String[] args) {
		System.out.println("Enter your String");
		String a=Utility.readString();
		System.out.println("After sorting");
        System.out.println(Utility.bubbleSortForString(a));

	}

}
