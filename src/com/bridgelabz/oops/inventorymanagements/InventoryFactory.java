package com.bridgelabz.oops.inventorymanagements;

import java.io.File;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/**
 * Purpose: This class take an json file as input and make its object
 * @author Jayanta Roy
 * @version 1.0
 * @since 01/06/18
 */
public class InventoryFactory {
	public static JSONObject jsonobj = new JSONObject();

	/**
	 * this method is written to create json object
	 */
	public static void inventoryObject() {
		JSONParser parser = new JSONParser();

		try {
			Object obj = parser
					.parse(new FileReader(new File("/home/administrator/eclipse-workspace/BridgelabzModules/src/com/"
							+ "bridgelabz/oops/jsonimplementation/InventoryDeatils.json")));

			jsonobj = (JSONObject) obj;

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
