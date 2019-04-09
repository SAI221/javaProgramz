package com.bridgelabz.datastructures;

import java.util.List;

import com.bridgelabz.javaprgms.util.AlgorithmsUtil;
import com.bridgelabz.javaprgms.util.StackLinkedList;

public class AnagramStack {

	public static void main(String[] args) {
		List<Integer> primes = AlgorithmsUtil.primeNum();
		List<Integer> anagrams = AlgorithmsUtil.primeAnagrams(primes);
		System.out.println(anagrams.size());
		anagramSorted(anagrams);
		StackLinkedList<Integer> anagramsStack = new StackLinkedList<Integer>();

		for (Integer e : anagrams) {

			try {
				anagramsStack.push(e);
				System.out.print(e + " ");
			} catch (Exception e1) {

				e1.printStackTrace();
			}
		}

	}

	public static <T> void anagramSorted(List<Integer> anagrams) {
		for (int i = 0; i < anagrams.size(); i++) {
			for (int j = 1; j < anagrams.size(); j++) {
				if (anagrams.get(i) == anagrams.get(j)) {
					anagrams.remove(j);
				}
			}
		}
		System.out.println(anagrams.size());

	}
}
