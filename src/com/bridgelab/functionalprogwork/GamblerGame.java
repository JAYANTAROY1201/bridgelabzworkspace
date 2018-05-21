package com.bridgelab.functionalprogwork;

import com.bridgelabz.utility.Utility;

/**
 *  Purpose: To play gambler and find no of win
 *
 *  @author  Jayanta Roy
 *  @version 1.0
 *  @since   17-05-2018
 *
 */

public class GamblerGame {
   public static void main(String[] args) 
   {
	  int stake, goal, noOfGame;
	  
	  Utility util=new Utility();
	  
	  System.out.println("Enter your stake:");
	  stake=Utility.readInteger();
	  
	  System.out.println("Enter your goal:");
	  goal=Utility.readInteger();
	  
	  System.out.println("Enter no of times you are going to play:");
	  System.out.println("chances must be equal or greater than:"+(goal-stake+5));
	  noOfGame=Utility.readInteger();
      
	  util.playGambler(stake, goal, noOfGame);

	}
}
