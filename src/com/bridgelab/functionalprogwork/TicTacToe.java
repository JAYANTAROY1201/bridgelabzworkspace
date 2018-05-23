package com.bridgelab.functionalprogwork;

import com.bridgelabz.utility.Utility;

/**
 * Purpose : To implement a tic tac toe game
 * 
 * @author JAYANTA ROY
 * @version 1.0
 * @since 22-05-2018
 */
public class TicTacToe {

	public static void main(String[] args) {
		char[] board = new char[9];
		Utility.initializeBoard(board);
		Utility.printBoard(board);
		if (Math.random() < 0.5) {
			Utility.myTurn(board);
		} else {
			Utility.computerTurn(board);
		}

	}
}
