package com.bridgelabz.datastructures.queue;

import com.bridgelabz.datastructures.singlelinkedlist.SingleLinkedList;

/**
 * purpose: to create a queue
 * @author JAYANTA ROY
 * @version 1.0
 * @since 25/05/2018
 * @param <G>
 */
public class Queue<G extends Comparable<G>> {

	public static <G extends Comparable<G>> Queue<G> queue() {
		return new Queue<G>();
	}

	// to add an item to the list
	public static <G extends Comparable<G>> void enqueue(G item) {
		SingleLinkedList.add(item);
	}

	// to fetch the first item as well as to remove it
	public static <G extends Comparable<G>> G dequeue() {

		return SingleLinkedList.removeByPosition(1);
	}

	// to find a a list empty or not
	public static boolean isEmpty() {
		return SingleLinkedList.isEmpty();
	}

	// to find the size of the list
	public static <G extends Comparable<G>> int size() {
		return SingleLinkedList.size();
	}

	// to display
	public static void display() {
		SingleLinkedList.display();
	}
}
