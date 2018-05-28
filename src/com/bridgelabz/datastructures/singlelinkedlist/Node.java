package com.bridgelabz.datastructures.singlelinkedlist;

public class Node{
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
