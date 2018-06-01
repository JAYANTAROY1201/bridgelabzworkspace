package com.bridgelabz.oops.stockmarketing;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 * Purpose: to use a json file as input and calculate stock prices
 * @author Jayanta Roy
 * @version 1.0
 * @since 01/06/18
 */
public class StockPortfolio {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONArray stockReportArray = new JSONArray();
		JSONObject portfolioObject = new JSONObject();
		JSONObject totalstockobject = new JSONObject();
		JSONParser parser = new JSONParser();
		int totalStockprice = 0;
		try {
			Object obj = parser.parse(new FileReader(new File("/home/administrator/eclipse-workspace/BridgelabzModules/"
					+ "src/com/bridgelabz/oops/stockmarketing/Stock.json")));
			JSONArray stockarray = (JSONArray) obj;
			for (int i = 0; i < stockarray.size(); i++) {
				JSONObject stobject = (JSONObject) stockarray.get(i);

				portfolioObject.put("Stock Name", stobject.get("Name"));
				portfolioObject.put("Stock value", (Integer.parseInt(stobject.get("Share price").toString())
						* Integer.parseInt(stobject.get("No of share").toString())));
				totalStockprice += (Integer.parseInt(stobject.get("Share price").toString())
						* Integer.parseInt(stobject.get("No of share").toString()));
				stockReportArray.add(portfolioObject);
			}
			totalstockobject.put("Total Stocks", totalStockprice);
			stockReportArray.add(totalstockobject);
			System.out.println(stockReportArray);
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
	}

}
