package com.bridgelab.functionalprogwork;

import com.bridgelabz.utility.Utility;

public class WindChill {

	public static void main(String[] args) 
	{
		int t,v;
		t = Integer.parseInt(args[0]);
		v = Integer.parseInt(args[1]);
		
		Utility util= new Utility();
		
		util.calculateEffectiveTemp(t,v);

	}

}


	
	
