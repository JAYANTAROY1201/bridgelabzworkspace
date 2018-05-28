package com.bridgelabz.datastructures.prime2d;

import com.bridgelabz.datastructures.singlelinkedlist.SingleLinkedList;
import com.bridgelabz.datastructures.stack.StackList;
import com.bridgelabz.utility.Utility;
/**
 * PURPOSE: TO OBTAIN PRIME AS WELL AS ANAGRAM NUMBERS
 * @author JAYANTA ROY
 * @version 1.0
 * @since 28-05-2018
 */
public class PrimeAngramStack {

public static void main(String[]args) {
	
	StackList primeanagram=new StackList();
	
 SingleLinkedList primes= new SingleLinkedList(); 
 for(int i=0;i<1000;i++)
 {
   if(Utility.isPrime(i))
	 {
		 primes.add(i);
	 }
 }

 for(int i=0;i<primes.size()-1;i++)
 {
	 for(int j=i+1;j<primes.size();j++)
	 {
		 if(  Utility.checkAnagram((""+primes.get(i)),(""+primes.get(j))) )
		 {
			 primeanagram.push(primes.get(i)+" & "+primes.get(j));
		 }
	 }
 }
 primeanagram.display();
}
}

