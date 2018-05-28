package com.bridgelabz.datastructures.stack;

import com.bridgelabz.datastructures.singlelinkedlist.SingleLinkedList;

/**
 * purpose: To implement a Stack USING LINKED LIST
 * @author JAYANTA ROY
 * @version 1.0
 * @since 25-05-2018
 */
public class StackList{
 
	static SingleLinkedList li= new SingleLinkedList();
	public static void push(Comparable item)
	{
		li.insert(item, 0);
	}
	
	public static Comparable pop()
	{
		return li.pop(0);
	}
	
	public static Comparable peek() 
	{
	   return li.peek();
	}
	
	public static boolean isEmpty()
	{
		return li.isEmpty();
	}
	
	public static int size()
	{
		return li.size();
	}
	public static int get(int index)
	{
		return (int)li.get(index);
	}
	//to display the stack
		public void display()
		{
			li.displayln();
		}
}