package com.bridgelabz.datastructures;

import com.bridgelabz.javaprgms.util.DataStructuresUtil;
import com.bridgelabz.javaprgms.util.QueueLinkedList;

public class CalenderQueue {
	/*
	 * The main function is to take the input from the user and printing the
	 * calendar by using queue
	 */
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (month == 2 && DataStructuresUtil.isLeapyear(year)) {
			days[month] = 29;
		}
		System.out.println("\t " + months[month] + " " + year);
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		int day = DataStructuresUtil.day(month, 1, year);
		QueueLinkedList<QueueLinkedList<Integer>> queue = new QueueLinkedList<QueueLinkedList<Integer>>();
		QueueLinkedList<Integer> refqueue = new QueueLinkedList<Integer>();

		for (int i = 1; i <= days[month]; i++) {
			refqueue.insert(i);
			if (((i + day) % 7 == 0 || i == days[month])) {
				queue.insert(refqueue);
				refqueue = new QueueLinkedList<Integer>();
				continue;
			}
		}
		for (int i = 0; i < day; i++)
			System.out.print("   ");
		for (int i = 0; i <= queue.getSize(); i++) {
			QueueLinkedList<Integer> week = queue.remove();
			for (int j = 0; j < week.getSize(); j++) {
				System.out.printf("%4d", week.remove());
			}
			System.out.println();
		}

	}

}