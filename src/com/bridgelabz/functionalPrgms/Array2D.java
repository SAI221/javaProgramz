/*2D Array
Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from standard input and printing them out to standard output.
I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
Logic -> create 2 dimensional array in memory to read in M rows and N cols 
O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with OutputStreamWriter to print the output to the screen.*/
package com.bridgelabz.functionalPrgms;

import com.bridgelabz.javaprgms.util.FunctionalUtil;

public class Array2D {

	public static void main(String[] args) {
		// INPUT
		System.out.println("Enter no. of rows");
		int r = FunctionalUtil.input();
		System.out.println("Enter no. of columns");
		int c = FunctionalUtil.input();
//intialising array and taking elements
		int arr[][] = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {

				System.out.println("enter value" + arr[i][j]);
				arr[i][j] = FunctionalUtil.input();

			}
		}
//OUTPUT
		FunctionalUtil.array2D(r, c, arr);
	}

}