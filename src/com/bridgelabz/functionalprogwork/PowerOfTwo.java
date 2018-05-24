package com.bridgelabz.functionalprogwork;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To print the table of power of two
 * 
 * @author JAYANTA ROY
 * @version 1.0
 * @since 22-05-2018
 */
public class PowerOfTwo {
	public static void main(String[] args) {
		int num;
		num = Integer.parseInt(args[0]);
		if (num < 31)
			Utility.findPowerOfTwo(num);

	}

}
