package com.bridgelab.functionalprogwork;

import com.bridgelabz.utility.Utility;

/**
 *  Purpose: To find Euclidean distance of given point to origin
 *
 *  @author  Jayanta Roy
 *  @version 1.0
 *  @since   18-05-2018
 *
 */

public class Distance {

	public static void main(String[] args) {
		double x,y;
		x=Integer.parseInt(args[0]);
		y=Integer.parseInt(args[1]);
		
		Utility util= new Utility();
		util.CalculateEuclieanDistance(x,y);
	}

}

