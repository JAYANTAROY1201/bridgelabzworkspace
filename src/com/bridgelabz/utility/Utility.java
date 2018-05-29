package com.bridgelabz.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Utility {
	static Scanner sc = new Scanner(System.in);

	/*
	 * number variable stores the number entered by the user as the input
	 */
	public static int readInteger() {
		int number = sc.nextInt();

		return number;
	}
	// ____________________________________________________________________________________________________________

	/*
	 * String variable stores the String entered by the user as the input
	 */
	public static String readString() {
		String str = sc.next();
		return str;
	}

	// _______________________________________________________________________________________

	/*
	 * String variable stores the String entered by the user as the input
	 */
	public static char readCharacter() {
		char str = sc.next().charAt(0);
		// sc.close();
		return str;
	}

	// _______________________________________________________________________________________

	/*
	 * createOneDimensionalIntArray method to create 1d array
	 */

	public static Integer[] createOneDimensionalIntArray() {
		int size;
		System.out.println("Enter size of array");
		size = readInteger();
		Integer[] a = new Integer[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter value for a[" + i + "]  :");
			a[i] = readInteger();
		}
		return a;
	}
	// _______________________________________________________________________________________

	/*
	 * createOneDimensionalStringArray method to create 1d array
	 */

	public static String[] createOneDimensionalStringArray() {
		int size;
		System.out.println("Enter size of array");
		size = readInteger();
		String[] a = new String[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter value for a[" + i + "]  :");
			a[i] = readString();
		}
		return a;
	}

	// _______________________________________________________________________________________________________________________

	/*
	 * PrintOneDimensionArray method to print a 1d array in matrix form
	 */
	public static void PrintOneDimensionArray(Integer[] a) {

		System.out.println("Your array is as below:");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");

		}
		return;
	}

	// ____________________________________________________________________________________________________________________
	/*
	 * createTwodArray method to generate a 2d array
	 */

	public static int[][] createTwodIntArray() {
		int row, col;
		System.out.println("Enter no of rows:");
		row = Utility.readInteger();
		System.out.println("Enter no of columns:");
		col = Utility.readInteger();

		int[][] a = new int[row][col];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Enter value for a[" + i + "][" + j + "] position :");
				a[i][j] = Utility.readInteger();
			}
		}
		return a;
	}

	// ____________________________________________________________________________________________________________________
	/*
	 * createTwodArray method to generate a 2d array
	 */

	public static String[][] createTwodStringArray() {
		int row, col;
		System.out.println("Enter no of rows:");
		row = Utility.readInteger();
		System.out.println("Enter no of columns:");
		col = Utility.readInteger();

		String[][] a = new String[row][col];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Enter value for a[" + i + "][" + j + "] position :");
				a[i][j] = Utility.readString();
			}
		}
		return a;
	}
	// _______________________________________________________________________________

	/*
	 * PrintTwoDimensionArray method to print a 2d array in matrix form
	 */

	public static void PrintTwoDimensionArray(int[][] a) {
		System.out.println();
		System.out.println();
		System.out.println("Your array is as below:");
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "  ");

			}
			System.out.println();
			System.out.println();
		}
		return;
	}

	// __________________________________________________________________________________

	/*
	 * replaceUserName method to replace a template with given user name
	 */
	public String replaceUserName(String user) {
		String template = "Hello <<UserName>>, How are you?";
		String out = "";

		if (user.length() > 3) {
			String[] temp = template.split(" ");
			for (int i = 0; i < temp.length; i++) {
				if (temp[i].equals("<<UserName>>,")) {
					temp[i] = user + ",";
				}
			}
			for (int i = 0; i < temp.length; i++) {
				out = out + temp[i] + " ";
			}
		}
		return out;
	}

	// ___________________________________________________________________________________-

	/*
	 * findFlipPercent method to finding the percent of head and tail
	 */

	public void findFlipPercent(int no_of_flip) {

		int head = 0, tail = 0, headPercent, tailPercent;

		for (int i = 0; i < no_of_flip; i++) {
			if (Math.random() < 0.5) {
				tail++;
			} else {
				head++;
			}

		}
		headPercent = (head * 100) / no_of_flip;
		tailPercent = (tail * 100) / no_of_flip;

		System.out.println("Head percentage is :" + headPercent);
		System.out.println("Tail percentage is :" + tailPercent);
	}

	// ______________________________________________________________________________

	/*
	 * checkLeapYear method to find a year is leap year or not
	 */

	public static void checkLeapYear(int year) {

		String LEAP_YEAR = " is a Leap Year";
		String NOT_LEAP_YEAR = " is not a Leap Year";

		if (year < 1582) {
			System.out.println("Invalid year");
		} else {
			if ((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
				System.out.println(year + LEAP_YEAR);
			} else {
				System.out.println(year + NOT_LEAP_YEAR);
			}
		}
	}
	// ______________________________________________________________________________________

	/*
	 * find_PowerOfTwo method to print table of 2's power
	 */

	public static void findPowerOfTwo(int num) {
		int mOutput = 1;
		for (int i = 1; i <= num; i++) {
			mOutput = mOutput * 2;
			System.out.println("2 ^ " + i + " = " + mOutput);
		}
		if (num == 0) {
			mOutput = 1;
			System.out.println("2 ^ 0 = " + mOutput);
		}
	}

	// _______________________________________________________________________________

	/*
	 * findHarmonic method to print nth harmonic progression
	 */
	public void findHarmonic(int num) {

		double out = 0.0;
		while (num > 0) {
			out = out + (double) 1 / num;
			num--;
		}

		System.out.println("your result is:" + out);
	}

	// ___________________________________________________________________________________________________________

	/*
	 * findPrimeFactor method to find the prime factors of a given number
	 */
	public void findPrimeFactor(int num) {

		int temp;
		temp = num;

		ArrayList<Integer> factor = new ArrayList<Integer>();
		for (int i = 2; i * i <= num; i++) {
			while (num % i == 0) {
				factor.add(i);
				num = num / i;
			}
		}

		if (num > 1) {
			factor.add(num);
		}
		System.out.println("Prime factor(s) of " + temp + ":");
		for (Integer i : factor) {
			System.out.print(i + " ");
		}
	}

	// _____________________________________________________________________________________________________________

	/*
	 * playGambler method to find win and loss percentage of a gambler game
	 */

	public void playGambler(int stake, int goal, int noOfGame) {

		int win = 0, loss = 0, percentWin, percentLoss;

		for (int i = 0; i < noOfGame; i++) {

			if (Math.random() < 0.5) {
				stake++;
				win++;
				if (stake == goal || stake == 0) {
					break;
				}
			} else {
				stake--;
				loss++;
				if (stake == goal || stake == 0) {
					break;
				}

			}
		} // end of inner loop

		// end of outer loop
		percentWin = (win * 100) / (win + loss);
		percentLoss = (loss * 100) / (win + loss);

		System.out.println("No. of winning:" + win);
		System.out.println("Percentage. of winning:" + percentWin);
		System.out.println("Percentage of loss:" + percentLoss);

	}
	// _________________________________________________________________________________________________________________

	/*
	 * coupon_generator method to find how many random numbers are needed to
	 * generate a coupon
	 */
	public void generatorCouponCode(int lengthOfCoupon) {

		int count = 0;
		int code;
		ArrayList<Integer> coupon = new ArrayList<Integer>();

		Random r = new Random();
		while (coupon.size() < lengthOfCoupon) {
			code = r.nextInt();
			count++;
			if (!coupon.contains(code)) {
				coupon.add(code);
			}

		}

		System.out.println("You need total " + count + " random numbers to generate this coupon");

		for (Integer i : coupon) {
			System.out.println("coupon code" + i);
		}
	}

	// _________________________________________________________________________________________________________________________

	/*
	 * sum_of_num method to find when the summation gives zero
	 */

	public void sumOfNum(Integer[] a) {
		int count = 0;

		for (int j = 0; j < a.length; j++) {
			for (int k = j + 1; k < a.length; k++) {
				for (int l = k + 1; l < a.length; l++) {
					if (a[j] + a[k] + a[l] == 0) {
						count++;
						System.out.println("Sum of " + a[j] + "," + a[k] + " & " + a[l] + " is 0");
					}
				}
			}
		}
		System.out.println("Total " + count + " triplets found");
	}
	// ______________________________________________________________________________________________________________________________

	/*
	 * euclidean_distance method to find distance between two points
	 */

	public void CalculateEuclieanDistance(double x, double y) {
		double result;
		result = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));

		System.out.println("Euclidean distance from (" + x + " , " + y + ") to origin(0,0) is " + result + " unit(s)");
	}

	// _______________________________________________________________________________________________________________________________________

	/*
	 * findingRoots method to find roots of a quadratic
	 */
	public void findingRoots(int a, int b, int c) {
		int delta;
		double root_1_of_x, root_2_of_x;

		System.out.println();
		System.out.println("your equation is: " + a + "*x^2 + " + b + "*x + (" + c + ")");
		System.out.println();

		delta = ((b * b) - (4 * a * c));
		root_1_of_x = (((0 - b) + Math.sqrt(delta)) / (2 * a));
		root_2_of_x = (((0 - b) - Math.sqrt(delta)) / (2 * a));
		// System.out.println(Math.sqrt(delta));

		System.out.println("First root of x is:" + root_1_of_x);
		System.out.println("Second root of x is:" + root_2_of_x);

	}

	// _________________________________________________________________________________________________________________________________________________

	/*
	 * calculateEffectiveTemp method to find effective temperature of wind mill
	 */

	public void calculateEffectiveTemp(int t, int v) {
		double w;

		if (t > 50 || v > 120 || v < 3) {
			System.out.println("Out of Range");

		} else {
			w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
			System.out.println("Effective temperature for wind mill: " + w);
		}
	}
	// ________________________________________________________________________________

	/*
	 * calculateEffectiveTemp method to find effective temperature of wind mill
	 */

	public void measureTime() {
		int choice, temp = 0;
		long startTime = 0, endTime = 0;
		System.out.println("Press 1 to start your stopwatch");
		choice = readInteger();

		while (temp == 0) {
			switch (choice) {
			case 1:
				startTime = System.nanoTime(); // Get the current system time in nano second.
				System.out.println("Press 0 to stop the Stopwatch");
				choice = readInteger();
				break;

			case 0:
				endTime = System.nanoTime(); // Get the current system time in nano second.
				temp = 1;
				break;
			}
		}
		System.out.println("Starting time is : " + startTime + " ns");
		System.out.println("Ending time is : " + endTime + " ns");
		System.out.println("Elapsed Time is : " + ((endTime - startTime)/1000000000 )+ "s");
	}
	// ________________________________________________________________________________________________________________________________________

	/*
	 * StringPermutation method to find all permutation of a given string
	 */

	public static void stringPermutation(String inputString) {
		stringPermutation("", inputString);
	}

	private static void stringPermutation(String permute, String inputString) {
		if (inputString.length() == 0) {
			System.out.println(permute);
		} else {
			for (int i = 0; i < inputString.length(); i++) {
				stringPermutation(permute + inputString.charAt(i),
						inputString.substring(0, i) + inputString.substring(i + 1, inputString.length()));
			}
		}
	}

	// ____________________________________________________________________________________________________________________________________________________

	public static char[] initializeBoard(char[] board) {

		for (int i = 0; i < 9; i++) {
			board[i] = ' ';
		}
		return board;
	}

	public static void printBoard(char[] board) {

		System.out.println();
		System.out.println();
		System.out.println("---------------------");
		for (int i = 0; i < 9; i++) {
			int count = 0;
			for (int j = i; j < 9; j++) {
				count++;
				i = j;
				System.out.print("|  " + board[i] + "  |");

				if (count > 2)
					break;
			}
			System.out.println();
			System.out.println("---------------------");

		}
	}

	/*
	 * to check equality of characters
	 */
	private static boolean checkEqual(char c1, char c2, char c3) {
		return ((c1 != ' ') && (c1 == c2) && (c2 == c3));
	}

	/*
	 * to check equality of rows
	 */
	private static boolean rowWin(char[] board) {
		if ((checkEqual(board[0], board[1], board[2])) || (checkEqual(board[3], board[4], board[5]))
				|| (checkEqual(board[6], board[7], board[8]))) {
			return true;

		}
		return false;
	}

	/*
	 * to check equality of columns
	 */
	private static boolean colWin(char[] board) {

		if ((checkEqual(board[0], board[3], board[6])) || (checkEqual(board[1], board[4], board[7]))
				|| (checkEqual(board[2], board[5], board[8]))) {
			return true;

		}
		return false;
	}

	/*
	 * to check equality of diagonal
	 */
	private static boolean diagonalWin(char[] board) {

		if ((checkEqual(board[0], board[4], board[8])) || (checkEqual(board[2], board[4], board[6]))) {
			return true;
		}
		return false;
	}

	/*
	 * to check winning
	 */
	public static boolean checkForWin(char[] board) {
		return (rowWin(board) || colWin(board) || diagonalWin(board));
	}

	/*
	 * to check whether all position is occupied
	 */
	public static boolean occupiedPosition(char[] board) {
		for (int i = 0; i < board.length; i++) {
			if (board[i] == ' ') {
				return false;
			}
		}
		return true;
	}

	public static void myTurn(char[] board) {
		ArrayList<Integer> place = new ArrayList<Integer>();
		for (int i = 0; i < 9; i++) {
			if (board[i] == ' ') {
				place.add(i);
			}
		}
		System.out.println("place you can enter: ");
		for (Integer pos : place) {
			System.out.print(pos + " ");
		}
		System.out.println();
		System.out.println("enter your position to add 'X' :");
		int position = Utility.readInteger();

		if (board[position] == ' ' && board[position] != 'X') {
			board[position] = 'X';
			if (checkForWin(board)) {
				printBoard(board);
				System.out.println("Hurray!! You Win.....!!!");
				System.exit(0);

			} else if (occupiedPosition(board)) {
				System.out.println("Match Draw....");
			} else {
				printBoard(board);
				System.out.println("Computer's turn");
				computerTurn(board);

			}

		} else {
			System.out.println("Position already occupied!!");
			myTurn(board);
		}

	}

	public static void computerTurn(char[] board) {

		Random rand = new Random();
		int position = rand.nextInt(8);

		if (board[position] == ' ' && board[position] != 'O') {
			board[position] = 'O';

			if (checkForWin(board)) {
				System.out.println(" Computer Win.....!!!");
				printBoard(board);
				return;
			} else if (occupiedPosition(board)) {
				System.out.println("Match Draw....");
			} else {
				printBoard(board);
				System.out.println("YOUR turn");
				myTurn(board);
			}

		} else {

			computerTurn(board);
		}

	}
	// _______________________________________________________________________________________________________________

	/*
	 * binarySearch method to search an element in an given array
	 */

	public static void binarySearchForInteger(Integer a[], int start, int end, int search) {
		if (end >= start) {
			int mid = start + (end - start) / 2;

			if (a[mid] == search) {
				System.out.println(search + " is present");
				return;
			}

			if (a[mid] > search) {
				binarySearchForInteger(a, start, mid - 1, search);
			} else {
				binarySearchForInteger(a, mid + 1, end, search);
			}
		}

		else {
			System.out.println(search + " is not present in the given array");
		}
		return;
	}

	// _______________________________________________________________________________________________________________
	/*
	 * binarySearch method for String array
	 */
	public static int binarySearchStringArray(String[] array, String word) {

		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		int first = 0;
		int last = array.length - 1;
		int mid = 0;
		while (first <= last) {
			mid = (first + last) / 2;
			if (word.compareTo(array[mid]) > 0) {
				first = mid + 1;
			} else if (word.compareTo(array[mid]) < 0) {
				last = mid - 1;
			} else {
				System.out.println("<" + word + ">" + " is found at location " + (mid + 1));
				return mid;
			}
			if (first > last) {
				System.out.println(word + "is not found.\n");
			}
		}
		return mid;
	}
	// _______________________________________________________________________________________________________________________________________________
	/*
	 * binarySearch method for String
	 */

	public static void binarySearchForString(char[] a, int start, int end, char search) {

		if (end >= start) {
			int mid = start + (end - start) / 2;

			if (a[mid] == search) {
				System.out.println(search + " is present");
				return;
			}

			if (a[mid] > search) {
				binarySearchForString(a, start, mid - 1, search);
			} else {
				binarySearchForString(a, mid + 1, end, search);
			}
		}

		else {
			System.out.println(search + " is not present");
		}
		return;
	}

	// __________________________________________________________________________________________________________
	/*
	 * binarySearch method for generic
	 */
	public static <T extends Comparable<T>> void binarySearch(T arr[], int first, int last, T key) {
		Arrays.sort(arr);
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid].compareTo(key) < 0) {
				first = mid + 1;
			} else if (arr[mid].compareTo(key) == 0) {
				System.out.println("element is found ");
				break;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("Elements is not found");
		}
	}
	// ___________________________________________________________________________________________________________
	/*
	 * bubbleSortForInt method to sort integers of an integer array
	 */

	public static Integer[] bubbleSortForInt(Integer a[]) {

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					// swap temp and a[i]
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

	// ___________________________________________________________________________________________________________

	/*
	 * bubbleSortForString method to sort Strings
	 */

	public static String bubbleSortForString(String a) {
		String str = "";
		char ch[] = a.toCharArray();
		for (int i = 0; i < ch.length - 1; i++) {
			for (int j = 0; j < ch.length - 1 - i; j++) {
				if (ch[j] > ch[j + 1]) {
					// swap temp and a[i]
					char temp = ch[j];
					ch[j] = ch[j + 1];
					ch[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < ch.length; i++) {
			str += ch[i];
		}
		return str;
	}
	// ____________________________________________________________________________________________________________________________________________
	/*
	 * bubbleSortGeneric method to sort arrays
	 */

	public static <T extends Comparable<T>> void bubbleSortGeneric(T[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].compareTo(a[j]) > 0) {
					// swap temp and a[i]
					T temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	// _______________________________________________________________________________________________________________________________________________

	/*
	 * insertionSortForInt method to sort integers of an integer array
	 */

	public static Integer[] insertionSortForInt(Integer a[]) {

		for (int i = 1; i < a.length; i++) {
			int temp;
			int key = a[i];
			for (int j = i - 1; j >= 0; j--) {
				if (key < a[j]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;
	}

	// ___________________________________________________________________________________________________________

	/*
	 * insertionSortForString method to sort strings
	 */

	public static String insertionSortForString(String str) {
		String out = "";
		char a[] = str.toCharArray();

		for (int i = 1; i < a.length; i++) {
			char temp = a[i];
			char key = a[i];
			for (int j = i - 1; j >= 0; j--) {
				if (key < a[j]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			out += a[i];
		}
		return out;
	}

	// ______________________________________________________________________________________________________________________________________________

	/*
	 * insertionSortGeneric method to sort arrays
	 */
	public static <T extends Comparable<T>> T[] insertionSortGeneric(T[] a) {
		for (int i = 1; i < a.length; i++) {
			T temp;
			T key = a[i];
			for (int j = i - 1; j >= 0; j--) {
				if (key.compareTo(a[j]) < 0) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;
	}

	// _________________________________________________________________________________________________________________
	/*
	 * mergeSort method to sort arrays
	 */

	public static Comparable[] mergeSort(Comparable[] a) {
		// If a is empty; no need to do anything
		if (a.length <= 1) {
			return a;
		}

		// Split the array in half in two parts
		Comparable[] first = new Comparable[a.length / 2];
		Comparable[] second = new Comparable[a.length - first.length];
		System.arraycopy(a, 0, first, 0, first.length);
		System.arraycopy(a, first.length, second, 0, second.length);

		// Sort each half recursively
		mergeSort(first);
		mergeSort(second);

		// Merge both halves together, overwriting to original array
		merge(first, second, a);
		return a;
	}

	private static void merge(Comparable[] first, Comparable[] second, Comparable[] result) {
		// Index Position in first array - starting with first element
		int iFirst = 0;

		// Index Position in second array - starting with first element
		int iSecond = 0;

		// Index Position in merged array - starting with first position
		int iMerged = 0;

		while (iFirst < first.length && iSecond < second.length) {
			if (first[iFirst].compareTo(second[iSecond]) < 0) {
				result[iMerged] = first[iFirst];
				iFirst++;
			} else {
				result[iMerged] = second[iSecond];
				iSecond++;
			}
			iMerged++;
		}
	
		System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
		System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);
	}

	// ____________________________________________________________________________________________________________
	/*
	 * toRemoveSpace method to remove space from a string
	 */
	public static String toRemoveSpace(String str) {
		String s = "";
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ')
				s += ch[i];
		}
		return s;
	}

	// ____________________________________________________________________________________________________________

	/*
	 * convertLowerCase method to make a string in lower case
	 */
	public static String convertLowerCase(String str) {
		String s = "";
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 65 && ch[i] <= 90) {
				s += (char) (ch[i] + 32);
			} else {
				s += ch[i];
			}
		}
		return s;
	}

	// _____________________________________________________________________________________________________-

	/*
	 * checkAnagram method to check anagram of two strings
	 */
	public static boolean checkAnagram(String str1, String str2) {
		String temp1 = str1;
		String temp2 = str2;
		str1 = toRemoveSpace(str1);
		str1 = convertLowerCase(str1);
		str1 = bubbleSortForString(str1);

		str2 = toRemoveSpace(str2);
		str2 = convertLowerCase(str2);
		str2 = bubbleSortForString(str2);

		if (str1.equals(str2)) {
			//System.out.println(temp1 + " & " + temp2 + " are anagrams");
			return true;
		} else {
			//System.out.println(temp1 + " & " + temp2 + " are not anagrams");
			return false;
		}
	}

	// ___________________________________________________________________________________________________________

	/*
	 * primeCheckerRange method to check prime no of a given range
	 */
	public static void findPrimeNumbers(int start, int end) {
		System.out.println("Prime numbers from " + start + " to " + end + ":");
		for (int i = start; i < end; i++) {
			if (isPrime(i) == true) {
				System.out.print(i + " ");
			}
		}

	}
	// __________________________________________________________________________________________________________________

	/*
	 * isPrime method to check a no is prime or not
	 */
	public static boolean isPrime(int num) {
		if (num == 0 || num == 1)
			return false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}

		}
		return true;
	}

	// _____________________________________________________________________________________________________________

	/*
	 * isPalindrome method to check a no palindrome or not
	 */
	public static boolean isPalindrome(int num) {
		int sum = 0;
		int temp = num;
		while (num > 0) {
			int rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;
		}
		if (sum == temp) {
			return true;
		} else {
			return false;
		}
	}

	// ______________________________________________________________________________________________________________

	/*
	 * primePalindromeChecker method to check a no prime+palindrome or not
	 */
	public void primePalindromeChecker(int start, int end) {

		for (int i = start; i < end; i++) {
			if (Utility.isPrime(i) == true && Utility.isPalindrome(i) == true) {
				System.out.print(i + "  ");
			}
		}
	}

	/*
	 * tempConversion method to convert temperature to °C to °F or viceversa
	 */
	public static void tempConversionCelToFahr() {
		System.out.println("Enter temperature in Celsious:");
		int c = Utility.readInteger();
		int f = ((c * 9) / 5) + 32;
		System.out.println("temperature in fahrenheit:" + f);
	}

	public static void tempConversionFahrenToCel() {
		System.out.println("Enter temperature in fahrenheit:");
		int f = Utility.readInteger();
		int c = (f - 32) * 5 / 9;
		System.out.println("temperature in celsious:" + c);
	}

	// ___________________________________________________________________________________________________________

	/*
	 * findSquareRoot method to get square root of a given no.
	 */
	public static void findSquareRoot(int c) {
		double t;
		t = c;
		double epsilon = Math.pow(Math.E, -15);
		while (Math.abs(t - (c / t)) > epsilon * t) {
			t = ((c / t) + t) / 2;
		}
		System.out.println("Square root of " + c + " is :" + t);
	}

	// _____________________________________________________________________________________________________________

	/*
	 * guessNumber method to play guessing game based on binary search
	 */

	public static void guessNumber(int[] a, int start, int end) {

		int mid = start + (end - start) / 2;
		System.out.println("Is your number " + mid);
		System.out.println("Press y for yes & n for no");
		char ans = Utility.readCharacter();
		switch (ans) {
		case 'y':
		case 'Y':
			System.out.println("Your number is " + mid);
			break;
		case 'n':
		case 'N':
			System.out.println("is your number more than " + mid);
			System.out.println("Press y for yes & n for no");
			char query = Utility.readCharacter();
			switch (query) {
			case 'y':
			case 'Y':
				guessNumber(a, mid + 1, end);
				break;
			case 'n':
			case 'N':
				guessNumber(a, start, mid - 1);
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
	}

	// _____________________________________________________________________________________________________________

	/*
	 * guessNumber method to play guessing game based on binary search
	 */

	public static void changeGenerator(int num, int[] denomination) {

		for (int i = 0; i < denomination.length - 1; i++) {
			if (num >= denomination[i]) {

				int count = num / denomination[i];
				num = num - (denomination[0] * count);
				System.out.println(count + " nos of " + denomination[i] + " notes");

			}
			if (num < denomination[i] && num >= denomination[i + 1]) {
				int count = num / denomination[i + 1];
				num = num - (denomination[i + 1] * count);
				System.out.println(count + " nos of " + denomination[i + 1] + " notes");

			}
		}
	}

	// __________________________________________________________________________________________________________

	/*
	 * toBin method to convert decimal to binary
	 */

	public static String toBin(int num) {

		String out = "";
		String res = "";
		while (num > 0) {
			int rem = num % 2;
			num = num / 2;
			out = rem + out;

		}
		res = out;
		for (int i = 0; i < (8 - out.length()); i++) {
			res = 0 + res;
		}
		return res;
	}

	// ___________________________________________________________________________________________________________

	/*
	 * binTodec method to convert binary to decimal
	 */
	public static int binToDec(String bin) {
		int num = Integer.parseInt(bin);
		int sum = 0, count = 0;
		while (num > 0) {
			int rem = num % 10;
			num /= 10;
			sum = sum + rem * (int) Math.pow(2, count++);
		}
		return sum;

	}
	// ___________________________________________________________________________________________________________
	/*
	 * swapNibbles method to swap nibbles
	 */

	public static String swapNibbles(String str) {
		String out1 = "", out2 = "";

		for (int i = 0; i < str.length() / 2; i++) {
			out1 = out1 + str.charAt(i);
		}
		for (int i = str.length() / 2; i < str.length(); i++) {
			out2 = out2 + str.charAt(i);
		}
		return (out2 + out1);
	}
	// ______________________________________________________________________________________________________________________________

	/*
	 * finding day for a given date
	 */
	public static void dayOfWeek(int d, int m, int y) {
		if(((m == 4 || m == 6 || m == 9 || m == 11) && (d >30)) 
				|| (d>31)
				|| (m==2 && y % 100 == 0 && y % 400 != 0 && d > 28) 
				|| (m==2 && y % 400 == 0 && d > 29)
				|| (m==2 && y % 100 != 0 && y % 4 != 0 && d > 28) 
				|| (m==2 && y % 100 != 0 && y % 4 == 0 && d > 29))
		{
			System.err.println("Invalid date");
		} 
        else {
            System.out.println("The day is "+ getDay(d,m,y));
        }		

	}

	private static String getDay(int d, int m, int y) {
		String[] day = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };
		String out = "";
		int y0 = y - (14 - m) / 12;
		int x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + (31 * m0) / 12) % 7;
		for (int i = 0; i < day.length; i++) {
			if (d0 == i)
				out = day[i];
		}
		return out;
	}

}
