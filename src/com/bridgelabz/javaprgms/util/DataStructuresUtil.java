package com.bridgelabz.javaprgms.util;

public class DataStructuresUtil {
	public static int day(int month, int day, int year) {
		int y = year - (14 - month) / 12;
		int x = y + y / 4 - y / 100 + y / 400;
		int m = month + 12 * ((14 - month) / 12) - 2;
		int d = (day + x + (31 * m) / 12) % 7;
		return d;
	}

	// return true if the given year is a leap year
	public static boolean isLeapyear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0))
			return true;
		if (year % 400 == 0)
			return true;
		return false;
	}
	public static boolean paranthesisChecking(MyStack stack, String exp) throws Exception {
		int len = exp.length();
		System.out.println("Matches and Mismatches: ");

		for (int i = 0; i < len; i++)
		{    
		char ch = exp.charAt(i);

			if (ch == '('||ch=='{'||ch=='[')
			{
			stack.push(i);
			}
				else if (ch == ')'||ch=='}'||ch==']')
				{
					stack.pop();
				}            
			}
		while (!stack.isStackEmpty() )
		{
		return false;
		}
		return true;
	}
	
}
