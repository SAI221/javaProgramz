package com.bridgelabz.algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.bridgelabz.javaprgms.util.AlgorithmsUtil;

public class BinarySearch2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		String word = "";
		int val = 0;
		while (!word.matches("quit")) {
			System.out.println("Enter the word to be searched for");
			Scanner input = new Scanner(System.in);
			word = AlgorithmsUtil.string();
			Scanner file = new Scanner(new File("/home/admin1/Desktop/sai.txt"));

			while (file.hasNextLine()) {
				String line = file.nextLine();
				if (line.indexOf(word) != -1) {
					System.out.println("Word EXISTS in the file");
					val = 1;
					break;
				} else {
					val = 0;
					continue;
				}
			}
			if (val == 0) {
				System.out.println("Word does not exist");
			}
			System.out.println("-------continue or quit--- enter continue or quit");
			word = input.next();
		}
	}

}
