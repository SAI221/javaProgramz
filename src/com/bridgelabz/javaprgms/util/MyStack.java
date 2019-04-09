package com.bridgelabz.javaprgms.util;

public class MyStack {

	private int stackSize;
	private int[] stackArr;
	private int top;

	// Creates stake with given size
	public MyStack(int size) {
		stackSize = size;
		stackArr = new int[stackSize];
		top = -1;
	}

	public MyStack() {
		top = 0;
		stackSize = 0;
	}

	// for pushing
	public void push(int entry) throws Exception {
		if (isStackFull()) {
			throw new Exception("Stack is already full. Can not add element.");
		}
		System.out.println("Adding: " + entry);
		stackArr[++top] = entry;
	}

	// for poping
	public int pop() throws Exception {
		if (isStackEmpty()) {
			throw new Exception("Stack is empty. Can not remove element.");
		}
		int entry = stackArr[top--];
		System.out.println("Removed entry: " + entry);
		return entry;
	}

	// for returing last one in stack
	public int peek() {
		return stackArr[top];
	}

	// checking if it is empty or not
	public boolean isStackEmpty() {
		return (top == -1);
	}

	// checking if it is full or not
	public boolean isStackFull() {
		return (top == stackSize - 1);
	}

	public void push1(QueueLinkedList<Integer> entry) throws Exception {
		if (isStackFull()) {
			throw new Exception("Stack is already full. Can not add element.");
		}
		System.out.println("Adding: " + entry);

	}

	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
}