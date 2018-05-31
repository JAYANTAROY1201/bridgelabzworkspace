package com.bridgelabz.oops.jsonimplementation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * Purpose: to print a inventory details by reading a json file and printing in console
 * @author Jayanta Roy
 *@version 1.0
 *@since 31/01/18
 */
public class JsonInventoryWrite {
	public static void main(String[] args) {
		int sumRice = 0;
		int totalRice = 0;
		int sumWheat = 0;
		int totalWheat = 0;
		int sumPulses = 0;
		int totalPulses = 0;
		JSONParser parser = new JSONParser();
		File f = new File("/home/administrator/eclipse-workspace/BridgelabzModules"
				+ "/src/com/bridgelabz/oops/jsonimplementation/InventoryDeatils.json");
		try {
			Object obj = parser.parse((new FileReader(f)));
			JSONObject jsonObj = (JSONObject) obj;
			JSONArray rice = (JSONArray) jsonObj.get("Rice");
			for (int i = 0; i < rice.size(); i++) {
				JSONObject objrice = (JSONObject) (rice.get(i));
				sumRice += (Integer.parseInt(objrice.get("Weight in kg").toString()))
						* (Integer.parseInt(objrice.get("Price per kg").toString()));
				totalRice += Integer.parseInt(objrice.get("Weight in kg").toString());
			}

			JSONArray wheat = (JSONArray) jsonObj.get("Wheat");
			for (int i = 0; i < wheat.size(); i++) {
				JSONObject objwheat = (JSONObject) (wheat.get(i));
				sumWheat += (Integer.parseInt(objwheat.get("Weight in kg").toString()))
						* (Integer.parseInt(objwheat.get("Price per kg").toString()));
				totalWheat += Integer.parseInt(objwheat.get("Weight in kg").toString());
			}
			JSONArray pulses = (JSONArray) jsonObj.get("Pulses");
			for (int i = 0; i < pulses.size(); i++) {
				JSONObject objpulses = (JSONObject) (pulses.get(i));
				sumPulses += (Integer.parseInt(objpulses.get("Weight in kg").toString()))
						* (Integer.parseInt(objpulses.get("Price per kg").toString()));
				totalPulses += Integer.parseInt(objpulses.get("Weight in kg").toString());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("[{ \"Name\" : \"Rice\"," + "\"Total weight\" :" + totalRice + ",\"Total Price\" :" + sumRice
				+ "}," + "{ \"Name\" : \"Wheat\"," + "\"Total weight\" :" + totalWheat + ",\"Total Price\" :" + sumWheat
				+ "}," + "{ \"Name\" : \"Pulses\"," + "\"Total weight\" :" + totalPulses + ",\"Total Price\" :"
				+ sumPulses + "}]");
	}

}
