package com.bridgelabz.datastructures.calender;

import com.bridgelabz.datastructures.queue.Queue;
import com.bridgelabz.datastructures.singlelinkedlist.SingleLinkedList;
/**
 * Purpose: implement a calender using queue
 * @author Jayanta Roy
 * @version 1.0
 * @since 29/05/2018
 */
public class QueueCalender {

	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		Queue a[][]=new Queue[6][];
		for(int i=0;i<6;i++)
		{
			a[i]=new Queue[7];
			for( int j=0;j<7;j++)
			{
				a[i][j]=new Queue();
			}
		}
		int d = 1;
		String[] months = { " ", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				           "October", "November", "December" };
		String[] days = { " S", " M", " T", " W", "Th", " F", " S" };
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				a[i][j].enqueue("  ");
			}
		}
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <7; j++) {
				if (UtilityCalender.dateValidator(d, m, y)) {
					j = UtilityCalender.dayStart(d, m, y);
					if (d < 10) {						
						a[i][j].dequeue();
						a[i][j].enqueue(" " + d);
						d++;
					} else {
						a[i][j].dequeue();
						a[i][j].enqueue("" + d);
						d++;
					}
				}
			}
		}
		
		//System.out.println("printing");
		//System.out.println(a[0][6].size());
		System.out.println(months[m] + " " + y);
		System.out.println();
		for (int i = 0; i < 7; i++) {
			System.out.print(days[i] + "  ");
		}
		System.out.println();
		System.out.println("--------------------------");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(a[i][j].dequeue() + "  ");
			}
			System.out.println();
		}
		
	}

}
