package com.bridgelabz.algorithms;

import com.bridgelabz.javaprgms.util.AlgorithmsUtil;
import com.bridgelabz.javaprgms.util.FunctionalUtil;

public class UtilityClass {

	public static void main(String[] args) {
		System.out.println("enter 1:Binary Search 2:Insertion Sort 3:Bubble Sort");
		int type = com.bridgelabz.javaprgms.util.AlgorithmsUtil.integer();
		switch (type) {
		case 1: {
			System.out.println("enter 1 for integer and 2 for string");
			int select = com.bridgelabz.javaprgms.util.AlgorithmsUtil.integer();
			long startTime = System.nanoTime();
			System.out.println("enter number of elements");
			int n = AlgorithmsUtil.integer();
			switch (select) {
			case 1:
				Integer[] array = com.bridgelabz.javaprgms.util.AlgorithmsUtil.intArray1(n);
				System.out.println("enter to search");
				int search = AlgorithmsUtil.integer();
				AlgorithmsUtil.binSearch(array, search);
				break;
			case 2:
				String[] strArray = AlgorithmsUtil.strArray(n);
				System.out.println("enter to search");
				String strSearch = AlgorithmsUtil.string();
				AlgorithmsUtil.binSearch(strArray, strSearch);
				break;
			default:
				System.out.println("invalid input");
			}
			long endTime = System.nanoTime();
			long elapsedTime = FunctionalUtil.stopWatch(startTime, endTime);
			System.out.println("elapsed time for binary search is" + elapsedTime);
			break;
		}
		case 2: {
			System.out.println("enter 1 for integer and 2 for string");
			int select = AlgorithmsUtil.integer();
			long startTime = System.nanoTime();
			System.out.println("enter number of elements");
			int n = AlgorithmsUtil.integer();
			switch (select) {
			case 1:
				Integer[] array = AlgorithmsUtil.intArray1(n);
				System.out.println("sorted array");
				Integer[] sortArray = AlgorithmsUtil.insertSort(array);
				for (Integer elements : sortArray) {
					System.out.println(elements);
				}
				break;
			case 2:
				String[] strArray = AlgorithmsUtil.strArray(n);
				System.out.println("sorted array");
				String[] sortedArray = AlgorithmsUtil.insertSort(strArray);
				for (String elements : sortedArray) {
					System.out.println(elements);
				}
				break;
			default:
				System.out.println("invalid input");
			}
			long endTime = System.nanoTime();
			long elapsedTime = FunctionalUtil.stopWatch(startTime, endTime);
			System.out.println("elapsed time for insertion sort is" + elapsedTime);
			break;
		}
		case 3: {
			System.out.println("enter 1 for integer and 2 for string");
			int select = AlgorithmsUtil.integer();
			long startTime = System.nanoTime();
			System.out.println("enter number of elements");
			int n = AlgorithmsUtil.integer();
			switch (select) {
			case 1:
				Integer[] array = AlgorithmsUtil.intArray1(n);
				System.out.println("sorted array");
				Integer[] sortArray = AlgorithmsUtil.bubbleSort(array);
				for (Integer elements : sortArray) {
					System.out.println(elements);
				}
				break;
			case 2:
				String[] strArray = AlgorithmsUtil.strArray(n);
				System.out.println("sorted array");
				String[] sortedArray = AlgorithmsUtil.bubbleSort(strArray);
				for (String elements : sortedArray) {
					System.out.println(elements);
				}
				break;
			default:
				System.out.println("invalid input");
			}
			long endTime = System.nanoTime();
			long elapsedTime = FunctionalUtil.stopWatch(startTime, endTime);
			System.out.println("elapsed time for bubble sort is" + elapsedTime);
			break;
		}
		default:
			System.out.println("invalid input");
		}

	}

}
