package com.bridgelab.algorithmprogworks;


import java.util.Map;
import java.util.TreeMap;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To find minimum sorting and searching time
 * @author JAYANTA ROY
 * @version 1.0
 * @since   22-05-2018
 */
public class SortingTime {

	public static void main(String[] args) 
	
	{  
		 long starttime,endtime;
		 TreeMap<Long,String> time= new TreeMap<Long,String>();
		 int array[] = Utility.createOneDimensionalIntArray() ;
	     int start=0;
	     int end = array.length-1;
	     System.out.println("Enter your search element: ");
	     int search= Utility.readInteger();
	     
	     System.out.println("enter your string:");
		 String str= Utility.readString();
		  
		 System.out.println("enter search letter:");
		 char searchChar=Utility.readCharacter();
		 
		 
		 
		 starttime= System.nanoTime();
	     int[] a=Utility.bubbleSortForInt(array);
	     Utility.PrintOneDimensionArray(a);
	     System.out.println();
	     endtime= System.nanoTime();
	     time.put( endtime-starttime,"Bubble sort for integers");
	     
	     starttime=System.nanoTime();
	     Utility.binarySearchForInteger(a,start,end,search);
	     endtime=System.nanoTime();
	     time.put(endtime-starttime,"Binary search for integers");
	     
	     
	     starttime= System.nanoTime();
	     String sortedString=Utility.bubbleSortForString(str); 
	     endtime= System.nanoTime();
	     time.put(endtime-starttime,"Bubble sort for String");
	     
	     char [] ar=sortedString.toCharArray();
		 int start2=0;
		 int end2 = ar.length-1;
	     
	     starttime=System.nanoTime();
	      Utility.binarySearchForString(ar,start2,end2,searchChar);
	     endtime=System.nanoTime();
	      time.put(endtime-starttime,"Binary search for String");
	     
	     starttime=System.nanoTime();
	     int[] arr=Utility.insertionSortForInt(array);
	     Utility.PrintOneDimensionArray(arr);
	     System.out.println();
	     endtime=System.nanoTime();
	     time.put(endtime-starttime,"insertion sort for Integer");
	     
	     
	     starttime=System.nanoTime();
	     Utility.insertionSortForString(str);
	     Utility.PrintOneDimensionArray(arr);
	     System.out.println();
	     endtime=System.nanoTime();
	     time.put(endtime-starttime,"insertion sort for String");
	     
	     for(Map.Entry< Long,String> entry: time.entrySet()) 
	     {
	    	 System.out.println(entry.getValue()+"  "+entry.getKey());
	     }
	     
	     
		
	    
	}

}
