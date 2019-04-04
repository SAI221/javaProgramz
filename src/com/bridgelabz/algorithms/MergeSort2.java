package com.bridgelabz.algorithms;

import com.bridgelabz.javaprgms.util.AlgorithmsUtil;

public class MergeSort2 {

	public static void main(String[] args) {
System.out.println("enter no. of elements");
		int n = AlgorithmsUtil.integer();
		String[] array = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("enter elements");
			array[i] = AlgorithmsUtil.string();
		}
		AlgorithmsUtil.merge(array);
		for (String sort : array) {
			System.out.println(sort);
		}
	}

}
