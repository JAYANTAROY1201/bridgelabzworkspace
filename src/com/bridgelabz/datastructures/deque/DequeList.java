package com.bridgelabz.datastructures.deque;

import com.bridgelabz.datastructures.singlelinkedlist.SingleLinkedList;

/**
 * purpose: To implement an unordered list
 * @author JAYANTA ROY
 * @version 1.0
 * @since 24-05-2018
 */
public class DequeList {
	
	SingleLinkedList li= new SingleLinkedList();

	// to create a new empty list
	public static DequeList dequelist() {
		return (new DequeList());
	}

	// to add an item to the front list
	public void addFront(Comparable item) {
	li.insert(item, 0);
	}

	// to add an item to the last
	public void addRear(Comparable item) {
		li.add(item);
	}

	
	// to find the size of the list
	public int size() {
		return li.size();
	}

	// to find a a list empty or not
	public boolean isEmpty() {
		return li.isEmpty();
	}


	// to check whether the item is present or not
	public boolean search(Comparable item) {
       return li.search(item);
	}


	// to remove the last item as well as to remove it
	public Comparable removeFront() {
		
		return li.pop(0);
	}

	// to fetch the last item as well as to remove it
	public Comparable removeRear() {
		return li.pop();
	}
	
   //to display items
	public void display() {
		li.display();
	}
	}

