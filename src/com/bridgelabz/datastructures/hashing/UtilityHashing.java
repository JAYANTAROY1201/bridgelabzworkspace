package com.bridgelabz.datastructures.hashing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * Purpose: to utilize methods for hashing
 * @author Jayanta Roy
 * @version 1.0
 * @since 29/05/18
 */
public class UtilityHashing {
	public static void writetofile(File f, String temp)
	{
		
		FileWriter fw=null;
		try {
			fw=new FileWriter(f);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(temp);
			bw.close();
			System.out.println();
			System.out.println("File updated successfully");
		}
		catch(Exception e) {
			e.printStackTrace();
			}
	      }
	}

