package com.bridgelabz.oops.inventorymanagements;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.utility.Utility;

/**
 * Purpose: This class calls an object of InventoryManager and utilize it
 * @author Jayanta Roy
 * @version 1.0
 * @since 01/06/18
 */
public class InventoryManager {

	public static void main(String[] args) {
		InventoryFactory.inventoryObject();
		System.out.println("Press 1 for Rice details");
		System.out.println("Press 2 for Wheat details");
		System.out.println("Press 3 for Pulse details");
		int choice = Utility.readInteger();
		switch (choice) {
		case 1:
			System.out.println(calculatedetails((JSONArray) InventoryFactory.jsonobj.get("Rice"), "Rice"));
			break;
		case 2:
			System.out.println(calculatedetails((JSONArray) InventoryFactory.jsonobj.get("Wheat"), "Wheat"));
			break;
		case 3:
			System.out.println(calculatedetails((JSONArray) InventoryFactory.jsonobj.get("Pulses"), "Pulses"));
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
	}

	/**
	 * Purpose: This method is written to caculate the total prive for each
	 * inventory items
	 * 
	 * @param itemArray
	 * @param itemName
	 * @return JSONobject
	 */
	@SuppressWarnings("unchecked")
	public static JSONObject calculatedetails(JSONArray itemArray, String itemName) {
		int totalweight = 0;
		int totalprice = 0;
		JSONObject returnObject = new JSONObject();
		for (int i = 0; i < itemArray.size(); i++) {
			JSONObject obj = (JSONObject) itemArray.get(i);
			totalweight += Integer.parseInt(obj.get("Weight in kg").toString());
			totalprice += Integer.parseInt(obj.get("Weight in kg").toString())
					* Integer.parseInt(obj.get("Price per kg").toString());

		}
		returnObject.put("Name", itemName);
		returnObject.put("Total weight", totalweight);
		returnObject.put("Total Price", totalprice);
		return returnObject;
	}

}
