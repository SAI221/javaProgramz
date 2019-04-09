package com.bridgelabz.datastructures;

import com.bridgelabz.javaprgms.util.AlgorithmsUtil;
import com.bridgelabz.javaprgms.util.DataStructuresUtil;
import com.bridgelabz.javaprgms.util.QueueLinkedList;
import com.bridgelabz.javaprgms.util.StackLinkedList;

public class CalenderStack {

	public static void main(String[] args) {
		System.out.println("enter month");
		int month = AlgorithmsUtil.integer();
		System.out.println("enter year");
		int year = AlgorithmsUtil.integer();
		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (month == 2 && DataStructuresUtil.isLeapyear(year)) {
			days[month] = 29;
		}
		System.out.println("\t " + months[month] + " " + year);
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
		int day = DataStructuresUtil.day(month, 1, year);
		StackLinkedList<QueueLinkedList<Integer>> stack = new StackLinkedList<>();
		QueueLinkedList<Integer> refqueue = new QueueLinkedList<Integer>();

		for (int i = 1; i <= days[month]; i++) {
			refqueue.insert(i);
			if (((i + day) % 7 == 0 || i == days[month])) {
				stack.push(refqueue);
				refqueue = new QueueLinkedList<Integer>();
				continue;
			}
		}

		for (int i = 0; i < day; i++) {

			System.out.print("   ");
		}
		int size = stack.getSize();
		StackLinkedList<QueueLinkedList<Integer>> stackNew = new StackLinkedList<>();

		for (int i = 0; i < size; i++) {
			stackNew.push(stack.pop());
		}

		for (int i = 0; i < size; i++) {
			QueueLinkedList<Integer> week = stackNew.pop();
			for (int j = 0; j < week.getSize(); j++) {
				System.out.printf("%4d", week.remove());
			}
			System.out.println();
		}
	}

}
