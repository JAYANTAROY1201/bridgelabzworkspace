package com.bridgelabz.datastructures.queue;

import com.bridgelabz.datastructures.singlelinkedlist.SingleLinkedList;

/**
 * purpose: to create a queue
 * @author JAYANTA ROY
 * @version 1.0
 * @since 25/05/2018
 */
public class Queue {

	static SingleLinkedList li=new SingleLinkedList();
	
	public static  Queue queue() {
		return new Queue();
	}

	// to add an item to the list
	public static  void enqueue(Comparable item) {
		li.add(item);
	}

	// to fetch the first item as well as to remove it
	public static Comparable dequeue() {

		return li.pop(0);
	}

	// to find a a list empty or not
	public static boolean isEmpty() {
		return li.isEmpty();
	}

	// to find the size of the list
	public static  int size() {
		return li.size();
	}

	// to display
	public static void display() {
		li.displayln();
	}
}
