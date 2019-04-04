package com.bridgelabz.functionalPrgms;

import com.bridgelabz.javaprgms.util.FunctionalUtil;

public class WindChill {

	public static void main(String[] args) {
		System.out.println("enter temperature");
		int temp=FunctionalUtil.input();
		System.out.println("enter speed");
		int speed=FunctionalUtil.input();
		FunctionalUtil.wind(temp, speed);

	}

}
