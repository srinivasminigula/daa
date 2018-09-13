package com.algorithm.sort.quick;

public class BubbleSort {
	static int[] sort = new int[] { 3, 5, 12, 7, 32, 54, 0 };

	public static void main(String[] args) {
		for (int i = 0; i < sort.length - 1; i++) {
			for (int j = i + 1; j < sort.length; j++) {
				if(sort[i] > sort[j]) {
				int temp = sort[j];
				sort[j] = sort[i];
				sort[i] = temp;
				}
			}
		}
		for (int x : sort) {
			System.out.println(x);
		}
	}

}
