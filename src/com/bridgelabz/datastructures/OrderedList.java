package com.bridgelabz.datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabz.javaprgms.util.LinkedList;
import com.bridgelabz.javaprgms.util.OrderedLinkedList;

public class OrderedList {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		OrderedLinkedList list = new OrderedLinkedList();
		File file = new File("/home/admin1/num.txt");
		BufferedReader bufferreader = new BufferedReader(new FileReader(file));
		String[] array = new String[50];
		String st;
		while ((st = bufferreader.readLine()) != null) {
			array = st.split(" ");
		}
		int[] intArray = new int[50];
		for(int j=0;j<array.length;j++)
		{
		for (int i = 0; i < intArray.length; i++) {
			if (array[j] != null) {
				intArray[i] = Integer.parseInt(array[j]);
			}
		}
		}
		for(int e:intArray)
		{
			list.addItem(e);
		}
		list.display();
		list.getDataFromFile();
		
		 list.searchData();
		FileWriter fw = new FileWriter("/home/admin1/num.txt");
		String data =list.toString();
		fw.write(data);
		fw.close();
		System.out.println("ordered list  " + data);
	}

}
