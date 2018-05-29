package com.bridgelabz.datastructures.orderlist;


import com.bridgelabz.datastructures.singlelinkedlist.SingleLinkedList;

/**
 * purpose: To define a orderlist
 * 
 * @author JAYANTA ROY
 * @version 1.0
 * @since 25-05-2018
 */
public class OrderedList {

	 SingleLinkedList l=new SingleLinkedList();

	// to create a new empty list
	public  static OrderedList orderedlist() {
		return new OrderedList();
	}

	// to add an item to the list
	public void add(Comparable item) {
		l.addSort(item);
	}

	// to find the size of the list
	public int size() {
		return l.size();
	}

	// to find a a list empty or not
	public boolean isEmpty() {
		return l.isEmpty();
	}

	// to return a index of a particular value
	public  int index(Comparable item) {
		return l.index(item);
	}

	// to check whethrt the item is present or not
	public  boolean search(Comparable item) {

		return l.search(item);
	}

	// to remove a specified item from the list
	public void remove(Comparable item) {
		l.remove(item);
	}

	// to fetch the last item as well as to remove it
	public Comparable pop() {

		return l.pop();
	}

	public void display() {
		l.display();
	}

	// to fetch an item from specified position and to revove it
	public Comparable pop(int pos) {

		return l.pop(pos);
	}

}
