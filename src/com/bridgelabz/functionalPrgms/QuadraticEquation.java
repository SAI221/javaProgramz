package com.bridgelabz.functionalPrgms;

import com.bridgelabz.javaprgms.util.FunctionalUtil;

public class QuadraticEquation {
	public static void main(String[] args) {
		System.out.println("enter x^2 quotient");
		int a=FunctionalUtil.input();
		System.out.println("enter x quotient");
		int b=FunctionalUtil.input();
		System.out.println("enter constant");
		int c=FunctionalUtil.input();
		FunctionalUtil.quadratic(a, b, c);
	}

}
