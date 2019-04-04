package com.bridgelabz.datastructures;

import com.bridgelabz.javaprgms.util.AlgorithmsUtil;
import com.bridgelabz.javaprgms.util.DataStructuresUtil;
import com.bridgelabz.javaprgms.util.GenericQueue;

public class QueueCalender {

	public static <T> void main(String[] args) {
		int month = AlgorithmsUtil.integer();
		int year = AlgorithmsUtil.integer();
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// check for leap year
		if (month == 2 && DataStructuresUtil.isLeapyear(year))
			days[month] = 29;
		// print calendar header
	
		System.out.println(" S  M  T  W  Th F  S ");

		// starting day
		int d = DataStructuresUtil.day(month, 1, year);
		int s=1;
		System.out.println(d);
		GenericQueue<String> week1=new GenericQueue<String>(7);
		GenericQueue<String> week2=new GenericQueue<String>(7);	
		GenericQueue<String> week3=new GenericQueue<String>(7);	
		GenericQueue<String> week4=new GenericQueue<String>(7);		
		GenericQueue<String> week5=new GenericQueue<String>(7);	
		GenericQueue<String> week6=new GenericQueue<String>(7);		
		for (int i = 0; i < d; i++)
		{
			week1.add(" ");
		}
		while(s<=days[month])
		{
			week1.add("s");
			if(((s + d) % 7 == 0))
			{
				week1.add("s");
			}
		}
	
	}

}
