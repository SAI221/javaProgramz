package com.bridgelabz.algorithms;

import com.bridgelabz.javaprgms.util.AlgorithmsUtil;

public class MonthlyPayment {

	public static void main(String[] args) {
		System.out.println("enter principle");
		double principle = AlgorithmsUtil.idouble();
		System.out.println("enter rate");
		double rate = AlgorithmsUtil.idouble();
		System.out.println("enter year");
		double year = AlgorithmsUtil.idouble();
		System.out.println(AlgorithmsUtil.monthlyPayment(principle, rate, year));
	}

}
