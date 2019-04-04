package com.bridgelabz.algorithms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.javaprgms.util.AlgorithmsUtil;

public class BubbleSort {

	public static void main(String[] args)
	{
		System.out.println("Enter size: ");
		int n =AlgorithmsUtil.integer();
		List<Integer> array = new ArrayList<>();
		System.out.println("Enter elements:");

		for(int i=0;i<n;i++){
			array.add(AlgorithmsUtil.integer());
		}
		AlgorithmsUtil.bubbleSort(array, n); 
	}
}




