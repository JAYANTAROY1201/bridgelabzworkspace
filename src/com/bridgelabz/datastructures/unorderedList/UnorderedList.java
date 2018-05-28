package com.bridgelabz.datastructures.unorderedList;

import com.bridgelabz.datastructures.singlelinkedlist.SingleLinkedList;

/**
 * purpose: To implement an unordered list
 * @author JAYANTA ROY
 * @version 1.0
 * @since 24-05-2018
 */
public class UnorderedList {

	static SingleLinkedList li=new SingleLinkedList();
	// to create a new empty list
	public static UnorderedList list() {
		return new UnorderedList();
	}

	// to add an item to the list
	public static  void add(Comparable item) {
		li.add(item);
	}

	// to add an item to the last
	public static void append(Comparable item) {
		li.add(item);	
	}

	// to add an item in specified position
	public static void insert(int pos,Comparable item) {
		li.insert(item,pos);		
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
	public static int index(Comparable item) {
		return li.index(item);
		
	}

	// to check whethrt the item is present or not
	public static boolean search(Comparable item) {

		return li.search(item);
	}

	// to remove a specified item from the list
	public static void remove(Comparable item) {
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
	public static Comparable pop(int pos) {
		return li.pop(pos);
		
		}
	}

