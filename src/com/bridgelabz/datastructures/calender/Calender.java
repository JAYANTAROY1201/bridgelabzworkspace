package com.bridgelabz.datastructures.calender;

/**
 * purpose: TO get a view a calender month wise
 * @author JAYANTA ROY
 * @version 1.0
 * @since 28/5/2018
 */
public class Calender {

	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		String[][] a = new String[6][7];
		int d = 1;
		String[] month = { " ", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				           "October", "November", "December" };
		String[] day = { " S", " M", " T", " W", "Th", " F", " S" };
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				a[i][j] = "  ";
			}
		}
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (UtilityCalender.dateValidator(d, m, y)) {
					j = UtilityCalender.dayStart(d, m, y);
					if (d < 10) {
						a[i][j] = " " + d++;
					} else {
						a[i][j] = "" + d++;
					}
				}

			}
		}

		System.out.println(month[m] + " " + y);
		System.out.println();
		for (int i = 0; i < 7; i++) {
			System.out.print(day[i] + "  ");
		}
		System.out.println();
		System.out.println("-------------------------");
		for (int k = 0; k < 6; k++) {
			for (int l = 0; l < 7; l++) {
				System.out.print(a[k][l] + "  ");
			}
			System.out.println();
		}
	}

}
