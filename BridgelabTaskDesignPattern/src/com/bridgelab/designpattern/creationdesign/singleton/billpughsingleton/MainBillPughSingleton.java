package com.bridgelab.designpattern.creationdesign.singleton.billpughsingleton;

public class MainBillPughSingleton {

	public static void main(String[] args) {
		BillPughSingleton bp1 = BillPughSingleton.getInstance();
		BillPughSingleton bp2 = BillPughSingleton.getInstance();
		bp1.str = bp1.str.toLowerCase();

		System.out.println(bp1.str);
		System.out.println(bp2.str);

	}

}
