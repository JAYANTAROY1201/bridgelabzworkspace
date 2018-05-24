package com.bridgelabz.algorithmprogworks;

import com.bridgelabz.utility.Utility;

public class GenericSample {

	public static void main(String[] args) {
//		int num1 = Utility.readInteger();
//		int num2 = Utility.readInteger();
//		int num3 = Utility.readInteger();
//		System.out.println(findMax(num1, num2, num3));

		String str1 = Utility.readString();
		String str2 = Utility.readString();
		String str3 = Utility.readString();
		System.out.println(findMaximum(str1,str2,str3));

	}

//	public static int findMax(int a, int b, int c) {
//
//		return (a > b) ? ((a > c) ? a : b) : c;
//	}

	public static <T extends Comparable<T>> T findMaximum(T value1, T value2, T value3)  {

		return value1.compareTo(value2) >0 ? (value1.compareTo(value2) > 0 ? value1 : value2) : value3;
	}
}
