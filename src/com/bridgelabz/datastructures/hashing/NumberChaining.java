package com.bridgelabz.datastructures.hashing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import com.bridgelabz.datastructures.singlelinkedlist.SingleLinkedList;
import com.bridgelabz.utility.Utility;


/**
 * PURPOSE: TO OBTAIN A NUMBER CHAINING 
 * @author JAYANTA ROY
 * @version 1.0
 * @since 28-05-2018
 */
public class NumberChaining {

	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) {

		File f = new File("/home/administrator/eclipse-workspace/BridgelabzModules/numberchain.txt");
		FileReader fr = null;
		SingleLinkedList l = new SingleLinkedList();
		BufferedReader br = null;
		FileWriter fw = null;
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String word = br.readLine();
			System.out.println(word);
			while ((word != null)) {
				String[] str = word.split(" ");
				for (int i = 0; i < str.length; i++) {
					l.add((Integer.parseInt(str[i])));
				}
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
        
		System.out.println("enter search no:");
		int search=Utility.readInteger();
		
		if(l.search(search))
		{
			l.remove(search);
		}
		else
		{
			l.add(search);
		}
		
		SingleLinkedList array[] = new SingleLinkedList[11];
		for (int i = 0; i < 11; i++) {
			array[i] = new SingleLinkedList();
		}

		for (int i = 0; i < l.size(); i++) {
			int item = (int) l.get(i);
			int index = item % 11;
			array[index].add(item);
		}

		String temp = "";
		for (int i = 0; i < 11; i++) {
			int s = array[i].size();
			for (int j = 0; j < s; j++) {
				temp = temp + array[i].get(j) + " ";
			}
		}
		System.out.println("Printing string " + temp);

		UtilityHashing.writetofile(f, temp);
	}
}
