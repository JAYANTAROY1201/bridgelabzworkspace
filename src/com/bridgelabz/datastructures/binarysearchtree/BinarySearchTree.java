package com.bridgelabz.datastructures.binarysearchtree;

import com.bridgelabz.utility.Utility;

/**
 *Purpose: To find the number of possible BST
 * @author Jayanta Roy
 * @version 1.0
 * @since 30/05/2018
 */
public class BinarySearchTree {
	
	public static void main(String[] args) {
		System.out.println("Enter no of test cases:");
		int test = Utility.readInteger();
		int[] nodes = new int[test];
		System.out.println("Enter nodes:");
		for (int i = 0; i < test; i++) {
			nodes[i] = Utility.readInteger();
		}
		for (int j = 0; j < test; j++) {
			try {
				System.out.println("Possibe no. of binary search tree with " + nodes[j] + " node(s):"
						+ UtilityBinarySearchTree.countBST(nodes[j]));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
