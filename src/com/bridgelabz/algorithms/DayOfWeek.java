package com.bridgelabz.algorithms;

import com.bridgelabz.javaprgms.util.AlgorithmsUtil;

public class DayOfWeek {

	public static void main(String[] args) {
		System.out.println("enter year");
		int year = AlgorithmsUtil.integer();
		System.out.println("enter month");
		int month = AlgorithmsUtil.integer();
		System.out.println("enter day");
		int day = AlgorithmsUtil.integer();
		AlgorithmsUtil.getDay(year, month, day);

	}

}
