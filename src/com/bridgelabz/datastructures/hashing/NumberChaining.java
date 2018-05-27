package com.bridgelabz.datastructures.hashing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import com.bridgelabz.datastructures.orderList.OrderedList;
import com.bridgelabz.datastructures.singlelinkedlist.SingleLinkedList;
import com.bridgelabz.utility.Utility;

public class NumberChaining<G extends Comparable<G>> {

	@SuppressWarnings({ "static-access", "unchecked" })
	public static void main(String[] args) {
		
		File f = new File("/home/administrator/eclipse-workspace/BridgelabzModules/numberchain.txt");		
		int count = 0;
		int chainSize=11;
		ArrayList<Integer> array=new ArrayList<Integer>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(f));
			String word = br.readLine();
			System.out.print(word + "");
			System.out.println();
			while (word != null) {
				String[] str = word.split(" ");
				for (int i = 0; i < str.length; i++) {
					count++;
					array.add(Integer.parseInt(str[i]));
				}
				
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	
		
		ArrayList<E>[] chain=new ArrayList<E>();
		
		for(int i=0;i<chainSize;i++)
		{
			chain[i]=new SingleLinkedList<Integer>();
		}
		
		for(int i=0;i<array.size();i++)
		{
			System.out.println("this c "+array.get(i));
			int rem=((int)array.get(i))%11;
			System.out.println("item will go into "+((array.get(i))%11));
			chain[rem].add((Integer)array.get(i));
		}
	    chain[3].display();
//		System.out.println("enter search item:");
//		int search=Utility.readInteger();
//		if(!(array.contains(search))) {
//			System.out.println("item will go into "+(search%11));
//			chain[search%11].add(search);
//			
//		}
//		else
//		{
//			chain[search%11].remove(search);
//		}
//		
//		String out="";
//		for(int i=0;i<11;i++)
//		{
//			int blockSize=chain[i].size();
//			for (int j=0;j<blockSize;j++)
//			{
//				out+=chain[i].pop()+" ";
//			}
//		}
//		
//		System.out.println(out);
//		try {
//			BufferedWriter writer = new BufferedWriter(new FileWriter(f));
//			writer.write(out);
//			System.out.println();
//			System.out.println("file written successfully");
//			writer.close();
//		    } catch (Exception e) {
//			e.printStackTrace();
//		}
//		
	}

}
