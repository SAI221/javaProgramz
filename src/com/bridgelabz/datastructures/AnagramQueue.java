package com.bridgelabz.datastructures;

import java.util.List;

import com.bridgelabz.javaprgms.util.AlgorithmsUtil;
import com.bridgelabz.javaprgms.util.QueueLinkedList;

public class AnagramQueue {

	public static void main(String[] args) {
		List<Integer> primes = AlgorithmsUtil.primeNum();
		List<Integer> anagrams = AlgorithmsUtil.primeAnagrams(primes);
		AnagramStack.anagramSorted(anagrams);
		QueueLinkedList<Integer> anagramQueue = new QueueLinkedList<Integer>();
		for (Integer e : anagrams) {
			anagramQueue.insert(e);
			System.out.print(" " + e);
		}

	}

}