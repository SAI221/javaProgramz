package com.bridgelabz.datastructures;

import java.util.List;

import com.bridgelabz.javaprgms.util.AlgorithmsUtil;

public class AnagramStack {

	public static void main(String[] args) {
		List<Integer> primes=AlgorithmsUtil.primeNum();
		List<Integer> anagrams=AlgorithmsUtil.primeAnagrams(primes);
		System.out.println(anagrams.size());
        anagramSorted(anagrams);
	}

	public static void anagramSorted(List<Integer> anagrams) {
		for(int i=0;i<anagrams.size();i++)
        {
        	for(int j=1;j<anagrams.size();j++)
        	{
        		if(anagrams.get(i)==anagrams.get(j))
        		{
        			anagrams.remove(j);
        		}
        	}
        }
        System.out.println(anagrams.size());
       
        for(int i=0;i<anagrams.size();i++)
        {
        		if(anagrams.get(i)>anagrams.get(i+1))
        		{
        			int temp=anagrams.get(i);
        			anagrams.set(i+1, anagrams.get(i));
        			anagrams.set(i, temp);
        			
        			
        		}
        	}
        for(int e:anagrams)
        {
        	System.out.println(e);
        }
	}
}


