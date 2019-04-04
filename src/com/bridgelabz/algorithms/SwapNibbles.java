package com.bridgelabz.algorithms;

import java.util.ArrayList;

import com.bridgelabz.javaprgms.util.AlgorithmsUtil;

public class SwapNibbles {

	public static void main(String[] args) {
		System.out.println("enter a number");
		int number= AlgorithmsUtil.integer();
		String conv=AlgorithmsUtil.binaryConvers(number);
		
			ArrayList<String> strings = new ArrayList<String>();
			
			if(conv.length()%4==0)
			{
				//public static void total(String conv, ArrayList<String> strings) {
					AlgorithmsUtil.divideNibbles(conv, strings);
					int result = (int) AlgorithmsUtil.swapping(strings);
					System.out.println(AlgorithmsUtil.decimal(result));
					System.out.println(AlgorithmsUtil.isPowerOfTwo(AlgorithmsUtil.decimal(result)));
				
			}
			else
			{
				int n=conv.length()%4;
				for(int i=0;i<4-n;i++)
				{
					conv=0+conv;
				}
			System.out.println(conv);
//			AlgorithmUtil.total(conv, strings);
			//public static void total(String conv, ArrayList<String> strings) {
				AlgorithmsUtil.divideNibbles(conv, strings);
				int result = (int)AlgorithmsUtil. swapping(strings);
				System.out.println(AlgorithmsUtil.decimal(result));
				System.out.println(AlgorithmsUtil.isPowerOfTwo(AlgorithmsUtil.decimal(result)));
			

			}
	}

       

}


