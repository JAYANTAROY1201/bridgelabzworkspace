package com.bridgelabz.oops.deckcards;

import com.bridgelabz.datastructures.singlelinkedlist.SingleLinkedList;

/**
 * Purpose: To distribute cards among four player in random manner
 * @author Jayanta Roy
 * @version 1.0
 * @since 30/05/18
 */
public class DeckOfCards {

	public static void main(String[] args) {
		String[] suit= {"Clubs","Diamonds","Hearts","Spades"};
		String[] rank= {"2", "3", "4", "5", "6", "7", "8", "9", "10",				
		                  "Jack", "Queen", "King", "Ace" };
		int index=0;
		SingleLinkedList[] cards=new SingleLinkedList[52];
		for(int i=0;i<cards.length;i++)
		{
			cards[i]=new SingleLinkedList();
		}
		
		for(int i=0;i<suit.length;i++)
		{
			for(int j=0;j<rank.length;j++)
			{				
				cards[index++].add((rank[j]+" "+suit[i]));
			}
		}
		
		String[][]players=UtilityDeck.distributeCard(cards);
		UtilityDeck.showDistribution(players);
		
		SingleLinkedList[] arrange=UtilityDeck.rearranging(players);
		UtilityDeck.showBySorted(arrange);
	}//main method end

		
}


