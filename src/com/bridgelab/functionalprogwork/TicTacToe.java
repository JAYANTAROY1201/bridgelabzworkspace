package com.bridgelab.functionalprogwork;

import com.bridgelabz.utility.Utility;

/**
 *  Purpose: To implement a TIC-TAC-TOE game
 *  @author  Jayanta Roy
 *  @version 1.0
 *  @since   18-05-2018
 *
 */

public class TicTacToe {

	public static void main(String[] args) {
        char[] board = new char[9];
        Utility.initializeBoard(board);
        Utility.printBoard(board);
        if(Math.random()<0.5)
        {
        	Utility.myTurn(board);
        }
        else
        {
        	Utility.computerTurn(board);
        }
        

	}
}
	

