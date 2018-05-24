package com.bridgelabz.functionalprogwork;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To find effective temperature of a wind mill
 * 
 * @author JAYANTA ROY
 * @version 1.0
 * @since 22-05-2018
 */
public class WindChill {

	public static void main(String[] args) {
		int t, v;
		t = Integer.parseInt(args[0]);
		v = Integer.parseInt(args[1]);

		Utility util = new Utility();

		util.calculateEffectiveTemp(t, v);

	}

}
