package com.bridgelabz.datastructures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import com.bridgelabz.javaprgms.util.AlgorithmsUtil;
import com.bridgelabz.javaprgms.util.LinkedList;

public class UnOrderedList {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		LinkedList<String> list = new LinkedList<String>();
		File file = new File("/home/admin1/Desktop/sai.txt");
		BufferedReader bufferreader = new BufferedReader(new FileReader(file));
		String[] array = new String[50];
		String st;
		while ((st = bufferreader.readLine()) != null) {
			array = st.split(" ");
		}
		for (String k : array) {
			list.addElement(k);
		}

		list.traverse();
		list.get();//storing again in string array
		System.out.println("Enter the key value: ");
		String key = AlgorithmsUtil.string();

		LinkedList<?> newList = list.searchKey(list, key);

		newList.traverse();

		BufferedWriter bw = new BufferedWriter(new FileWriter("/home/admin1/Desktop/sai.txt"));
		String data = newList.toString();
		bw.write(data);
		bw.close();
		System.out.println("unordered list" + data);

	}
}
