package com.cg.lab1;

import java.util.Scanner;

public class IncreasingNumber {
	public int increase() {
		int value = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		String n = sc.nextLine();
		for (int i = 0; i < n.length() - 1; i++) {
			char ch = n.charAt(i);
			if (ch > n.charAt(i + 1)) {
				value = 1;
			} else {
				value = 0;
			}
		}
		return value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IncreasingNumber in = new IncreasingNumber();
		if (in.increase() == 0) {
			System.out.println("Increasing ");
		} else {
			System.out.println("Decreasing");
		}
	}

}
