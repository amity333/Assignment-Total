package com.cg.lab13;

import java.util.Scanner;
import java.util.function.BiFunction;

public class PowLambda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("print base number x");
		int x = sc.nextInt();
		System.out.println("print exponent y");
		int y = sc.nextInt();

		BiFunction<Integer, Integer, Integer> obj = (num1, num2) -> {
			return (int) Math.pow(num1, num2);
		};

		int res = obj.apply(x, y);
		System.out.println("x^y is : " + res);
	}

}
