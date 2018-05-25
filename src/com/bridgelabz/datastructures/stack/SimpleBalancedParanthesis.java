package com.bridgelabz.datastructures.stack;

import com.bridgelabz.utility.Utility;

/**
 * purpose: To find a mathematical expression is balanced or not
 * @author JAYANTA ROY
 * @version 1.0
 * @since 25-05-2018
 */
public class SimpleBalancedParanthesis {

	public static void main(String[] args) {
		Stack myStack = Stack.stack(15);

		System.out.println("Enter mathematical expression:");
		String expression = Utility.readString();
		char[] exp = expression.toCharArray();
		for (int i = 0; i < exp.length; i++) {
			if (exp[i] == '(')
				myStack.push(exp[i]);
			if (exp[i] == ')')
				myStack.pop();
		}
		if (myStack.isEmpty()) {
			System.out.println("The expression is balanced");
		} else {
			System.err.println("The expression is not balanced");
		}
	}

}
