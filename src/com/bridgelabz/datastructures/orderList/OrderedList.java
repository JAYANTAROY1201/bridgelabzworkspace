package com.bridgelabz.datastructures.orderList;


import com.bridgelabz.datastructures.singlelinkedlist.SingleLinkedList;

/**
 * purpose: To define a orderlist
 * 
 * @author JAYANTA ROY
 * @version 1.0
 * @since 25-05-2018
 */
public class OrderedList {

	static SingleLinkedList li=new SingleLinkedList();

	// to create a new empty list
	public static  OrderedList orderedlist() {
		return new OrderedList();
	}

	// to add an item to the list
	public static void add(Comparable item) {
		li.addSort(item);
	}

	// to find the size of the list
	public static int size() {
		return li.size();
	}

	// to find a a list empty or not
	public static boolean isEmpty() {
		return li.isEmpty();
	}

	// to return a index of a particular value
	public static  int index(Comparable item) {
		return li.index(item);
	}

	// to check whethrt the item is present or not
	public static boolean search(Comparable item) {

		return li.search(item);
	}

	// to remove a specified item from the list
	public static  void remove(Comparable item) {
		li.remove(item);
	}

	// to fetch the last item as well as to remove it
	public static Comparable pop() {

		return li.pop();
	}

	public static void display() {
		li.display();
	}

	// to fetch an item from specified position and to revove it
	public static  Comparable pop(int pos) {

		return li.pop(pos);
	}

}
