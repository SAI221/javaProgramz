package com.bridgelabz.datastructures;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.bridgelabz.javaprgms.util.AlgorithmsUtil;

public class PrimeAnagram {

	public static void main(String[] args) {
		List<Integer> primes = AlgorithmsUtil.primeNum();
		System.out.println(primes.size());
		List<Integer> anagrams = AlgorithmsUtil.primeAnagrams(primes);
		System.out.println(anagrams.size());
		List<Integer> notAnagrams=new ArrayList<Integer>();
		
		
for(int i=0;i<primes.size();i++)
{
	if(!anagrams.contains(primes.get(i)))
			{
		notAnagrams.add(primes.get(i));
		System.out.println(primes.get(i));
			}
}
System.out.println(notAnagrams.size());
int row=15,column=15;
int[][] anagram2d=new int[row][column];
int[][] notAnagram2d=new int[row][column];
int a=0,b=0;

//alloting all elements in list to array
while(b<notAnagrams.size())
{
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<column;j++)
		{
		notAnagram2d[i][j]=notAnagrams.get(b);
		b++;
	}
		}
	
}
while(a<anagrams.size()) {
for(int i=0;i<row;i++)
{
	for(int j=0;i<column;j++)
	{
	anagram2d[i][j]=anagrams.get(a);
	System.out.println(anagram2d[i][j]);
	a++;
}
	}

}

//

//Display
System.out.println("Anagram 2d array");
for(int i=0;i<row;i++)
{
	for(int j=0;j<column;j++)
	{
	System.out.print(anagram2d[i][j]);
}
	System.out.println();
	}
System.out.println("NotAnagram 2d array");
for(int i=0;i<row;i++)
{
	for(int j=0;j<column;j++)
	{
	System.out.print(notAnagram2d[i][j]);
}
	System.out.println();
	}

	}

}
