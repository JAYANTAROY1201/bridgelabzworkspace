package com.bridgelabz.datastructures.deque;

import com.bridgelabz.datastructures.singlelinkedlist.SingleLinkedList;

/**
 * purpose: To implement an unordered list
 * @author JAYANTA ROY
 * @version 1.0
 * @since 24-05-2018
 */
public class DequeList<G extends Comparable<G>> {

	// to create a new empty list
	public static<G extends Comparable<G>> DequeList<G> dequelist() {
		return (new DequeList<G>());
	}

	// to add an item to the front list
	public static <G extends Comparable<G>>void addFront(G item) {
		SingleLinkedList.addFirst(item);		
	}

	// to add an item to the last
	public static<G extends Comparable<G>> void addRear(G item) {
		SingleLinkedList.add(item);
	}

	
	// to find the size of the list
	public static int size() {
		return SingleLinkedList.size();
	}

	// to find a a list empty or not
	public static boolean isEmpty() {
		return SingleLinkedList.isEmpty();
	}


	// to check whether the item is present or not
	public static<G extends Comparable<G>> boolean search(G item) {
       return SingleLinkedList.search(item);
	}


	// to remove the last item as well as to remove it
	public static<G extends Comparable<G>> G removeFront() {
		
		return SingleLinkedList.removeByPosition(1);
	}

	// to fetch the last item as well as to remove it
	public static <G extends Comparable<G>>G removeRear() {
		return SingleLinkedList.pop();
	}
	
   //to display items
	public static void display() {
		SingleLinkedList.display();
	}
	}

