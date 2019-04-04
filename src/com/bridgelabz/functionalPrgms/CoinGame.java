/*Flip Coin and print percentage of Heads and Tails
I/P -> The number of times to Flip Coin. Ensure it is positive integer.
Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
O/P -> Percentage of Head vs Tails*/
package com.bridgelabz.functionalPrgms;

import com.bridgelabz.javaprgms.util.FunctionalUtil;

public class CoinGame {

	public static void main(String[] args)
	{
		//INPUT
		System.out.println("no. of flips the coin do");
		int flips=FunctionalUtil.input();
		//calling coinGame method from functionalUtil to get output
		FunctionalUtil.coinGame(flips);

}
}