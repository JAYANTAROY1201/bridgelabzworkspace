package com.bridgelabz.datastructures.stack;

/**
 * purpose: To implement a Stack
 * @author JAYANTA ROY
 * @version 1.0
 * @since 25-05-2018
 */
public class Stack {

	private int maxSize;
	private Comparable[] stackArray;
	private int top;

	public Stack(int size) {
		maxSize = size;
		stackArray = new Comparable[maxSize];
		top = -1;
	}

	// to create a empty stack

	public static Stack stack(int size) {
		return new Stack(size);
	}

	// to push an element into the stack
	public void push(Comparable value) {
		if (top == maxSize - 1)
			System.err.println("stack overflowed");
		stackArray[++top] = value;
	}

	// to pop an item from the top and remove it
	public Comparable pop() {
		return stackArray[top--];
	}

	// to fetch an item from top without removing it
	public Comparable peek() {
		return stackArray[top];
	}

	// to check whether the stack is empty or not
	public boolean isEmpty() {
		return (top <= -1);
	}

	// to check whether stack is full or not
	public boolean isFull() {
		return (top == maxSize - 1);
	}

	// to find the size of the stack
	public int size() {
		return top;
	}

}
