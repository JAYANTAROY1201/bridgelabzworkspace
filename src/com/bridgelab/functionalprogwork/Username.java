package com.bridgelab.functionalprogwork;

import com.bridgelabz.utility.Utility;

/******************************************************************************
 * 
 *  Purpose: To print “Hello <<UserName>>, How are you?” where <<UserName>> should be replace with user name.
 *
 *  @author  Jayanta Roy
 *  @version 1.0
 *  @since   17-05-2018
 *
 ******************************************************************************/


public class Username
{
	public static void main(String[] args) 
	{
		String user="";
		Utility util=new Utility();
		System.out.println("enter user name:");
		user=util.readString();
		if(user.length()>3) 
		{
		System.out.println(util.replaceUserName(user));
	    }
    }
}


