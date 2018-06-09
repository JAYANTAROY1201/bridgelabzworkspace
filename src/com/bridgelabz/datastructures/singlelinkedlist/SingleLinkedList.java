package com.bridgelabz.datastructures.singlelinkedlist;
/**
 * PURPOSE: TO OBTAIN A SINGLE LINKEDLIST
 * @author JAYANTA ROY
 * @version 1.0
 * @since 28-05-2018
 */
public class SingleLinkedList {
	private Node first;
	private Node tail;
	int count;

	public static SingleLinkedList list() {
		return new SingleLinkedList();
	}

	// to add a item to the list
	public void add(Comparable item) {
		if (first == null) {
			first = new Node(item);
			count++;
			return;
		}
		Node last = first;
		while (last.next != null) {
			last = last.next;
		}
		last.next = new Node(item);
		count++;
	}

	// to display in same line
	public void display() {

		Node last = first;
		for (int i = 1; i <= size(); i++) {
			System.out.print(last.data + " ");
			last = last.next;
		}
	}

	// to display with new line
	public void displayln() {

		Node last = first;
		for (int i = 1; i <= size(); i++) {
			System.out.println(last.data);
			last = last.next;
		}
	}

	// to add an item in sorted order
	public void addSort(Comparable item) {
		Node nodeToInsert = new Node(item);
		Node current = null;

		if (first == null || first.data.compareTo(nodeToInsert.data) >= 0) {
			nodeToInsert.next = first;
			first = nodeToInsert;
			count++;
//			System.out.println(item + " added successfully");
			return;
		} else {
			current = first;
			tail = first;
			while (current.next != null && current.next.data.compareTo(nodeToInsert.data) < 0) {
				current = current.next;
			}
			nodeToInsert.next = current.next;
			current.next = nodeToInsert;
			count++;
//			System.out.println(item + " added successfully");

			while (tail.next != null) {
				tail = tail.next;
			}
			return;
		}
	}

	// to see first data
	public Comparable peek() {
		return first.data;
	}

	public void insert(Comparable item, int pos) {
		if (pos > count)
			throw new IndexOutOfBoundsException();
		if (pos == 0) {
			first = new Node(item, first);
			count++;
			return;
		}
		Node temp = first;
		for (int i = 1; i < pos; i++) {
			temp = temp.next;
		}
		temp.next = new Node(item, temp.next);
		count++;
	}

	// to find out size
	public int size() {
		return count;
	}
//to get an item based on index
	public Comparable get(int pos) 
	{
		if (pos == 0) {
			
			return first.data;
		}
		if(pos==1)
		{
			return first.next.data;
		}
		if (pos == size()) {
			Node last = first;
			for (int i = 1; i < size() - 1; i++) {
				last = last.next;
			}
			return last.next.data;
		}
		Node last = first;
		for (int i = 0; i < pos - 1; i++) {
			last = last.next;
		}
		return last.next.data;
	}
	
	// to search an item whether present or not

	public boolean search(Comparable item) {
		Node temp = first;
		if(first==null)
			return false;
		if(temp.data.compareTo(item)==0)
		{
			return true;
		}
		while (temp.next != null) {
			if (temp.data.compareTo(item) == 0) {
				return true;
			}
			temp = temp.next;		
		}
		return false;
	}

	// to find a value based on index
	public int index(Comparable item) {
		Node last = first;
		int count = 1;
		if (last.data.compareTo(item) == 0)
			return count;
		while (last.next != null) {
			if (last.data.compareTo(item) == 0) {
				return count;
			}
			count++;
			last = last.next;
			if (count == size()) {
				return count;
			}
		}
		return -1;
	}

	// to check whether the list empty or not
	public boolean isEmpty() {
		if (first == null)
			return true;
		return false;
	}

	// to add an item at last
	public void append(Comparable item) {
		Node last = first;
		while (last.next != null) {
			last = last.next;
		}
		last.next = new Node(item, last.next);
		count++;
	}

	// to remove an item
	public void remove(Comparable item) {
		if (first.data.compareTo(item) == 0) {
			first = first.next;
			count--;
			return;
		}
		Node last = first;
		Node temp;
		while (last.next != null) {
			temp = last;
			last = last.next;
			if (last.data.compareTo(item) == 0) {
				temp.next = temp.next.next;
				count--;
			}
		}
	}

	// to remove based on index
	public Comparable pop(int pos) {

		if (pos == 0) {
			Node temp = first;
			first = first.next;
			count--;
			return temp.data;
		}
		if (pos == size()) {
			Node last = first;
			for (int i = 1; i < size() - 1; i++) {
				last = last.next;
			}
			Node temp = last.next;
			last.next = null;
			count--;
			return temp.data;
		}
		Node last = first;
		for (int i = 1; i < pos - 1; i++) {
			last = last.next;
		}
		Node temp = last.next;
		last.next = last.next.next;
		count--;
		return temp.data;
	}
	public Comparable removeAt(int index) {
        if (index == 0) {
            Comparable temp = first.data;
            first =  first.next;
            count--;
            return temp;
        }
        Node t = first;
        int counter = 0;
        while (counter < index - 1) {
            t = t.next;
            counter++;
        }
        Comparable temp = t.next.data;
        t.next = t.next.next;
        count--;
        return temp;
    }
	// to remove last element and show
	public Comparable pop() {
		Node last = first;
		if (first.next == null) {
			Comparable c = first.data;
			first = null;
			count--;
			return c;
		}
		for (int j = 1; j < size() - 1; j++) {
			last = last.next;
		}
		Node temp = last.next;
		last.next = null;
		count--;
		return temp.data;
	}
}
