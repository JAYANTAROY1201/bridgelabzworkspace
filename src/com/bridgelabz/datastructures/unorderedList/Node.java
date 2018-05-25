package com.bridgelabz.datastructures.unorderedList;

/**
 * purpose: To define a node
 * @author JAYANTA ROY
 * @version 1.0
 * @since 24-05-2018
 */
public class Node {

	Comparable data;
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
