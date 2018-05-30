package com.bridgelabz.datastructures.calender;

import com.bridgelabz.datastructures.queue.Queue;
import com.bridgelabz.datastructures.stack.StackList;

/**
 * PURPOSE: Utility class for calender
 * @author Jayanta Roy
 * @version 1.0
 * @since 28-05-2018
 */
public class UtilityCalender {

	public static boolean dateValidator(int d, int month, int y) {

		boolean b = true;
		if (((month == 4 || month == 6 || month == 9 || month == 11) && (d > 30)) || (d > 31)
				|| (month == 2 && y % 100 == 0 && y % 400 != 0 && d > 28) || (month == 2 && y % 400 == 0 && d > 29)
				|| (month == 2 && y % 100 != 0 && y % 4 != 0 && d > 28)
				|| (month == 2 && y % 100 != 0 && y % 4 == 0 && d > 29)) {
			b = false;
		} else {
			b = true;
		}
		return b;
	}

	public static int dayStart(int d, int m, int y) {
		int y0 = y - (14 - m) / 12;
		int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		return ((d + x + (31 * m0) / 12) % 7);

	}

	public static void stackCalender(int m, int y) {
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
		String[] monthArray = { " ", "January", "February", "March", "April", "May", "June", "July", "August",
				"September", "October", "November", "December" };
		String[] daysArray = { " S", " M", " T", " W", "Th", " F", " S" };
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				first[i][j].push("  ");
			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (dateValidator(d, m, y)) {
					j = dayStart(d, m, y);
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

	public static void queueCalender(int m, int y) {
		Queue a[][] = new Queue[6][];
		for (int i = 0; i < 6; i++) {
			a[i] = new Queue[7];
			for (int j = 0; j < 7; j++) {
				a[i][j] = new Queue();
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
			for (int j = 0; j < 7; j++) {
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
