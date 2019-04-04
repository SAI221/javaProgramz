/*Power of 2 
Desc -> This program takes a command-line argument N and prints a table of the powers of 2 that are less than or equal to 2^N.
I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
Logic -> repeat until i equals N.
O/P -> Print the year is a Leap Year or not.*/

package com.bridgelabz.functionalPrgms;

import com.bridgelabz.javaprgms.util.FunctionalUtil;

public class Power2 {
	public static void main(String[] args) {
		// INPUT
		System.out.println("enter n value");
		int n = FunctionalUtil.input();
//CALLING LOGIC WHICH GIVES OUTPUT
		FunctionalUtil.power(n);
	}

}