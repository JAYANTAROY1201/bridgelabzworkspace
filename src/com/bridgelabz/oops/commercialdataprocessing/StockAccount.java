package com.bridgelabz.oops.commercialdataprocessing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.datastructures.singlelinkedlist.SingleLinkedList;

public class StockAccount {
	static String name;
	static double currbalance;
	
	public  StockAccount(String filename)
	{
		File f=new File("/home/administrator/eclipse-workspace/BridgelabzModules"
				+ "/src/com/bridgelabz/oops/commercialdataprocessing/"+filename);
		try {
			if(f.createNewFile())
			{
				System.out.println("new account created for "+filename);
			}
			else
			{
				System.err.println("Account already exists....change account name");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public  double valueOf()
	{
		return currbalance;
	}
	public  void buy(int amount, String symbol)
	{
		
	}
	public void sell(int amount, String symbol)
	{
		
	}
	public void save(String filename, String fileitem) throws IOException
	{
		BufferedWriter bw=new BufferedWriter(new FileWriter(new File(filename)));
		bw.write(fileitem);
		bw.close();
	}
	
	public static SingleLinkedList stockobjectcreation()
	{
	JSONParser parser = new JSONParser();
	SingleLinkedList l=new SingleLinkedList();
	try {
		Object obj=parser.parse(new FileReader(new File("/home/administrator/eclipse-workspace/BridgelabzModules/src/com/bridgelabz/oops/stockmarketing/Stock.json")));
		JSONArray stockarray=(JSONArray) obj;
		for(int i=0;i<stockarray.size();i++)
		{
		JSONObject jsonobj=(JSONObject) stockarray.get(i);
		l.add(jsonobj.toJSONString());
		}
		
	} catch (IOException | ParseException e) {
		
		e.printStackTrace();
	}
	return l;

	}
}