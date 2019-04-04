/*User Input and Replace String Template “Hello <<UserName>>, How are you?” 
I/P -> Take User Name as Input. Ensure UserName has min 3 char
Logic -> Replace <<UserName>> with the proper name
O/P -> Print the String with User Name */
package com.bridgelabz.functionalPrgms;

import com.bridgelabz.javaprgms.util.FunctionalUtil;

public class Replace {

	public static void main(String[] args) {
//INPUT
		System.out.println("enter username:");
		String userName = FunctionalUtil.stng();
		String msg = new String("Hello," + userName + ".How r u?");
		if (userName.length() >= 3) {
			// checking whether the user name has length of 3
			System.out.println(msg);
			System.out.println("enter propername:");
			String properName = FunctionalUtil.stng();
			// calling the replace method from functional util class
			System.out.println(FunctionalUtil.replace(userName, properName, msg));
		} else
			System.out.println("invalid input");
	}
}