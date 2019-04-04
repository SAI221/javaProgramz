package com.bridgelabz.datastructures;

import java.util.List;

import com.bridgelabz.javaprgms.util.AlgorithmsUtil;

public class AnagramQueue {

	public static void main(String[] args) {
		List<Integer> primes=AlgorithmsUtil.primeNum();
		List<Integer> anagrams=AlgorithmsUtil.primeAnagrams(primes);
		AnagramStack list=new AnagramStack();
		list.anagramSorted(anagrams);

	}

}