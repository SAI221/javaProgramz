package com.bridgelabz.algorithms;

import java.util.List;

import com.bridgelabz.javaprgms.util.AlgorithmsUtil;

public class CheckNumbers {

	public static void main(String[] args) {
		List<Integer> primenumbers = AlgorithmsUtil.primeNum();
		List<Integer> palindromes = AlgorithmsUtil.palindrome(primenumbers);
		List<Integer> anagrams = AlgorithmsUtil.primeAnagrams(primenumbers);
		/*
		 * System.out.println("numbers which are prime anagrams and palindrome"); for
		 * (int i = 0; i < anagrams.size(); i++) { for (int j = 0; j <
		 * palindromes.size(); j++) { if(anagrams.get(i)==palindromes.get(j)) {
		 * System.out.println(palindromes.get(j)); } } }
		 */
		anagrams.retainAll(palindromes);
		System.out.println("The prime numbers which are both anagrams and palindrome:");
		for (Integer e : anagrams) {
			System.out.println(e);
		}

	}
}
