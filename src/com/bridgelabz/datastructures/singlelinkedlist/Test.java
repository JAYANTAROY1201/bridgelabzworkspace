package com.bridgelabz.datastructures.singlelinkedlist;
/**
 * purpose: to test the singlelinkedlist
 * @author Jayanta Roy
 * @version 1.0
 * @since 04/06/2018
 */
public class Test {

	public static void main(String[] args) {
		SingleLinkedList l=new SingleLinkedList();
		System.out.println(l.search(157));
		l.add("a");
//		System.out.println(l.search(56));
		l.add("b");
		l.add("c");
	l.add("d");
	l.add("e");
	l.add("f");
	l.display();
	l.removeAt(2);
	l.display();
	l.insert("g", 2);;
	l.display();
	}

}
