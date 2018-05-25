package com.bridgelabz.datastructures.orderList;

/**
 * purpose: To define a orderlist
 * @author JAYANTA ROY
 * @version 1.0
 * @since 25-05-2018
 */
public class OrderedList {
	public static Node head;
	public static Node tail;
	static int count;

	// to create a new empty list
	public static OrderedList list() {
		return new OrderedList();
	}

	// to add an item to the list
	public void add(Comparable item) {
		Node nodeToInsert = new Node(item);
		Node current = null;

		if (head == null || head.data.compareTo(nodeToInsert.data) >= 0) {
			nodeToInsert.next = head;
			head = nodeToInsert;
			count++;
			System.out.println(item + " added successfully");
			return;
		} else {
			current = head;
			tail = head;
			while (current.next != null && current.next.data.compareTo(nodeToInsert.data) < 0) {
				current = current.next;
			}
			nodeToInsert.next = current.next;
			current.next = nodeToInsert;
			count++;
			System.out.println(item + " added successfully");

			while (tail.next != null) {
				tail = tail.next;
			}
			return;
		}
	}

	// to find the size of the list
	public static int size() {
		return count;
	}

	// to find a a list empty or not
	public static boolean isEmpty() {
		if (count == 0)
			return true;
		return false;
	}

	// to return a index of a particular value
	public static int index(Comparable item) {
		int pos = 0;
		Node temp = head;
		while (temp.data.compareTo(item) != 0) {
			temp = temp.next;
			pos++;
		}

		return pos;
	}

	// to check whethrt the item is present or not
	public static boolean search(Comparable item) {

		Node temp = head;
		if (tail.data.compareTo(item) == 0)
			return true;
		while (temp.next != null) {
			if (temp.data.compareTo(item) == 0)
				return true;
			else {
				temp = temp.next;
			}
		}
		return false;
	}

	// to remove a specified item from the list
	public static void remove(Comparable item) {
		Node temp = head, prev = null;
		if (temp != null && temp.data.compareTo(item) == 0) {
			head = temp.next; // Changed head
			count--;
			System.out.println(item + " removed successfully");
			return;
		}
		while (temp != null && temp.data.compareTo(item) != 0) {
			prev = temp;
			temp = temp.next;
		}
		if (temp == null) {
			System.out.println("Element not found");
		} else {
			prev.next = temp.next;
			count--;
			System.out.println(item + " removed successfully");
		}
	}

	// to fetch the last item as well as to remove it
	public static Comparable pop() {
		Node current = head;
		Node nextNode = current.next;
		if (head.next == null) {
			Comparable c = head.data;
			head = null;
			count--;
			return c;
		}
		while (nextNode.next != null) {
			current = current.next;
			nextNode = current.next;
		}
		Comparable c = nextNode.data;
		current.next = null;
		count--;
		return c;
	}

	public static void display() {
		System.out.println();
		Node temp = head;
		for (int i = 1; i <= size(); i++) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	// to fetch an item from specified position and to revove it
	public static Comparable pop(int pos) {
		pos = pos - 1;
		Node current = head, prev = null;
		if (pos == 0) {
			Comparable c = head.data;
			head = current.next; // Changed head
			count--;
			return c;
		}
		for (int i = 0; i < pos; i++) {
			prev = current;
			current = current.next;
		}
		if (current == null) {
			System.out.println("Element not found");
			return null;
		} 
		else {
			Comparable c = current.data;
			prev.next = current.next;
			count--;
			return c;
		}

	}
}
