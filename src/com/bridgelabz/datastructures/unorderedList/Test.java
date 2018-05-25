package com.bridgelabz.datastructures.unorderedList;

/**
 * purpose: To test unorderedlist
 * @author JAYANTA ROY
 * @version 1.0
 * @since 24-05-2018
 */
public class Test {

	public static void main(String[] args) {
		UnorderedList l = new UnorderedList();
		l.add(10);
		l.display();
		l.add(20);
		l.display();
		l.add(30);
		l.add(40);
		l.display();
		l.remove(30);
		l.display();
		l.remove(10);
		l.display();
		l.pop();
		l.display();
		System.out.println(l.pop(2));
		l.display();
		l.insert(2, 45);
		l.display();
		l.insert(2, 75);
		l.display();
		// l.remove(75);
		l.display();
		// l.pop(2);
		// l.display();
		// l.pop();
		// l.display();
		System.out.println(l.search(75));
	}

}
