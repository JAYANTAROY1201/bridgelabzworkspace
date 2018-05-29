package com.bridgelabz.datastructures.calender;

import com.bridgelabz.datastructures.stack.StackList;

/**
 * Purpose: implement a calender using stack
 * @author Jayanta Roy
 * @version 1.0
 * @since 29/05/2018
 */
public class StackCalender {

	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		StackList first[][] = new StackList[6][];
		for (int i = 0; i < 6; i++) {
			first[i] = new StackList[7];
			for (int j = 0; j < 7; j++) {
				first[i][j] = new StackList();
			}
		}

		StackList a[][] = new StackList[6][];
		for (int i = 0; i < 6; i++) {
			a[i] = new StackList[7];
			for (int j = 0; j < 7; j++) {
				a[i][j] = new StackList();
			}
		}
		int d = 1;
		String[] monthArray = { " ", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		String[] daysArray = { " S", " M", " T", " W", "Th", " F", " S" };
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				first[i][j].push("  ");
			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (UtilityCalender.dateValidator(d, m, y)) {
					j = UtilityCalender.dayStart(d, m, y);
					if (d < 10) {
						first[i][j].pop();
						first[i][j].push(" " + d);
						d++;
					} else {
						first[i][j].pop();
						first[i][j].push("" + d);
						d++;
					}
				}
			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				a[i][j].push(first[i][j].pop());
			}
		}

		// System.out.println("printing");
		// System.out.println(a[0][6].size());
		System.out.println(monthArray[m] + " " + y);
		System.out.println();
		for (int i = 0; i < 7; i++) {
			System.out.print(daysArray[i] + "  ");
		}
		System.out.println();
		System.out.println("--------------------------");
		for (int x = 0; x < 6; x++) {
			for (int y1 = 0; y1 < 7; y1++) {
				System.out.print(a[x][y1].pop() + "  ");
			}
			System.out.println();
		}

	}

}
