package com.bridgelabz.algorithms;

import com.bridgelabz.javaprgms.util.AlgorithmsUtil;


public class MergeSort {

	public static void main(String[] args) {

		int[] arr = AlgorithmsUtil.arr();
		int n = arr.length;
		mSort(arr, n);
		for (int e : arr) {
			System.out.print(e + " ");
		}
	}

	public static void mSort(int[] a, int n) {
		if (n < 2) {
			return;
		}
		int mid = n / 2;
		int[] m1 = new int[mid];
		int[] m2 = new int[n - mid];

		for (int i = 0; i < mid; i++) {
			m1[i] = a[i];
		}
		for (int i = mid; i < n; i++) {
			m2[i - mid] = a[i];
		}
		mSort(m1, mid);
		mSort(m2, n - mid);

		merge(a, m1, m2, mid, n - mid);
	}

	public static void merge(int[] a, int[] m1, int[] m2, int strt, int end) {

		int i = 0, j = 0, k = 0;
		while (i < strt && j < end) {
			if (m1[i] <= m2[j]) {
				a[k++] = m1[i++];
			} else {
				a[k++] = m2[j++];
			}
		}
		while (i < strt) {
			a[k++] = m1[i++];
		}
		while (j < end) {
			a[k++] = m2[j++];
		}

	}
}
