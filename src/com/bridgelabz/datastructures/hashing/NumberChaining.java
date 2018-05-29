package com.bridgelabz.datastructures.hashing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
/**
 * PURPOSE: TO OBTAIN A NUMBER CHAINING
 * @author JAYANTA ROY
 * @version 1.0
 * @since 28-05-2018
 */
public class NumberChaining<G extends Comparable<G>> {

	@SuppressWarnings({ "static-access", "unchecked" })
	public static void main(String[] args) {
		
		File f = new File("/home/administrator/eclipse-workspace/BridgelabzModules/numberchain.txt");		
		FileReader fr = null;
		ArrayList l = new ArrayList();
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
		
	
		ArrayList array[]=new ArrayList[11];
		for(int i=0;i<11;i++) {
			array[i]=new ArrayList();
		}
		
		
		
		for(int i=0;i<l.size();i++) {
			int item=(int) l.get(i);
			//System.out.println(item);
			int index= item%11;
			array[index].add(item);
		}
		
		String temp="";
		for(int i=0;i<11;i++) {	
			int s=array[i].size();
			for(int j=0;j<s;j++) {
				temp=temp+array[i].get(j)+" ";
			}
		}
		System.out.println("Printing string "+temp);
		try {
			fw=new FileWriter(f);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(temp);
			bw.close();
			//bw.flush();
			System.out.println();
			System.out.println("File updated successfully");
		}catch(Exception e) {
			e.printStackTrace();
			}
	}

}
