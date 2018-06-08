package com.bridgelabz.datastructures.prime2d;

import com.bridgelabz.datastructures.queue.Queue;
import com.bridgelabz.datastructures.singlelinkedlist.SingleLinkedList;
import com.bridgelabz.utility.Utility;

/**
 * PURPOSE: TO OBTAIN PRIME AS WELL AS ANAGRAM NUMBERS
 * @author JAYANTA ROY
 * @version 1.0
 * @since 28-05-2018
 */
public class PrimeAnagramQueue {
	public static void main(String[]args) {
		
		Queue primeanagrams=new Queue();
		
	 SingleLinkedList prime= new SingleLinkedList(); 
	 for(int i=0;i<1000;i++)
	 {
	   if(Utility.isPrime(i))
		 {
			 prime.add(i);
		 }
	 }

	 for(int i=0;i<prime.size()-1;i++)
	 {
		 for(int j=i+1;j<prime.size();j++)
		 {
			 if(  Utility.checkAnagram((""+prime.get(i)),(""+prime.get(j))) )
			 {
				 primeanagrams.enqueue(prime.get(i)+" & "+prime.get(j));
			 }
		 }
	 }
	 
	 primeanagrams.display();
	}
	}