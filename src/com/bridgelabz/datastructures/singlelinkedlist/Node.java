package com.bridgelabz.datastructures.singlelinkedlist;
/**
 * Purpose: to create a node
 * @author Jayanta Roy
 * @version 1.0
 * @since 26/05/18
 */
public class Node {
	public Comparable data;
	public Node next;

	public Node(Comparable data) {
		this.data = data;
		this.next = null;
	}

	public Node(Comparable data, Node next) {
		this.data = data;
		this.next = next;
	}
}
