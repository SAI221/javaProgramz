package com.bridgelabz.algorithms;

import com.bridgelabz.javaprgms.util.AlgorithmsUtil;

public class TemperatureConversion {

	public static void main(String[] args) {
		System.out.println("Enter 1 for fahrenheit and 2 for celsius");
		int select = AlgorithmsUtil.integer();
		AlgorithmsUtil.conversion(select);
	}

	
}
