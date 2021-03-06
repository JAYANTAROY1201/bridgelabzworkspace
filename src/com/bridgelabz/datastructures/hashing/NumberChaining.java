package com.bridgelabz.datastructures.hashing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.bridgelabz.utility.Utility;

/**
 * Purpose: to create slots and putting numbers in it according to
 *         given situation
 * @author Jayanta Roy
 * @version 1.0
 * @since 07/06/18
 */
public class NumberChaining {
    static int totalSlot = 11;
    static int slotNumber;
    static List<Integer> myList=new LinkedList<Integer>();
    static List []list=new LinkedList[totalSlot];
    static Map<Integer, List> numberMap = new HashMap<Integer,List>();
    public static void main(String[] args){
    	File readFile=new File("/home/administrator/"
    			         + "eclipse-workspace/BridgelabzModules/numberchain.txt");
    	myList=UtilityHashing.fileRead(readFile);
    	
        System.out.println("Enter the number to search in the map");
        int numberSearch = Utility.readInteger();
        if(myList.contains(numberSearch))
        {    System.out.println(numberSearch+" found and removed");
        	myList.remove((Integer)numberSearch);
        }
        else {
        	System.out.println(numberSearch+" not found and added");
        	myList.add(numberSearch);
        }
       
        for (int i = 0; i < myList.size(); i++) 
        {
            if(list[myList.get(i) % 11]==null)
            {
            	list[myList.get(i) % 11]=new LinkedList<Integer>();
            	numberMap.put(myList.get(i) % 11, list[myList.get(i) % 11]);
            }
            list[myList.get(i) % 11].add(myList.get(i));
          
        }
                  
        System.out.println("Displaying your map" + numberMap);
       File f=new File("/home/administrator/eclipse-workspace/BridgelabzModules/numberchainmap.txt");
        UtilityHashing.writetofile(f, numberMap);                
    }

}


