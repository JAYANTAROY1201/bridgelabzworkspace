package com.bridgelabz.datastructures.deque;

import com.bridgelabz.datastructures.singlelinkedlist.SingleLinkedList;

/**
 * purpose: To implement an unordered list
 * @author JAYANTA ROY
 * @version 1.0
 * @since 24-05-2018
 */
public class DequeList {
	
	static SingleLinkedList li= new SingleLinkedList();

	// to create a new empty list
	public static DequeList dequelist() {
		return (new DequeList());
	}

	// to add an item to the front list
	public static void addFront(Comparable item) {
	li.insert(item, 0);
	}

	// to add an item to the last
	public static<G extends Comparable<G>> void addRear(G item) {
		li.add(item);
	}

	
	// to find the size of the list
	public static int size() {
		return li.size();
	}

	// to find a a list empty or not
	public static boolean isEmpty() {
		return li.isEmpty();
	}


	// to check whether the item is present or not
	public static boolean search(Comparable item) {
       return li.search(item);
	}


	// to remove the last item as well as to remove it
	public static Comparable removeFront() {
		
		return li.pop(0);
	}

	// to fetch the last item as well as to remove it
	public static Comparable removeRear() {
		return li.pop();
	}
	
   //to display items
	public static void display() {
		li.display();
	}
	}

