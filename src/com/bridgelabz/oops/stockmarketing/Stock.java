package com.bridgelabz.oops.stockmarketing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.utility.Utility;

/**
 * Purpose: To create a json file for stocks
 * @author Jayanta Roy
 * @version 1.0
 * @since 01/06/18
 */
public class Stock {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		BufferedWriter bufferedwriter = null;
		System.out.println("Enter the number of stocks:");
		int noOfStock = Utility.readInteger();
		JSONArray stockArray = new JSONArray();
		for (int i = 0; i < noOfStock; i++) {
			JSONObject stockobj = new JSONObject();
			System.out.println("enter Stock name:");
			String stockname = Utility.readString();
			System.out.println("enter no of shares:");
			Integer stockshare = Utility.readInteger();
			System.out.println("enter Share price:");
			Integer sharePrice = Utility.readInteger();
			stockobj.put("Name", stockname);
			stockobj.put("No of share", stockshare);
			stockobj.put("Share price", sharePrice);
			stockArray.add(stockobj);

		}
		System.out.println(stockArray);
		try {
			bufferedwriter = new BufferedWriter(new FileWriter(new File(
					"/home/administrator/eclipse-workspace/BridgelabzModules/src/com/bridgelabz/oops/stockmarketing/Stock.json")));
			bufferedwriter.write(stockArray.toString());
			bufferedwriter.close();
			System.out.println("File written succesfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
