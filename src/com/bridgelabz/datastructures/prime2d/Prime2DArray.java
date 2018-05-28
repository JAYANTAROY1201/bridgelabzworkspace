package com.bridgelabz.datastructures.prime2d;

import com.bridgelabz.datastructures.singlelinkedlist.SingleLinkedList;
import com.bridgelabz.datastructures.singlelinkedlist.SingleLinkedList;
import com.bridgelabz.utility.Utility;
/**
 * PURPOSE: TO OBTAIN PRIME NUMBERS IN 2D FORM
 * @author JAYANTA ROY
 * @version 1.0
 * @since 28-05-2018
 */
public class Prime2DArray {

	public static void main(String[] args) {
		SingleLinkedList array[][] = new SingleLinkedList[10][];
		for (int i = 0; i < 10; i++) {
			array[i] = new SingleLinkedList[100];
			for (int j = 0; j < 100; j++) {
				array[i][j] = new SingleLinkedList();
			}
		}

		for (int i = 0; i < 10; i++) {
			int k = 0;
			for (int j = 100 * i; j < 100 * (i + 1); j++) {	
				if (Utility.isPrime(j)) {
					array[i][k++].add(j);
					
				}
			}
		}
		
		
		for (int i = 0; i < 10; i++) {
				System.out.println("");
				System.out.print(i+" row ---->");
				for (int j = 0; j < 100; j++) {
					
					array[i][j].display();
				}
				System.out.println();
			}
		
	}

}