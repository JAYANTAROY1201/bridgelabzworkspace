package com.bridgelabz.datastructures.stack;

import com.bridgelabz.datastructures.singlelinkedlist.SingleLinkedList;

/**
 * purpose: To implement a Stack
 * @author JAYANTA ROY
 * @version 1.0
 * @since 25-05-2018
 */
public class StackList<G extends Comparable<G>> {
 
	public static<G extends Comparable<G>> void push(G item)
	{
		SingleLinkedList.addFirst(item);
	}
	
	public static<G extends Comparable<G>> G pop()
	{
		return SingleLinkedList.removeByPosition(1);
	}
	
	public static<G extends Comparable<G>> G peek() 
	{
	   return SingleLinkedList.peek();
	}
	
	public static boolean isEmpty()
	{
		return SingleLinkedList.isEmpty();
	}
	
	public static void size()
	{
		SingleLinkedList.size();
	}
	

}