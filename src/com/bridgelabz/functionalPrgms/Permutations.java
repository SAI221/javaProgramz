package com.bridgelabz.functionalPrgms;

import com.bridgelabz.javaprgms.util.FunctionalUtil;

public class Permutations{

	public static void main(String[] args) {
	java.lang.String name=FunctionalUtil.stng();
	
	stringR(name," ");
	stringI(name);
	}

	public static void stringR(String name,String s)
	{
	if(name.length()==0)
	{
		System.out.println(s+" ");
		return;
	}
	for(int i=0;i<name.length();i++)
	{
		char c=name.charAt(i);
		 String ros = name.substring(0, i) +  
                 name.substring(i + 1);                             
    stringR(ros,s+ c); 
    
	}
	}
	
	public static void stringI(String s)
	{
		
        
	}
	/*public static String swap(String name,int i,int j)
	{
		char[] cha=new char[name.length()];
		char temp=cha[i];
		cha[i]=cha[j];
		cha[j]=temp;
	return name.valueOf(cha);
	}*/
}
