package com.bridgelabz.datastructures.queue;

import com.bridgelabz.datastructures.unorderedList.Node;

/**
 * purpose: To implement an unordered list
 * @author JAYANTA ROY
 * @version 1.0
 * @since 24-05-2018
 */
public class Queue {
	public static Node front;
	public static Node rear;
	static int count;

	// to create a new empty list
	public static Queue queue() {
		return new Queue();
	}

	// to add an item to the list
	public void enqueue(Comparable item) {
		Node temp = new Node(item, null);
		if (front == null) {
			front = temp;
			count++;
			System.out.println(item + " added successfully");
			return;
		}
		
		rear = front;
		while (rear.next != null) {
			rear = rear.next;
		}
		rear.next = temp;
		rear = temp;
		count++;
		System.out.println(item + " added successfully");
	}

	// to fetch the last item as well as to remove it
	public static Comparable dequeue() {
		Comparable res=front.data;
		front=front.next;
		System.out.println("Person removed from queue");
		return res;
	}
	

	// to find a a list empty or not
	public static boolean isEmpty() {
		if (count == 0)
			return true;
		return false;
	}
	
	// to find the size of the list
	public static int size() {
		return count;
	}
	
	//to display
	public static void display() {
		System.out.println();
		Node temp = front;
		for (int i = 1; i <= size(); i++) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}
