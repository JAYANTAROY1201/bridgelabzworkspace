package com.bridgelabz.datastructures.hashing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Purpose: to utilize methods for hashing
 * @author Jayanta Roy
 * @version 1.0
 * @since 07/06/18
 */
public class UtilityHashing {
	
	public static LinkedList fileRead(File readFile) {
		LinkedList myList=new LinkedList<>();
        BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(readFile));
			String word = br.readLine();
			System.out.println(word);
			while ((word != null)) {
				String[] str = word.split(" ");
				for (int i = 0; i < str.length; i++) {
					myList.add((Integer.parseInt(str[i])));
				}
				break;
		} 
		}
			catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return myList;
    	}
	public static void writetofile(File f, Map numberMap)
	{
		
		 FileWriter writer;
			try {
				writer = new FileWriter("/home/administrator/eclipse-workspace/BridgelabzModules/numberchainmap.txt");
				for (int i = 0; i < numberMap.size(); i++) {
					writer.write(numberMap.get(i) + " ");
					writer.flush();
				}
				writer.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
	}
}

