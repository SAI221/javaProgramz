package com.bridgelabz.algorithms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.javaprgms.util.AlgorithmsUtil;


public class InsertionSort2 {
	public static void main(String[] args) {
		System.out.println("Enter size: ");
		int n =AlgorithmsUtil.integer();
		List<String>  words= new ArrayList<>();
		System.out.println("Enter the words:");

		for(int i=0;i<=n;i++){
			words.add(AlgorithmsUtil.string());
		}
		AlgorithmsUtil.insertSort(words,n);
		
	}

}
