/*Leap Year
I/P -> Year, ensure it is a 4 digit number.
Logic -> Determine if it is a Leap Year.
O/P -> Print the year is a Leap Year or not.*/
package com.bridgelabz.functionalPrgms;

import com.bridgelabz.javaprgms.util.FunctionalUtil;

public class LeapYear {
	public static void main(String[] args) {
		// INPUT
		System.out.println("Enter year");
		int y = FunctionalUtil.input();
		// CALLING METHOD
		int result = FunctionalUtil.leapYear(y);
		// OUTPUT
		if (result < 0) {
			System.out.println("invalid");
		} else if (result == 0) {
			System.out.println("Not a leap year");
		} else
			System.out.println(y + " is a leap year");
	}
}