package com.bridgelab.algorithmprogworks;

import com.bridgelabz.utility.Utility;

public class BubbleSortOfIntegers {

	public static void main(String[] args) {
		int a[]=Utility.createOneDimensionalIntArray();
		System.out.println("After sorting");
        Utility.PrintOneDimensionArray(Utility.bubbleSortForInt(a));
	}
	
	

}
