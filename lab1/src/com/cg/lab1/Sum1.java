package com.cg.lab1;

import java.util.Scanner;

public class Sum1 {

	public int calculateSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		Sum1 t = new Sum1();
		System.out.println(t.calculateSum(n));

	}

}
