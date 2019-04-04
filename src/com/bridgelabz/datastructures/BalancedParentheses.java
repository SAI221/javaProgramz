package com.bridgelabz.datastructures;


import com.bridgelabz.javaprgms.util.*;


public class BalancedParentheses
{
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Enter max size: ");
		int n=AlgorithmsUtil.integer();
	

		/* Creating Stack */
		MyStack stack = new MyStack(n);
		//INPUT
		System.out.println("Enter expression: ");
		String exp =AlgorithmsUtil.string();   
		System.out.println(DataStructuresUtil.paranthesisChecking(stack, exp));              
	
}

	
}