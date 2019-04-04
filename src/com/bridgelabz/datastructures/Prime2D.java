package com.bridgelabz.datastructures;

import java.util.ArrayList;

import com.bridgelabz.javaprgms.util.AlgorithmsUtil;

public class Prime2D {

	public static void main(String[] args) {
		ArrayList<Integer> primes = AlgorithmsUtil.primeNum();
		int rows = 10;
		int cols = 100;
		int[][] prime2d = new int[rows][cols];
		
		//  for (int e : primes) { System.out.println(e); }
		 
		int i=1;
	//	System.out.println("0-100  100-200 200-300 300-400 400-500 500-600 600-700 700-800 800-900 900-1000");
try {
		while(i<=primes.size()) {
			for(int j=0;j<cols;j++) {
			if (primes.get(i) < 100) {
				prime2d[0][j] = primes.get(i);
				System.out.print(""+prime2d[0][j]+"   ");
						i++;
			}
		}
			System.out.println();
			for(int j=0;j<cols;j++) {
				if (primes.get(i) < 200) {
					prime2d[1][j] = primes.get(i);
					System.out.print(prime2d[1][j]+"   ");
					
							i++;
				} 
			}
			System.out.println();
			for(int j=0;j<cols;j++) {
				if (primes.get(i) < 300) {
					prime2d[2][j] = primes.get(i);
					System.out.print(prime2d[2][j]+"   ");
					
							i++;
				} 
			}
			System.out.println();
			for(int j=0;j<cols;j++) {
				if (primes.get(i) < 400) {
					prime2d[3][j] = primes.get(i);
					System.out.print(prime2d[3][j]+"   ");
							i++;
				} 
			}
			System.out.println();
			for(int j=0;j<cols;j++) {
				if (primes.get(i) < 500) {
					prime2d[4][j] = primes.get(i);
					System.out.print(prime2d[4][j]+"   ");
							i++;
				} 
			}
			System.out.println();
			for(int j=0;j<cols;j++) {
				if (primes.get(i) < 600) {
					prime2d[5][j] = primes.get(i);
					System.out.print(prime2d[5][j]+"   ");
							i++;
				} 
			}
			System.out.println();
			for(int j=0;j<cols;j++) {
				if (primes.get(i) < 700) {
					prime2d[6][j] = primes.get(i);
					System.out.print(prime2d[6][j]+"   ");
							i++;
				} 
			}
			System.out.println();
			for(int j=0;j<cols;j++) {
				if (primes.get(i) < 800) {
					prime2d[7][j] = primes.get(i);
					System.out.print(prime2d[7][j]+"   ");
							i++;
				} 
			}	
			System.out.println();
			for(int j=0;j<cols;j++) {
				if (primes.get(i) < 900) {
					prime2d[8][j] = primes.get(i);
					System.out.print(prime2d[8][j]+"   ");
							i++;
				} 
			}
			System.out.println();
			for(int j=0;j<cols;j++) {
				if (primes.get(i) < 1000) {
					prime2d[9][j] = primes.get(i);
					System.out.print(prime2d[9][j]+"   ");
							i++;
				} 
			}
		}

	
	
}
catch(Exception e)
{
	e.fillInStackTrace();
}
finally
{
	for(int k=0;k<=rows-1;k++)
	{
		for(int j=0;j<=cols-1;j++)
		{
			System.out.print(prime2d[i][j]);
		}
		System.out.println();
	}
}
		
}
}
