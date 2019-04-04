package com.bridgelabz.functionalPrgms;

import com.bridgelabz.javaprgms.util.FunctionalUtil;

public class StopWatch {
	public static void main(String[] args) {
		
		long start=System.nanoTime();
		long stop=System.nanoTime();
		System.out.println(FunctionalUtil.stopWatch(start, stop));
	}
}