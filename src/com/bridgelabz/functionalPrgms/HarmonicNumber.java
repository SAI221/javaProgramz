/*Harmonic Number 
Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N (http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
I/P -> The Harmonic Value N. Ensure N != 0
Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
O/P -> Print the Nth Harmonic Value.*/

package com.bridgelabz.functionalPrgms;

import com.bridgelabz.javaprgms.util.FunctionalUtil;

public class HarmonicNumber {

	public static void main(String[] args) {
		//INPUT
		System.out.println("enter n value");
		int n=FunctionalUtil.input();
		//Method Calling
		 double NthValue=FunctionalUtil.hormonic(n);
		 //OUTPUT
		 System.out.println("Nth Harmonic value is"+NthValue);
	}

}