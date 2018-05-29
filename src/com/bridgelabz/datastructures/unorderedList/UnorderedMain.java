package com.bridgelabz.datastructures.unorderedList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import com.bridgelabz.utility.Utility;

/**
 * purpose: To perform actions using unordered list
 * @author JAYANTA ROY
 * @version 1.0
 * @since 24-05-2018
 */
public class UnorderedMain {

	public static void main(String[] args) {
		UnorderedList list=UnorderedList.list();
		File f = new File("/home/administrator/eclipse-workspace/BridgelabzModules/myFile2.txt");
		System.out.println("Enter the word you want to search:");
		String searchItem = Utility.readString();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(f));
			String word = reader.readLine();
			System.out.println(word);
			while (word != null) {
				String[] str = word.split(" ");
				for (int i = 0; i < str.length; i++) {
					list.add(str[i]);
				}
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (list.search(searchItem)) {
			list.remove(searchItem);
		} else {
			list.add(searchItem);
		}

		String out = "";
		while (list.size() > 0) {
			out = list.pop() + " " + out;
		}

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(f));
			writer.write(out);
			System.out.println();
			System.out.println("file written successfully");
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
