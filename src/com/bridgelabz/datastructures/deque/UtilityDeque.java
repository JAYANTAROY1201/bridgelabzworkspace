package com.bridgelabz.datastructures.deque;

/**
 * PURPOSE: to implement utility methods for queue
 * @author JAYANTA ROY
 * @version 1.0
 * @since 25-05-2018
 */
public class UtilityDeque {

	
	public static boolean checkPalindromeByDeque(String str) {
		
		DequeList deque=new DequeList();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			deque.addRear(ch[i]);
		}

		int endLimit = deque.size() / 2;
		for (int i = 0; i < endLimit; i++) {
			if (deque.removeFront().compareTo(deque.removeRear()) != 0) {
				return false;
			}
		}
		return true;
	}
}
