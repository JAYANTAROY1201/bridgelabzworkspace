/******************************************************************************
 * 
 *  Purpose: To print “Hello <<UserName>>, How are you?” where <<UserName>> should be replace with user name.
 *
 *  @author  Jayanta Roy
 *  @version 1.0
 *  @since   17-05-2018
 *
 ******************************************************************************/

package com.bridgelab.functionalprogwork;

import com.bridgelabz.utility.Utility;

public class CouponNumber {
public static void main(String[]args) 
{   
	int lengthOfCoupon;
	Utility util=new Utility();
	System.out.println("Enter the length of coupon:");
	lengthOfCoupon= Utility.readInteger();
	
	util.generatorCouponCode(lengthOfCoupon);
	}
	

}
