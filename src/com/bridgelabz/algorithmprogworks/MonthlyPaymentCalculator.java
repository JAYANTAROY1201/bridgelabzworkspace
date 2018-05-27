package com.bridgelabz.algorithmprogworks;

/**
 * Purpose : To find monthly payment
 * @author JAYANTA ROY
 * @version 1.0
 * @since 22-05-2018
 */
public class MonthlyPaymentCalculator {

	public static void main(String[] args) {

		int p0 = Integer.parseInt(args[0]);
		int y0 = Integer.parseInt(args[1]);
		int r0 = Integer.parseInt(args[2]);

		double n = 12 * y0;
		double r1 = r0 / (12 * 1000);
		double p1 = ((p0 * r1) / (1 - Math.pow((1 + r0), (-n))));
		System.out.println("monthly payment:" + p1);

	}

}
