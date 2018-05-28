package com.bridgelabz.datastructures.stack;
/**
 * PURPOSE: TEST CLASS FOR STACK
 * @author JAYANTA ROY
 * @version 1.0
 * @since 28-05-2018
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StackList l=new StackList();

l.push(10);
l.push(50);
l.push(79);
l.display();
System.out.println(l.get(2));
System.out.println(l.get(3));
	}

}
