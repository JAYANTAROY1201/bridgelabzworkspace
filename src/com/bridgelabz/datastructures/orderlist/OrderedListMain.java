package com.bridgelabz.datastructures.orderlist;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import com.bridgelabz.utility.Utility;

/**
 * purpose: To implement funcionalities of ordered list
 * @author JAYANTA ROY
 * @version 1.0
 * @since 25-05-2018
 */
public class OrderedListMain {

	public static void main(String[] args) {
		File f = new File("/home/administrator/eclipse-workspace/BridgelabzModules/numberfile.txt");
		System.out.println("Enter number to be search from file:");
		Integer searchItem = Utility.readInteger();
		OrderedList ol = OrderedList.orderedlist();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(f));
			String word = reader.readLine();
			System.out.print(word + "");
			System.out.println();
			while (word != null) {
				String[] str = word.split(" ");
				for (int i = 0; i < str.length; i++) {
					ol.add(Integer.parseInt(str[i]));
				}
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (ol.search(searchItem)) {
			ol.remove(searchItem);
		} else {
			ol.add(searchItem);
		}

		String out = "";
		while (ol.size() > 0) {
			out = ol.pop() + " " + out;
		}

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(f));
			writer.write(out);
			writer.flush();
			System.out.println();
			System.out.println("file written successfully");
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
