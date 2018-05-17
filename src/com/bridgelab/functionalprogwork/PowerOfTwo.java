package com.bridgelab.functionalprogwork;

import com.bridgelabz.utility.Utility;

public class PowerOfTwo {

	

	public static void main(String[] args) {
	   int num;
	   Utility util=new Utility();
	   num=Integer.parseInt(args[0]);
	   if(num<31)
	   util.find_PowerOfTwo(num);
	   

	}


}
