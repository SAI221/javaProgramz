package com.bridgelabz.algorithms;

import com.bridgelabz.javaprgms.util.AlgorithmsUtil;

public class Anagram {

	public static void main(String[] args) {
		System.out.println("First String");
		String string1 = AlgorithmsUtil.string1();
		System.out.println("Secong String");
		String string2 = AlgorithmsUtil.string1();

		boolean isAnagram = AlgorithmsUtil.anagram(string1, string2);
		if (isAnagram) {
			System.out.println("anagrams");
		} else
			System.out.println("not");
	}

}
