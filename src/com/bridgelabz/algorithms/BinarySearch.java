package com.bridgelabz.algorithms;

import java.util.Arrays;

import com.bridgelabz.javaprgms.util.AlgorithmsUtil;

public class BinarySearch {

	public static void main(String[] args) {
		System.out.println("enter no of elements");
		int n = AlgorithmsUtil.integer();

		String[] s = new String[n];
		System.out.println("enter elements");
		for (int i = 0; i < n; i++) {
			s[i] = AlgorithmsUtil.string();

		}
		System.out.println("word to search");
		String search = AlgorithmsUtil.string();
		Arrays.sort(s);
		for (String e : s) {
			System.out.println(e);
		}
		int x = AlgorithmsUtil.binarySearch(s, search);

		if (x == -1) {

			System.out.println("not found");
		} else
			System.out.println("found " + search + " in " + x);
	}

}
