package com.bridgelabz.javaprgms.util;

public class MyDeque<E> {

	public MyDeque() {
	}

	NodeD<E> front;
	NodeD<E> last;
	int count = 0;

	@SuppressWarnings("null")
	public void addfront(E item) {
		if (isEmpty()) {
			front.data = item;
			last = front;
		} else {
			NodeD<E> temp = null;
			temp.data = item;
			temp.next = front;
			front.prev = temp;
			front = temp;
		}
		count++;
	}

	public void addLast(E item) {

		if (front == null) {
			NodeD<E> temp = new NodeD<E>(item);
			front = temp;
			last = front;
		} else {
			NodeD<E> temp = new NodeD<E>(item);
			last.next = temp;
			temp.prev = last;
			last = temp;
		}
		count++;

	}

	public E removeFront() {
		E value = null;
		if (front == null) {
			System.out.println("no elements to delete");
		} else {
			value = front.data;
			front = front.next;
		}
		count--;
		return value;
	}

	public E removeLast() {
		E value = null;
		if (front == null) {
			System.out.println("no elements to delete");
		} else {
			value = last.data;
			last = last.prev;
			last.next = null;
		}
		count--;
		return value;
	}

	public boolean isEmpty() {
		return count == 0;

	}

	public int size() {
		return count;
	}
}
