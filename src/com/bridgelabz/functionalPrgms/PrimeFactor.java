/*Factors
Desc -> Computes the prime factorization of N using brute force.
I/P -> Number to find the prime factors
Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
O/P -> Print the prime factors of number N.*/

package com.bridgelabz.functionalPrgms;

import com.bridgelabz.javaprgms.util.FunctionalUtil;

public class PrimeFactor {

	public static void main(String[] args) {
		// INPUT
		System.out.println("enter no.:");
		int n = FunctionalUtil.input();
		// METHOD CALLING FOR OUTPUT
		FunctionalUtil.factors(n);
	}

}