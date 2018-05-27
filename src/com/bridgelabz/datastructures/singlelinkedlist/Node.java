package com.bridgelabz.datastructures.singlelinkedlist;

public class Node<G extends Comparable<G>> {
	public G data;
	public Node<G> next;

	public Node(G data) {
		this.data = data;
		this.next = null;
	}

	public Node(G data, Node<G> next) {
		this.data = data;
		this.next = next;
	}
}
