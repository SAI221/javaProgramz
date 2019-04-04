package com.bridgelabz.javaprgms.util;

public class MyQueue {
	private int arr[];
	private int front = 0;
	private int last = -1;
	private int capacity;
	private int count = 0;

	public MyQueue(int size) {
		this.capacity = size;
		arr = new int[this.capacity];
	}

//TO ENTER ELEMENTS
	public void add(int value)// enqueue
	{
		if (isFull()) {
			System.out.println("can't able to take ");
		} else {
			last = (last + 1) % capacity;
			arr[last] = value;
			// System.out.println("added" + value);
			count++;
		}
	}

// TO REMOVE ELEMENT
	public void remove()// dequeue
	{
		if (isEmpty()) {
			System.out.println("nothing to remove");
		} else {
			front = (front + 1) % capacity;
			System.out.println("removed");
			count--;
		}

	}

//CHECKING WHETHER IT IS EMPTY R NOT
	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		} else
			return false;

	}

//CHECKING WHETHER IT IS FULL OR NOT
	public boolean isFull() {
		if (size() == capacity) {
			return true;
		} else
			return false;

	}

//SIZE OF THE QUEUE
	public int size() {
		return count;
	}
}
