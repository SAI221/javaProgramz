/*Coupon Numbers
Desc -> Given N distinct Coupon Numbers, how many random numbers do you need to generate distinct coupon number? This program simulates this random process.
I/P -> N Distinct Coupon Number
Logic -> repeatedly choose a random number and check whether it's a new one.
O/P -> total random number needed to have all distinct numbers.
Functions => Write Class Static Functions to generate random number and to process distinct coupons.*/

package com.bridgelabz.functionalPrgms;

import java.util.HashSet;
import java.util.Set;

import com.bridgelabz.javaprgms.util.FunctionalUtil;

public class RandomCoupon {

	public static void main(String[] args) {

		int max = 100;
		// INPUT
		System.out.println("enter number of coupons you needed");
		int input = FunctionalUtil.input();
		// OUTPUT
		System.out.println("diff coupon numbers");
		for (int i = 0; i < input; i++) {

			Set<Integer> s = new HashSet<>();
			s.add((int) (Math.random() * max));
			s.forEach(System.out::println);

		}

	}
}
