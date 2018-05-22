package com.bridgelab.functionalprogwork;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To print username 
 * @author JAYANTA ROY
 * @version 1.0
 * @since   22-05-2018
 */
public class Username
{
	public static void main(String[] args) 
	{
		String user="";
		Utility util=new Utility();
		System.out.println("enter user name:");
		user=Utility.readString();
		if(user.length()>3) 
		{
		System.out.println(util.replaceUserName(user));
	    }
    }
}


