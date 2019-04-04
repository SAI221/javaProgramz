/*Gambler
Desc -> Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke (i.e. has no money) or reach $goal. Keeps track of the number of times he/she wins and the number of bets he/she makes. Run the experiment N times, averages the results, and prints them out.
I/P -> $Stake, $Goal and Number of times
Logic -> Play till the gambler is broke or has won
O/P -> Print Number of Wins and Percentage of Win and Loss.*/

package com.bridgelabz.functionalPrgms;

import com.bridgelabz.javaprgms.util.FunctionalUtil;

public class Gamble {

	public static void main(String[] args) {
		// INPUT
		System.out.println("Enter money");
		int money = FunctionalUtil.input();
		System.out.println("Enter bet");
		int bet = FunctionalUtil.input();
		System.out.println("Enter goal");
		int goal = FunctionalUtil.input();
//METHOD CALLING FOR OUTPUT
		FunctionalUtil.gambling(money, bet, goal);
	}

}
