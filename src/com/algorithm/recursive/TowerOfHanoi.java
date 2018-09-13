package com.algorithm.recursive;

import java.util.Scanner;

public class TowerOfHanoi {

	public TowerOfHanoi() {
	}

	public static void main(String[] args) {
		//try (Scanner scanner = new Scanner(System.in)) {
		//	int numberOfDisks = scanner.nextInt();
			//System.out.println("numberOfDisks=" + numberOfDisks);
			towerOfHonoiMethod(3, "A", "B", "C");
		//}
	}

	static void towerOfHonoiMethod(int n, String start, String auxiliary, String end) {
	       if (n == 1) {
	           System.out.println(start + " -> " + end);
	       } else {
	    	   towerOfHonoiMethod(n - 1, start, end, auxiliary);
	           System.out.println(start + " -> " + end);
	           towerOfHonoiMethod(n - 1, auxiliary, start, end);
	       }
	   }
}
