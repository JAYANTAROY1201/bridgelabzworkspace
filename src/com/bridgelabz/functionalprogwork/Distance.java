package com.bridgelabz.functionalprogwork;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To find the distance between two points
 * @author JAYANTA ROY
 * @version 1.0
 * @since 22-05-2018
 */
public class Distance {

	public static void main(String[] args) {
		double x, y;
		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);

		Utility util = new Utility();
		util.calculateEuclieanDistance(x, y);
	}
}
