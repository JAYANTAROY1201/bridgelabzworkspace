package com.bridgelabz.datastructures.queue;

import com.bridgelabz.datastructures.singlelinkedlist.SingleLinkedList;

/**
 * purpose: to create a queue using list
 * @author JAYANTA ROY
 * @version 1.0
 * @since 25/05/2018
 */
public class Queue {

	SingleLinkedList l = SingleLinkedList.list();

	// to return an empty queue
	static Queue queue() {
		return new Queue();
	}

	// to add in the queue
	public void enqueue(Comparable item) {
		l.add(item);
	}

	// to display items
	public void display() {
		l.displayln();
	}

	// to remove an element
	public Comparable dequeue() {
		return (l.pop(0));
	}

	// to find the size
	public int size() {
		return l.size();
	}

	// to check whether the queue is empty or not
	boolean isEmpty() {
		return l.isEmpty();
	}

}
