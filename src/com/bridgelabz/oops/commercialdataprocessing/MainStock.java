package com.bridgelabz.oops.commercialdataprocessing;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.datastructures.queue.Queue;
import com.bridgelabz.datastructures.singlelinkedlist.SingleLinkedList;

public class MainStock {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ParseException {

        SingleLinkedList out=new SingleLinkedList();
        out=StockAccount.stockobjectcreation();
        JSONArray tempArray=new JSONArray(); 
       //out.displayln();
       while(!out.isEmpty())
       {

         tempArray.add((JSONObject) new JSONParser().parse((String) out.pop(0)));
        
        }
        System.out.println(tempArray);
        
        Queue symbol=new Queue();
        Queue dateandtime= new Queue();
	}
}


