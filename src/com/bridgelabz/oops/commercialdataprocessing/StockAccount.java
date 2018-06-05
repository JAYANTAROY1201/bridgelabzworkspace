package com.bridgelabz.oops.commercialdataprocessing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.datastructures.singlelinkedlist.SingleLinkedList;
import com.bridgelabz.oops.jsonimplementation.JsonInventoryWrite;
import com.bridgelabz.utility.Utility;
/**
 * purpose: to create a Stock account that will be use for every  user account
 * @author Jayanta Roy
 * @version 1.0
 * @since 04/06/2018
 */
public class StockAccount {
	static String name;
	static double currbalance;
	static File f;
	static SingleLinkedList []stockStore=new SingleLinkedList[stockobjectcreation().size()];

	/**
	 * default contructor
	 */
	public StockAccount() {
		System.out.println("enter user name:");
		String filename = Utility.readString();
		new StockAccount(filename);
	}
	

	/**
	 * this parameterised constructor is used to create a object with given file name
	 * @param filename
	 */
	public StockAccount(String filename) {
		f = new File("/home/administrator/eclipse-workspace/BridgelabzModules"
				+ "/src/com/bridgelabz/oops/commercialdataprocessing/" + filename);
		try {
			if (f.createNewFile()) {
				System.out.println("new account created for " + filename);
				initialize();
				
			} else {
				System.out.println("Account founds....");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * this method is written to return the updated balance of user
	 * @return
	 */
	public int setNewbalance() {
		System.out.println("Enter your initial amount");
		return Utility.readInteger();
	}
	
	/**
	 * this method is written to return the updated balance of user
	 * @return
	 */
	public int valueOf() {
		return (int) currbalance;
	}
  public static void initialize()
  {
	  for(int i=0;i<stockobjectcreation().size();i++)
	  {
		  stockStore[i]=new SingleLinkedList();
		  stockStore[i].add(0);
	  }
  }
	
	/**
	 * 
	 * this method is written to buy a stock and update the user file as well as json file
	 * @param amount
	 * @param symbol
	 * @throws IOException
	 * @throws NumberFormatException
	 * @throws ParseException
	 */
	@SuppressWarnings("unchecked")
	public void buy(int amount, String symbol) throws IOException, NumberFormatException, ParseException {
	    currbalance=amount;
		SingleLinkedList temp = stockobjectcreation();
		
		JSONObject compobj = (JSONObject) new JSONParser().parse((temp.get(Integer.parseInt(symbol)).toString()));
		
		System.out.println("Displaying details:");
		String boughtFrom = compobj.get("Name").toString();
		System.out.println("Company name: " + boughtFrom);
		System.out.println("Share price:" + compobj.get("Share price"));
		System.out.println("No of shares available:" + compobj.get("No of share"));

		int noOfShare = Integer.parseInt(compobj.get("No of share").toString());
		System.out.println("Enter how many shares you want to buy:");
		int wantToBuy = Utility.readInteger();
		if (noOfShare < wantToBuy || (wantToBuy * (Integer.parseInt(compobj.get("Share price").toString())) > currbalance)) {
			System.out.println("not available");
			return;
		} else {
			noOfShare = noOfShare - wantToBuy;
			currbalance = currbalance - (Integer.parseInt(compobj.get("Share price").toString()) * wantToBuy);
			
		}
		String fileitem = "Share bought from: " + boughtFrom + "\n" + "No of share bought: " + wantToBuy + "\n"
				+ "Clear balance: " + currbalance + "\n" + "Buying date and time: " + LocalDateTime.now() + "\n" + "\n";
		save(f, fileitem);
		JSONObject stobject = new JSONObject();
		stobject.put("Name", boughtFrom);
		stobject.put("No of share", noOfShare);
		stobject.put("Share price", compobj.get("Share price"));
		String stockobjectupdate = stobject.toString();
		temp.removeAt(Integer.parseInt(symbol));
		temp.insert(stockobjectupdate, Integer.parseInt(symbol));
		updateJson(temp);
		
		int value=(int) stockStore[Integer.parseInt(symbol)].removeAt(0);
		stockStore[Integer.parseInt(symbol)].add((wantToBuy +value));
		}


	
	/**
	 * this method is written to sell a stock
	 * @param amount
	 * @param symbol
	 * @throws IOException 
	 * @throws ParseException 
	 */
	@SuppressWarnings("unchecked")
	public void sell(int amount, String symbol) throws IOException, ParseException {
		currbalance=amount;
		SingleLinkedList temp = stockobjectcreation();
		
		JSONObject compobj = (JSONObject) new JSONParser().parse((temp.get(Integer.parseInt(symbol)).toString()));
		
		System.out.println("Displaying details:");
		String sellTo = compobj.get("Name").toString();
		System.out.println("Company name: " + sellTo);
		System.out.println("Share price:" + compobj.get("Share price"));
		System.out.println("No of shares available to you: "+ stockStore[Integer.parseInt(symbol)].get(0));
		

		int numOfShare = Integer.parseInt(compobj.get("No of share").toString());
		System.out.println("Enter how many shares you want to sell:");
		int wantToSell = Utility.readInteger();
		if ((Integer)stockStore[Integer.parseInt(symbol)].get(0) < wantToSell) {
			System.out.println("not available");
			return;
		} else {
			numOfShare = numOfShare + wantToSell;
			currbalance = currbalance + (Integer.parseInt(compobj.get("Share price").toString()) * wantToSell);
			
		}
		String fileitem = "Share sell from: " + sellTo + "\n" + "No of share sell: " + wantToSell + "\n"
				+ "Clear balance: " + currbalance + "\n" + "Buying date and time: " + LocalDateTime.now() + "\n" + "\n";
		save(f, fileitem);
		JSONObject stobject = new JSONObject();
		stobject.put("Name", sellTo);
		stobject.put("No of share", numOfShare);
		stobject.put("Share price", compobj.get("Share price"));
		String stockobjectupdate = stobject.toString();
		temp.removeAt(Integer.parseInt(symbol));
		temp.insert(stockobjectupdate, Integer.parseInt(symbol));
		updateJson(temp);
		int value=(int) stockStore[Integer.parseInt(symbol)].removeAt(0);
		stockStore[Integer.parseInt(symbol)].add((wantToSell +value));
		}
		
	

	
	/**
	 * this method is written to save text file   
	 * @param f
	 * @param fileitem
	 * @throws IOException
	 */
	public void save(File f, String fileitem) throws IOException {
		try {
			if (!f.exists()) {
				f.createNewFile();
			}

			FileWriter fw = new FileWriter(f.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(fileitem);
			bw.close();
			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	/**
	 * this method is written to print available companies for stock
	 */
	public static void showStock() {
		SingleLinkedList company = new SingleLinkedList();
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader(new File("/home/administrator/eclipse-workspace/BridgelabzModules/"
					+ "src/com/bridgelabz/oops/stockmarketing/Stock.json")));
			JSONArray compArray = (JSONArray) obj;
			for (int i = 0; i < compArray.size(); i++) {
				JSONObject compobj = (JSONObject) compArray.get(i);
				String name = compobj.get("Name").toString();
				company.add(i + "        " + name+"             "+compobj.get("Share price").toString()+"           "+compobj.get("No of share").toString());
				

			}
			company.displayln();
		} catch (IOException | ParseException e) {		
			e.printStackTrace();
		}
	}

	
	/**
	 * this method is written to create a linkedlist with json object
	 * @return SingleLinkedList
	 */
	public static SingleLinkedList stockobjectcreation() {
		JSONParser parser = new JSONParser();
		SingleLinkedList l = new SingleLinkedList();
		try {
			Object obj = parser.parse(new FileReader(new File(
					"/home/administrator/eclipse-workspace/BridgelabzModules/src/com/bridgelabz/oops/stockmarketing/Stock.json")));
			JSONArray stockarray = (JSONArray) obj;
			for (int i = 0; i < stockarray.size(); i++) {
				JSONObject jsonobj = (JSONObject) stockarray.get(i);
				l.add(jsonobj.toJSONString());
			}

		} catch (IOException | ParseException e) {

			e.printStackTrace();
		}
		return l;

	}

	
	/**
	 * 
	 * this method is written to write a text file
	 * @param content
	 * @param position
	 */
	public static void writeToFile(String content, File position) {
		try {
			// if file doesnt exists, then create it
			if (!f.exists()) {
				f.createNewFile();
			}

			FileWriter fw = new FileWriter(f.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	/**
	 *this method is written to write a json file from a linkedlist which contains json object
	 * @param out
	 * @throws ParseException
	 */
	@SuppressWarnings("unchecked")
	public static void updateJson(SingleLinkedList out) throws ParseException {
		JSONArray tempArray = new JSONArray();

		while (!out.isEmpty()) {
			tempArray.add((JSONObject) new JSONParser().parse((String) out.pop(0)));
		}
		try {
			BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(new File(
					"/home/administrator/eclipse-workspace/BridgelabzModules/src/com/bridgelabz/oops/stockmarketing/Stock.json")));
			bufferedwriter.write(tempArray.toString());
			bufferedwriter.close();
			System.out.println("File written succesfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}