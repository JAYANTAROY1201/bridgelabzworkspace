package com.bridgelabz.oops.deckcards;

import java.util.Random;

import com.bridgelabz.datastructures.singlelinkedlist.SingleLinkedList;

public class UtilityDeck {


	/**
	 * Purpose: This method is written to distribute cards among 4 players
	 * @param cards
	 * @return 2D string array of players
	 */
	public static String[][] distributeCard(SingleLinkedList[] cards)
	{
	Random r=new Random();
	String[][]players= new String[4][9];
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<9;j++)
		{
			int pos=r.nextInt(51);
			if(!(cards[pos].isEmpty()))
			{
				players[i][j]=(String)cards[pos].pop();
			}
			else
			{
				j--;
			}
		}
	}
	return players;
	}//distribution end
	
	
	/**
	 * Purpose: this method is written to sort rearrange the cards of each player 
	 * @param players
	 * @return arrange array
	 */
	public static SingleLinkedList[] rearranging(String[][] players) 
	{
	SingleLinkedList[] arrange=new SingleLinkedList[4];
	
	for(int i=0;i<4;i++)
	{
		arrange[i]=new SingleLinkedList();
		for(int j=0;j<9;j++)
		{
			arrange[i].addSort(players[i][j]);
		}
	}
	return arrange;
	}//rearranging end


/**
 * Purpose: to show distribution of each player
 * @param players
 */
public static void showDistribution(String[][]players)
{
	for(int i=0;i<4;i++)
	{   
		System.out.println("Player "+(i+1)+" get");
		for(int j=0;j<9;j++)
		{
			System.out.print("|"+players[i][j]+"|    ");
		}
		System.out.println();
		System.out.println();
	}
System.out.println("***********************************************************************************************************************************");		
System.out.println("***********************************************************************************************************************************");		
}//showing distribution end


//
/**
 * Purpose: to show after sorting card of each player
 * @param arrange
 */
public static void showBySorted(SingleLinkedList[] arrange)
{
  for(int i=0;i<4;i++)
	{   
		System.out.println("Player "+(i+1)+" sorting cards");
		for(int j=0;j<9;j++)
		{
			System.out.print("|"+arrange[i].pop(0)+"|    ");
		}
		System.out.println();
		System.out.println();
	}
}//showing by sorted
}
