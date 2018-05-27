package com.bridgelabz.datastructures.singlelinkedlist;

public class SingleLinkedList<G extends Comparable<G>> {

	@SuppressWarnings("rawtypes")
	public static Node head;
	@SuppressWarnings("rawtypes")
	public static Node tail;
	static int count;

	
//add an item at last	
	@SuppressWarnings("unchecked")
	public static <G extends Comparable<G>> void add(G item) {
		Node<G> temp = new Node<G>(item, null);
		if (head == null) {
			head = temp;
			count++;
			System.out.println(item + " added successfully");
			return;
		}

		tail = head;
		while (tail.next != null) {
			tail = tail.next;
		}
		tail.next = temp;
		tail = temp;
		count++;
		System.out.println(item + " added successfully");
	}

	
//add an item to front
@SuppressWarnings("unchecked")
public static<G extends Comparable<G>>void addFirst(G item) {
			Node<G> nodeToInsert = new Node<G>(item, null);
			if (head == null) {
				head = nodeToInsert;
				count++;
				System.out.println(item + " added successfully");
				return;
			}
			tail=head;
			nodeToInsert.next=head;
			head=nodeToInsert;
			count++;
			System.out.println(item + " added successfully");
			
			while(tail.next!=null)
			{
				tail=tail.next;
			}
				
		}
// to add an item in sorted order
		@SuppressWarnings("unchecked")
		public static <G extends Comparable<G>> void  addSort(G item) {
			Node<G> nodeToInsert = new Node<G>(item);
			Node<G> current = null;

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

//to insert an item to given position
	@SuppressWarnings("unchecked")
	public static <G extends Comparable<G>> void insert(int pos, G item) {
		Node<G> nodeToInsert = new Node<G>(item);
		if (pos > size()) {
			System.out.println("Position not available");
		}
		if (pos == 1) {
			nodeToInsert.next = head;
			nodeToInsert = head;
			count++;
		} else {
			int trans = 1;
			Node<G> temp = head;
			while (trans != pos - 1) {
				temp = temp.next;
				trans++;
			}
			Node<G> n = temp.next;
			temp.next = nodeToInsert;
			nodeToInsert.next = n;
			count++;
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
	@SuppressWarnings("unchecked")
	public static <G extends Comparable<G>> int index(G item) {
		int pos = 0;
		Node<G> temp = head;
		while (temp.data.compareTo(item) != 0) {
			temp = temp.next;
			pos++;
		}
		return pos;
	}

	// to check whethrt the item is present or not
	@SuppressWarnings("unchecked")
	public static <G extends Comparable<G>> boolean search(G item) {

		Node<G> temp = head;
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
	@SuppressWarnings("unchecked")
	public static <G extends Comparable<G>> void remove(G item) {
		Node<G> temp = head, prev = null;
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
	@SuppressWarnings("unchecked")
	public static <G extends Comparable<G>> G pop() {
		Node<G> current = head;
		Node<G> nextNode = current.next;
		if (head.next == null) {
			G c = (G) head.data;
			head = null;
			count--;
			return c;
		}
		while (nextNode.next != null) {
			current = current.next;
			nextNode = current.next;
		}
		G c = (G) nextNode.data;
		current.next = null;
		current=tail;
		count--;
		return c;
	}
<<<<<<< HEAD
    
	
	@SuppressWarnings("unchecked")
	public static <G extends Comparable<G>> G peek()
	{
		return ((G)head.data);
	}
=======

>>>>>>> 257a06d102d8e57171360e0d183ac6c83f3d29a9
	@SuppressWarnings("unchecked")
	public static <G extends Comparable<G>> void display() {
		System.out.println();
		Node<G> temp = head;
		for (int i = 1; i <= size(); i++) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

<<<<<<< HEAD
// to fetch an item from specified position and to remove it
=======
// to fetch an item from specified position and to revove it
>>>>>>> 257a06d102d8e57171360e0d183ac6c83f3d29a9
	@SuppressWarnings("unchecked")
	public static <G extends Comparable<G>> G removeByPosition(int pos) {
		pos = pos - 1;
		Node<G> current = head, prev = null;
		if (pos == 0) {
			G c = (G) head.data;
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
		} else {
			G c = (G) current.data;
			prev.next = current.next;
			count--;
			return c;
		}
	}
	
	
}
