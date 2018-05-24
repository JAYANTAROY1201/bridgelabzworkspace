package com.bridgelabz.functionalprogwork;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To find the roots of a quardatic equation
 * 
 * @author JAYANTA ROY
 * @version 1.0
 * @since 22-05-2018
 */
public class Quadratic {

	public static void main(String[] args) {
		int a, b, c;

		Utility util = new Utility();

		System.out.println("Enter value of a:");
		a = Utility.readInteger();
		System.out.println("Enter value of b:");
		b = Utility.readInteger();
		System.out.println("Enter value of c:");
		c = Utility.readInteger();
		util.findingRoots(a, b, c);
	}
}
