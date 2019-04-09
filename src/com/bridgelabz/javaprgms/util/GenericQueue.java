package com.bridgelabz.javaprgms.util;

public class GenericQueue<T> {
	private T[] data;
	private int front;
	public int size;
	private int back;
	public final static int intialSize = 16;
	public static int arraySize = 8;

	public GenericQueue() {
		this(intialSize);
	}

	public GenericQueue(int capacity) {
		if (capacity < 1) {
			System.out.println("should be greater");
		}
		if (capacity > arraySize) {
			System.out.println("should be less");
		}
		@SuppressWarnings("unchecked")
		T[] temp = (T[]) new Object[capacity];
		data = temp;
	}

	public GenericQueue<T> add(T item) {
		if (size == data.length) {
			System.out.println("no space");
		}
		data[back] = item;
		back = (back + 1) % data.length;
		size++;
		return this;
	}

	public T remove() {
		if (size == 0) {
			System.out.println("no elements");
		}

		size--;
		T output = data[front];
		data[front] = null;
		front = (front + 1) % data.length;
		return output;
	}

}
