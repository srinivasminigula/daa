package com.algorithm.sort.quick;

public class QuickSort {

	public QuickSort() {
	}

	public static void main(String[] args) {
		int a[] = new int[] { -1, 22, 8, 77, 4, 10, 80, 30, 90, 40, 50, 70 };
		quickSort(a, 0, a.length - 1);
		for (int ele : a) {
			System.out.println(ele);
		}
	}

	static void quickSort(int[] a, int low, int high) {
		if (low < high) {
			int pivot = partition(a, low, high);
			quickSort(a, low, pivot - 1);
			quickSort(a, pivot + 1, high);
		}
	}

	private static int partition(int[] a, int low, int high) {
		int pivot = a[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (a[j] <= pivot) {
				i++;
				if (!(i == j)) {
					System.out.println((i == j) + ", i=" + a[i] + " j=" + a[j]);
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		// what is next position for Pivot?? find out??
		int temp = a[i + 1];
		a[i + 1] = a[high];
		a[high] = temp;

		return i + 1;
	}

}
