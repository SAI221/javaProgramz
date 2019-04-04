package com.bridgelabz.algorithms;

import com.bridgelabz.javaprgms.util.AlgorithmsUtil;

public class TaskScheduling {

	public static void main(String[] args) {
		System.out.println("enter number of tasks");
		int tasks=AlgorithmsUtil.integer();
		int [] arr=new int[tasks];
		for(int i=0;i<tasks;i++) {
			System.out.println("enter deadline and minutes to complete");
			int D=AlgorithmsUtil.integer();
			int M=AlgorithmsUtil.integer();
			if(D>=M)
			{
				System.out.println("no need to schedule");
				arr[i]=0;
			}
			else
			{
				System.out.println("need to schedule");
				arr[i]=M-D;
			}
		}
		int i=1;
		for(int e:arr)
		{
			System.out.println("overshoot of "+i+" is "+e);
			i++;
		}
		

	}

}
