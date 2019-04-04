package com.bridgelabz.functionalPrgms;

import com.bridgelabz.javaprgms.util.FunctionalUtil;

public class Distance {

	public static void main(String[] args) {
		System.out.println("enter one point");
		int point1=FunctionalUtil.input();
		System.out.println("enter 2nd point");
		int point2=FunctionalUtil.input();
		System.out.println("distance is "+FunctionalUtil.distance(point1, point2));
	}

}
