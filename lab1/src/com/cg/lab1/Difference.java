package com.cg.lab1;

import java.util.Scanner;

public class Difference {
	public int calculateDifference(int n) {
		// TODO Auto-generated method stub
		int a = 0, b = 0, c = 0, sum = 0;
		for (int i = 1; i <= n; i++) {
			a = a + (i * i);
			b = b + i;
			c = b * b;
			sum = a - c;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter The Number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Difference d = new Difference();
		System.out.println("The sum is:" + d.calculateDifference(n));
	}

}
