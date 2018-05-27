package com.bridgelabz.datastructures.orderList;

/**
 * purpose: To test orderedlist
 * @author JAYANTA ROY
 * @version 1.0
 * @since 25-05-2018
 */
public class Test {

	public static void main(String[] args) {
		OrderedList ol = new OrderedList();
		System.out.println(ol.size());
		ol.add(55);
		ol.display();
		ol.add(45);
		ol.display();
		ol.add(50);
		ol.display();
		ol.add(75);
		ol.display();
		System.out.println(ol.search(50));
	}
}
