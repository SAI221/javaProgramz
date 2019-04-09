package com.bridgelabz.javaprgms.util;

import java.io.PrintWriter;
import java.util.Scanner;

public class FunctionalUtil {
	private static Scanner scan = new Scanner(System.in);

	public static int input() {
		int n = scan.nextInt();
		return n;
	}

	public static String stng() {
		String s = scan.next();
		return s;
	}

	public static double db() {
		double d = scan.nextDouble();
		return d;
	}

	public static float flt() {
		float f = scan.nextFloat();
		return f;
	}

	// 1.REPLACE\\****************************************************
	public static String replace(String s, String pn, String msg) {

		String newMsg = msg.replace(s, pn);
		return newMsg;
	}

	// 3. LEAPYEAR****************************************************
	public static int leapYear(int y) {
		if (y >= 1000) {
			if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
				return 1;
			} else
				return 0;

		} else
			return -1;
	}

	// 4. POWER OF TWO ***********************************************
	public static void power(int n) {
		if (n < 31) {
			int power = 1;
			for (int i = 1; i <= n; i++) {
				power = power * 2;
				System.out.println("2^" + i + "-->" + power);

			}
		} else
			System.out.println("can't be taken");
	}

	// 5. HORMONIC***********************************************************
	public static double hormonic(int n) {
		if (n > 0) {
			double sum = 0.0;
			int i = 1;
			while (i <= n) {
				sum = sum + (double) 1 / i;
				i++;
			}
			return sum;
		}
		return 0;
	}

	// 6. PRIME FACTORISATION*****************************************
	public static void factors(int n) {
		System.out.println("prime factors are");
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				prime(i);
			}
		}
	}

//checking whether the factor is prime are not
	private static void prime(int i) {
		int c = 0;
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				c++;
				break;
			}
		}
		if (c == 0) {
			System.out.println(i);
		}
	}

	// 2. COIN GAME******************************************************
	public static void coinGame(int n) {
		int count = 1;
		double rs;
		int heads = 0;
		int tails = 0;
		while (count <= n) {
			rs = Math.random();// taking random number between 0-1
			if (rs <= .5) {
				// if it is less than 0.5 takes as head other wise takes as tail
				heads++;
			} else
				tails++;
			count++;
		}
		System.out.println("number of tails you got" + tails);
		System.out.println("number of heads you got" + heads);
//calculating percentage of heads and tails
		int headper = heads * 100 / n;
		System.out.println("head percentage=" + headper);
		int tailper = tails * 100 / n;
		System.out.println("tail percentage=" + tailper);

	}

	// 7. GAMBLING****************************************************

	public static void gambling(int mny, int bet, int goal) {
		int c = 0;
		int w = 0;
		int l = 0;
		while (mny != 0 || mny == goal) {
			double rs = Math.random();
			if (rs <= 0.5) {
				mny = mny + bet;
				w++;
			} else {
				mny = mny - bet;
				l++;
			}
			c++;
		}
		System.out.println("no. of wins " + w);
		System.out.println("no. of loss " + l);

		int wp = (w * 100) / c;
		int lp = (l * 100) / c;
		System.out.println("win percentage-->" + wp);
		System.out.println("loss percentage-->" + lp);
	}

	// 9. ARRAY2D*******************************************************
	public static void array2D(int r, int c, int arr[][]) {
		PrintWriter pw = new PrintWriter(System.out, true);
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				pw.print(+arr[i][j] + " ");

			}
			pw.println();
		}

	}

//10. SUM OF THREE IS ZERO**********************************************
	public static void addZero(int n, int arr[]) {

		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					int s = arr[i] + arr[j] + arr[k];
					if (s == 0) {
						System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);
					}
				}
			}
		}

	}

//DISTANCE

	public static double distance(int x, int y) {
		double dist = Math.sqrt(x * x + y * y);
		return dist;
	}

//QUADRATIC

	public static void quadratic(int x, int y, int z) {
		double del = y * y - (4 * x * z);

		double r1 = (-y + Math.sqrt(del)) / (2 * x);
		double r2 = (-y - Math.sqrt(del)) / (2 * x);
		if (del > 0) {
			System.out.println(r1 + "," + r2);

		} else if (del == 0) {
			r1 = (-y / (2 * x));
			r1 = r2;
			System.out.println(r1 + "," + r2);
		} else if (del < 0) {
			System.out.println("no real values");
		}
	}

//WINDCHILL
	public static void wind(double t, double s) {
		// TODO Auto-generated method stub
		double windchill = 0;
		if (t > 50 && s > 120 && s < 3) {
			windchill = 35.74 + (0.6215 * t) - (35.75 * Math.pow(s, 0.16)) + (0.4275 * t * Math.pow(s, 0.16));
			System.out.println(windchill);
		} else {
			System.out.println("not valid");
		}

	}

//STOPWATCH

	static long start = 0;
	static long stop = 0;

	public static void start() {
		start = System.currentTimeMillis();
		System.out.println(start);
	}

	public static void stop() {
		stop = System.currentTimeMillis();
		System.out.println(stop);
	}

	public static long elapse() {
		long diff;
		if (stop == 0) {
			System.out.println(start + "," + stop);
			long now = System.currentTimeMillis();
			System.out.println(now);
			diff = now - start;
		} else {
			System.out.println(stop + "," + start);
			diff = stop - start;
		}
		return diff;
	}

	// CROSSGAME

	public static String board[][] = new String[3][3];
	static String cp = "x";

	public static void changeplayer() {
		// TODO Auto-generated method stub
		if (cp == "x") {
			cp = "o";

		}

		else {

			cp = "x";

		}

	}

	public static boolean isBoardFull() {

		boolean isFull = true;

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (board[i][j] == "-") {

					isFull = false;

				}

			}

		}

		return isFull;

	}

	public static void printBoard() {
		System.out.println("-------------");
		for (int i = 0; i < 3; i++) {

			System.out.print("| ");

			for (int j = 0; j < 3; j++) {

				System.out.print(board[i][j] + " | ");

			}

			System.out.println();

			System.out.println("-------------");

		}

	}

	public static boolean checkForWin() {
		return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
	}

	public static boolean checkRowsForWin() {

		for (int i = 0; i < 3; i++) {

			if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {

				return true;

			}

		}

		return false;
	}

	public static boolean checkColumnsForWin() {

		for (int i = 0; i < 3; i++) {

			if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {

				return true;

			}

		}

		return false;

	}

	public static boolean checkDiagonalsForWin() {

		return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true)
				|| (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));

	}

	public static boolean checkRowCol(String board2, String board3, String board4) {

		return ((board2 != "-" && (board2 == board3) && (board3 == board4)));

	}

	public static boolean placeMark(int i, int j) {
		if ((i >= 0) && (i < 3)) {
			if ((j >= 0) && (j < 3)) {
				if (board[i][j] == "-") {

					board[i][j] = cp;

					return true;

				}
			}
		}
		return false;

	}

	public static long stopWatch(long start, long stop) {
		long elpaseTime = stop - start;
		return elpaseTime;
	}

}
