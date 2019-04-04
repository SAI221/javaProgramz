package com.bridgelabz.datastructures;

import com.bridgelabz.javaprgms.util.AlgorithmsUtil;
import com.bridgelabz.javaprgms.util.MyQueue;

public class BankingCashCounter {
	public static void main(String[] args) {
		System.out.println("money present in cash counter");
		int money = AlgorithmsUtil.integer();
		System.out.println("no of persons in the queue");
		int persons = AlgorithmsUtil.integer();
		MyQueue queue = new MyQueue(persons);
		int j = 1;// persons
		for (int i = 0; i < persons; i++) {
			queue.add(i);
		}

		while (j <= persons) {
			System.out.println("Welcome to CashCounter!!");

			System.out.println(
					"select your option---\n" + "1.withdrawal\n" + "2.depositing\n" + "3.check balance\n" + "4.exit");
			int select = AlgorithmsUtil.integer();

			switch (select) {
			case 1: {
				System.out.println("enter money to withdraw");
				int withdraw = AlgorithmsUtil.integer();
				if (money > withdraw) {
					System.out.println("take your money");
					money = money - withdraw;
				} else
					System.out.println("sufficient money is not present");
				break;
			}
			case 2: {
				System.out.println("enter money to deposit");
				int deposit = AlgorithmsUtil.integer();
				money = money + deposit;
				System.out.println("money deposited");
				break;
			}
			case 3:
				System.out.println("Available balance =" + money);
				break;
			case 4: {
				queue.remove();
				j++;
				System.out.println("Come Again ^-^");
				System.out.println("person gone from the queue");
				break;

			}
			default:
				System.out.println("Select valid option");

			}

		}

	}
}
