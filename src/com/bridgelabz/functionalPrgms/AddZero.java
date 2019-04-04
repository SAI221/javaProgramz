/*Sum of three Integer adds to ZERO
Desc -> A program with cubic running time. Read in N integers and counts the   number of triples that sum to exactly 0.
I/P -> N number of integer, and N integer input array
Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
O/P -> One Output is number of distinct triplets as well as the second output is to print the distinct triplets.*/

package com.bridgelabz.functionalPrgms;

import com.bridgelabz.javaprgms.util.FunctionalUtil;

public class AddZero {

	public static void main(String[] args) {
		// INPUT
		System.out.println("enter no. of values ");
		int n = FunctionalUtil.input();
		int arr[] = new int[n];
		System.out.println("Enter values");
		for (int i = 0; i < n; i++) {

			arr[i] = FunctionalUtil.input();
		}
//METHOD CALLING AND OUTPUT
		FunctionalUtil.addZero(n, arr);
	}

}