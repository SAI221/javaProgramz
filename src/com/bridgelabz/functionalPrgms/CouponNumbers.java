/*Coupon Numbers
Desc -> Given N distinct Coupon Numbers, how many random numbers do you need to generate distinct coupon number? This program simulates this random process.
I/P -> N Distinct Coupon Number
Logic -> repeatedly choose a random number and check whether it's a new one.
O/P -> total random number needed to have all distinct numbers.
Functions => Write Class Static Functions to generate random number and to process distinct coupons.*/
package com.bridgelabz.functionalPrgms;

import java.util.Random;

import com.bridgelabz.javaprgms.util.FunctionalUtil;

public class CouponNumbers {

	public static void main(String[] args) {
		System.out.println("enter no. of coupons");
		int n = FunctionalUtil.input();
		Random r = new Random();
		int cn = r.nextInt(n);
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (cn != r.nextInt(n)) {
				count++;
			}
		}
		System.out.println(count);

	}

}