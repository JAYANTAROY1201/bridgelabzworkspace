package com.bridgelabz.datastructures.deque;

/**
 * PURPOSE: to implement utility methods for queue
 * @author JAYANTA ROY
 * @version 1.0
 * @since 25-05-2018
 */
public class UtilityDeque {

	public static boolean checkPalindromeByDeque(String str) {
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			DequeList.addRear(ch[i]);
		}

		int endLimit = DequeList.size() / 2;
		for (int i = 0; i < endLimit; i++) {
			if (DequeList.removeFront().compareTo(DequeList.removeRear()) != 0) {
				return false;
			}
		}
		return true;
	}
}
