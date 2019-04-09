package com.bridgelabz.javaprgms.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AlgorithmsUtil {

	public static Scanner scan = new Scanner(System.in);

	public static int integer() {
		int n = scan.nextInt();
		return n;
	}

	public static String string() {
		String s = scan.next();
		return s;
	}

	public static String string1() {
		String s1 = scan.nextLine();
		return s1;
	}

	public static double idouble() {
		double d = scan.nextDouble();
		return d;
	}

	public static float ifloat() {
		float f = scan.nextFloat();
		return f;
	}

	public static long llong() {
		long l = scan.nextLong();
		return l;
	}

	public static File getFile() {
		File file = new File(scan.nextLine());
		return file;
	}

	// INPUT AN ARRAY
	public static int[] arr() {
		System.out.println("enter no. elements");
		int n = AlgorithmsUtil.integer();
		System.out.println("enter elements");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = AlgorithmsUtil.integer();

		}
		for (int e : arr) {
			System.out.print(e + " ");
		}
		System.out.println();
		return arr;
	}

	// STRING ARRAY
	public static String[] strArray(int n) {
		String[] strArray = new String[n];
		System.out.println("enter elements");
		for (int i = 0; i < n; i++) {
			strArray[i] = AlgorithmsUtil.string();
		}
		return strArray;
	}

	// INTEGER ARRAY
	public static Integer[] intArray1(int n) {
		Integer[] array = new Integer[n];
		System.out.println("enter elements");
		for (int i = 0; i < n; i++) {
			array[i] = AlgorithmsUtil.integer();
		}
		return array;
	}

	// ANAGRAM
	public static boolean anagram(String s1, String s2) {
		char[] firstArray = s1.toCharArray();
		// char[] firstArray=removeSpaces(c1);
		char[] secondArray = s2.toCharArray();
		// char[] secondArray=removeSpaces(c2);
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		if (firstArray.length != secondArray.length)
			return false;
		for (int i = 0; i < firstArray.length; i++)
			if (firstArray[i] == secondArray[i])
				return true;
		return false;

	}

	// PRIME NUMBERS

	public static ArrayList<Integer> primeNum() {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for (int i = 0; i < 1000; i++) {
			int c = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					c = c + 1;

				}
			}
			if (c == 2)

			{
				ar.add(i);
			}

		}
		return ar;
	}

	// CHECKING NUMBERS FOR PALINDROME AND ANAGRAM

	public static ArrayList<Integer> palindrome(List<Integer> primenumbers) {
		ArrayList<Integer> palindromes = new ArrayList<Integer>();
		// System.out.print("Palindrome numbers from 1 to N:");
		for (int i = 0; i < primenumbers.size(); i++) {
			int rev = 0;
			int n = primenumbers.get(i);
			int m = primenumbers.get(i);
			while (n > 0) {
				int b = n % 10;
				rev = rev * 10 + b;
				n = n / 10;

			}
			if (rev == m) {
				palindromes.add(rev);
				System.out.print(rev + " ,");
			}

		}
		return palindromes;
	}

	public static List<Integer> primeAnagrams(List<Integer> primenumbers) {
		ArrayList<Integer> anagrams = new ArrayList<Integer>();
		for (int i = 0; i < primenumbers.size(); i++) {
			for (int j = i + 1; j < primenumbers.size(); j++) {
				if (AlgorithmsUtil.isAnagram(primenumbers.get(i), primenumbers.get(j))) {
					anagrams.add(primenumbers.get(i));
					anagrams.add(primenumbers.get(j));
					// System.out.println(primenumbers.get(i) + " " + primenumbers.get(j));
				}
			}
		}
		return anagrams;
	}

	// CHECKING ANAGRAMS OF NUMBERS
	public static boolean isAnagram(int n1, int n2) {
		int[] num1 = intArray(n1);
		int[] num2 = intArray(n2);
		if (num1.length != num2.length)
			return false;
		else {
			for (int i = 0; i < num1.length; i++) {
				if (num1[i] != num2[i])
					return false;
			}
		}

		return true;

	}

	// NUMBER ARRAY
	public static int[] intArray(int n) {
		int[] count = new int[10];
		int temp = n;
		while (temp != 0) {
			int r = temp % 10;
			count[r]++;
			temp = temp / 10;
		}

		return count;

	}

	// BUBBLE SORT

	public static void bubbleSort(List<Integer> list, int n) {
		int i, temp;

		for (i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - i - 1; j++) {

				if (list.get(j) > list.get(j + 1)) {
					temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);

				}
			}
		}
		for (int k : list) {
			System.out.println(k + " ");
		}

	}

	// INSERTION SORT

	public static void insertionsort(int[] a) {
		int i = 0, j = 0, w;
		int temp;
		for (i = 0; i < a.length; i++) {
			for (j = 0; j <= i; j++) {
				if (a[j] > a[i]) {
					temp = a[j];
					a[j] = a[i];
					for (w = i; w > j + 1; w--) {
						a[w] = a[w - 1];
					}
					a[w] = temp;
				}
			}
		}
	}

	// INSERTION SORT FOR STRINGS
	public static void insertSort(List<String> array, int n) {

		int i = 0, j = 0, w;
		String temp;
		for (i = 0; i < array.size(); i++) {
			for (j = 0; j <= i; j++) {
				if (array.get(j).compareTo(array.get(i)) > 0) {
					temp = array.get(j);
					array.set(j, array.get(i));
					for (w = i; w > j + 1; w--) {
						array.set(w, array.get(w - 1));
					}
					array.set(w, temp);
				}
			}
		}

		for (String k : array)
			System.out.print(k + " ");
		System.out.println(" ");
	}

	// MERGE SORT

	public static void merge(String[] names) {
		if (names.length >= 2) {
			String[] left = new String[names.length / 2];
			String[] right = new String[names.length - (names.length / 2)];
			for (int i = 0; i < left.length; i++) {
				left[i] = names[i];

			}
			for (int j = 0; j < right.length; j++) {
				right[j] = names[j + (names.length / 2)];
			}
			merge(left);
			merge(right);
			mergeSort(names, left, right);
		}
	}

	public static void mergeSort(String[] names, String[] left, String[] right) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < names.length; i++) {
			if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
				names[i] = left[a];
				a++;
			} else {
				names[i] = right[b];
				b++;
			}
		}
	}

	// BINARY SEARCH

	public static int binarySearch(String[] s, String word) {
		int l = s.length - 1;
		int nl = 0;
		while (nl <= l) {
			int m = (nl + l) / 2;
			int mid = word.compareTo(s[m]);
			if (mid == 0)
				return m;
			if (mid > 0)
				nl = m + 1;
			else
				l = m - 1;
		}

		return -1;
	}

	// TEMPERATURE CONVERSION

	public static void conversion(int ch) {
		double f, c;
		switch (ch) {
		case 1:
			System.out.println("enter fahrenheit temperature");
			f = AlgorithmsUtil.idouble();
			c = (f - 32) * 5 / 9;
			System.out.println("celsius:" + c + "C");
			break;
		case 2:
			System.out.println("enter celsuis temperature");
			c = AlgorithmsUtil.idouble();
			f = (c * 9 / 5) + 32;
			System.out.println("fahrenheit:" + f + "F");
		}
	}

	// VENDING MACHINE

	public static void vending(int[] change, int money) {
		for (int i = change.length - 1; i >= 0; i--) {
			int count = 0;
			if (money == 0)
				return;
			else {
				if (money >= change[i]) {
					count = money / change[i];
					System.out.println(change[i] + " notes:" + count);
					money = money - (count * change[i]);
				}
			}

		}

	}

	// BINARY CONVERSION

	public static String binaryConvers(int number) {
		String result = "";
		for (int i = 2; i < number; i++) {
			while (number > 0) {
				result = number % 2 + result;
				number = number / 2;
			}
		}
		return result;
	}

	// UTILITY CLASS
	// BINARY SEARCH
	public static <T extends Comparable<T>> T[] binSearch(T[] array, T search) {
		Arrays.sort(array);
		int length = array.length - 1;
		int newlength = 0;

		while (newlength <= length) {
			int mid = (length + newlength) / 2;
			if (array[mid].equals(search)) {
				System.out.println(search + "found in" + mid);
				break;
			} else if (search.compareTo(array[mid]) > 0) {
				newlength = mid + 1;
			} else
				length = mid - 1;

		}
		if (newlength > length) {
			System.out.println("element is not present");
		}

		return array;
	}

	// INSERTION SORT GENERIC
	public static <T extends Comparable<T>> T[] insertSort(T[] array) {
		int i = 0, j = 0, w;
		T temp;
		for (i = 0; i < array.length; i++) {
			for (j = 0; j <= i; j++) {
				if (array[j].compareTo(array[i]) > 0) {
					temp = array[j];
					array[j] = array[i];
					for (w = i; w > j + 1; w--) {
						array[w] = array[w - 1];
					}
					array[w] = temp;
				}
			}
		}

		return array;
	}
	// BUBBLE SORT GENERIC

	public static <T extends Comparable<T>> T[] bubbleSort(T[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					T t = array[j];
					array[j] = array[j + 1];
					array[j + 1] = t;

				}
			}
		}

		return array;
	}

	// MONTHLY PAYMENT
	public static double monthlyPayment(double principle, double rate, double year) {
		double n = 12 * year;
		double r = rate / (12 * 100);
		double payment = (principle * r) / (1 - (Math.pow(1 + r, -n)));
		return payment;
	}

	// NUMBER GUESSING
	public static int find(int n) {

		int low = 0, high = n, mid;
		while (low != high) {
			mid = (low + high) / 2;
			System.out.println("enter 1 if no is between " + low + " - " + mid + "\nEnter 2 if no is between "
					+ (mid + 1) + " - " + high);

			int c = AlgorithmsUtil.integer();

			if (c == 1)
				high = mid;
			else
				low = mid + 1;
		}
		return low;
	}

	// SQUARE ROOT
	public static double sqarert(double number) {
		double t = number;
		double epsilon = 1e-15;
		while (Math.abs(t - number / t) > epsilon * t) {
			t = ((number / t) + t) / 2;
		}
		return t;
	}
	// SWAP NIBBLES AND CHECK FOR NUMBER IS POWER OF 2

	/*
	 * // TOTAL PROGRAMS public static void total(String conv, ArrayList<String>
	 * strings) { divideNibbles(conv, strings); int result = (int)
	 * swapping(strings); System.out.println(decimal(result));
	 * System.out.println(isPowerOfTwo(decimal(result))); }
	 */

	// converting binary to decimal
	public static int decimal(long result) {
		int rs = 0;
		int count = 0;
		while (result > 0) {
			double r = result % 10;
			rs = (int) (rs + r * Math.pow(2, count));
			count++;
			result = result / 10;

		}

		return rs;
	}

	// to swap nibbles
	public static long swapping(ArrayList<String> strings) {
		String rev = "";
		for (int i = 0; i < strings.size(); i++) {
			rev = strings.get(i) + rev;
		}

		long result = Long.parseLong(rev);
		// System.out.println(result);
		return result;

	}

	// dividing nibbles
	public static void divideNibbles(String conv, ArrayList<String> strings) {
		int count = 0;
		while (count < conv.length()) {
			strings.add(conv.substring(count, Math.min(count + 4, conv.length())));
			count += 4;
		}
		strings.forEach(System.out::println);
	}

	// check power of 2
	public static boolean isPowerOfTwo(long l) {
		if (l == 0)
			return false;

		while (l != 1) {
			if (l % 2 != 0)
				return false;
			l = l / 2;
		}
		return true;

	}

	// to get the day
	public static void getDay(int year, int month, int date) {
		if (month > 0 && month < 12) {
			if (date > 0 && date < 31) {

				int y0 = year - (14 - month) / 12;
				int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
				int m0 = month + 12 * ((14 - month) / 12) - 2;
				int d0 = (date + x + 31 * m0 / 12) % 7;
				if (d0 >= 0 && d0 < 7) {
					int day = d0;
					switch (day) {
					case 0:
						System.out.println("sunday");
						break;
					case 1:
						System.out.println("monday");
						break;
					case 2:
						System.out.println("tuesday");
						break;
					case 3:
						System.out.println("wednesday");
						break;
					case 4:
						System.out.println("thursday");
						break;
					case 5:
						System.out.println("friday");
						break;
					case 6:
						System.out.println("saturday");
						break;
					}
				}
			}
		} else
			System.out.println("not valid ");
	}

}
