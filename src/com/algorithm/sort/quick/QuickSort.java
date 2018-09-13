package com.algorithm.sort.quick;

public class QuickSort {

	public QuickSort() {
	}

	public static void main(String[] args) {
		int data[] = new int[] { 15, 9, 2, 56, 23, 1, 10, 5, 2, 3, 1, 0, 99, -1 };
		System.out.println("Array length=" + data.length);
		int start = 0;
		int end = data.length-1;
		int mid = start + end / 2;
		System.out.println("mid=" + mid);
		sortRecursive(data, start, mid);
		sortRecursive(data, mid + 1, end);
	}

	private static void sortRecursive(int[] data, int start, int end) {
		if (start >= end) {
			return;
		}
		sortRecursive(data, start, start + end / 2);
	}
}
