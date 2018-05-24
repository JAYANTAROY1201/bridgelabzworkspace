package com.bridgelabz.algorithmprogworks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import com.bridgelabz.utility.Utility;

/**
 * purpose: to find a word from a given file
 * 
 * @author JAYANTA ROY
 * @version 1.0
 * @since 22-05-2018
 */
public class BinarySearchForWord {

	public static void main(String[] args) {

		File f = new File("/home/administrator/eclipse-workspace/BridgelabzModules/myFile.txt");
		FileReader fs = null;
		int count = 0;
		ArrayList<String> a = new ArrayList<String>();
		BufferedReader fo = null;
		try {
			fs = new FileReader(f);
			fo = new BufferedReader(fs);
			String word = fo.readLine();
			System.out.println(word);
			while (word != null) {
				String[] str = word.split(",");
				for (int i = 0; i < str.length; i++) {
					count++;
					a.add(str[i]);
				}
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		String[] str1 = new String[count];
		for (int i = 0; i < a.size(); i++) {
			str1[i] = a.get(i);
		}
		System.out.println("Enter the word you want to search");
		String word = Utility.readString();
		Utility.binarySearchStringArray(str1, word);
	}
}
