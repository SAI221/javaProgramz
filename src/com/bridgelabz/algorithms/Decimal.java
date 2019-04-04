package com.bridgelabz.algorithms;

import com.bridgelabz.javaprgms.util.AlgorithmsUtil;

public class Decimal {

	public static void main(String[] args) {
	
	int n=AlgorithmsUtil.integer();
String conv=	AlgorithmsUtil.binaryConvers(n);
long num=Long.parseLong(conv);
	String str=AlgorithmsUtil.string();
	System.out.println(decimal(num));
	convert(str);
	
	}
		static int decimal(long n) {
			int rs = 0;
			int count = 0;
			while (n > 0) {
				double r = n % 10;
				rs = (int) (rs + r * Math.pow(2, count));
				count++;
				n = n / 10;

			}
			return rs;
		}
	public static void convert(String n)
	{
		int result = Integer.parseInt(n);
	System.out.println(result);
	}
	
	

	}
