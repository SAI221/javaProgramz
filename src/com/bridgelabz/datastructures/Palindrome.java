package com.bridgelabz.datastructures;

import com.bridgelabz.javaprgms.util.AlgorithmsUtil;
import com.bridgelabz.javaprgms.util.MyDeque;

public class Palindrome {

	public static void main(String[] args) {
		MyDeque<Character> deque=new MyDeque<Character>();
		System.out.println("enter a string to check");
		String word=AlgorithmsUtil.string();
		for(int i=0;i<word.length();i++)
		{
			char item=word.charAt(i);
			deque.addLast(item);
		}
		int flag=0;
		while(deque.size()>1)
		{
			if(deque.removeFront()!=deque.removeLast())
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(word+" is palindrome");
			
		}
		else
			System.out.println(word +" is not a palindrome");
	}

}
