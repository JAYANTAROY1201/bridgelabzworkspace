package com.bridgelabz.datastructures.unorderedList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.bridgelabz.utility.Utility;

public class UnorderedMain {

	public static void main(String[] args) {
		File f = new File("/home/administrator/eclipse-workspace/BridgelabzModules/myFile2.txt");
		FileReader fs = null;
		FileWriter fw=null;
		String searchItem="jayanta";
		int count = 0;
		UnorderedList list= UnorderedList.list();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(f));
			String word = reader.readLine();
			System.out.println(word);
			while (word != null) {
				String[] str = word.split(" ");
				for (int i = 0; i < str.length; i++) {
					count++;
					list.add(str[i]);
				}
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(list.search(searchItem)) {
			list.remove(searchItem);
		}
		else
		{
			list.add(searchItem);
		}
		
		
		String out="";
		while(list.size()>0)
		{
			out=list.pop()+" "+out;
		}
		
		 try {
		    BufferedWriter writer = new BufferedWriter(new FileWriter(f));
		    writer.write(out);  
		    System.out.println();
		    System.out.println("file written successfully");
		    writer.close();
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	}

}
