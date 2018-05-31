package com.bridgelabz.functionalprogwork;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To generate a coupon
 * @author JAYANTA ROY
 * @version 1.0
 * @since 22-05-2018
 */
public class CouponNumber {
	public static void main(String[] args) {
		int lengthOfCoupon;
		Utility util = new Utility();
		System.out.println("Enter the length of coupon:");
		lengthOfCoupon = Utility.readInteger();

		util.generatorCouponCode(lengthOfCoupon);
	}

}
