package com.bridgelabz.datastructures.deque;

/**
 * purpose: To implement an unordered list
 * @author JAYANTA ROY
 * @version 1.0
 * @since 24-05-2018
 */
public class DequeList {
	public static Node front;
	public static Node rear;
	static int count;

	// to create a new empty list
	public static DequeList dequelist() {
		return (new DequeList());
	}

	// to add an item to the front list
	public void addFront(Comparable item) {
		Node nodeToInsert = new Node(item, null);
		if (front == null) {
			front = nodeToInsert;
			count++;
			System.out.println(item + " added successfully");
			return;
		}
		rear=front;
		nodeToInsert.next=front;
		front=nodeToInsert;
		count++;
		System.out.println(item + " added successfully");
		
		while(rear.next!=null)
		{
			rear=rear.next;
		}
		return;	
	}

	// to add an item to the last
	public void addRear(Comparable item) {
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


	// to check whether the item is present or not
	public static boolean search(Comparable item) {

		Node temp = front;
		if (rear.data.compareTo(item) == 0)
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


	// to remove the last item as well as to remove it
	public static Comparable removeFront() {
		Comparable res=front.data;
		front=front.next;
		return res;
	}

	// to fetch the last item as well as to remove it
	public static Comparable removeRear() {
		Node current = front;
		Node nextNode = current.next;
		if (front.next == null) {
			Comparable c = front.data;
			front = null;
			count--;
			return c;
		}
		while (nextNode.next != null) {
			current = current.next;
			nextNode = current.next;
		}
		Comparable c = nextNode.data;
		current.next = null;
		rear=current;
		nextNode=null;
		count--;
		return c;
	}
	
   //to display items
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

