package com.bridgelabz.algorithms;

import com.bridgelabz.javaprgms.util.AlgorithmsUtil;

public class NumberGuess {

	public static void main(String[] args) {
		System.out.println("range to select");
		int n=AlgorithmsUtil.integer();

	int r=(int) (Math.random()*n);
	System.out.println(r);

if(r<n)
{
	System.out.println("guessed no is " + AlgorithmsUtil.find(n));
}
else
	System.out.println("enter correct input");
	}
	

	
}