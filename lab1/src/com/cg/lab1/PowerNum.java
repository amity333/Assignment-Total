package com.cg.lab1;

import java.util.Scanner;

public class PowerNum {
	public boolean checkNumber(int n) {
		int result = 0;
		while (n > 1) {
			result = n % 2;
			n = n / 2;
			if (result != 0)
				return false;
		}
		return true;

	}

	public static void main(String[] args) {
		System.out.print("Enter The Number: ");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		PowerNum p = new PowerNum();
		if (p.checkNumber(num))
			System.out.println("Power of 2");

		else
			System.out.println("Not Power of 2");

	}
}
