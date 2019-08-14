package com.cg.lab13;

import java.util.function.Function;

public class FacLambda {
	static int number = 7;

	public static int fact(int a) {
		int i, fact = 1;
		// int number ;//It is the number to calculate factorial
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}

		return fact;

	}

	public static void main(String[] args) {

		Function<Integer, Integer> obj = FacLambda::fact;
		int result = obj.apply(number);
		System.out.println("factorial of the number is " + result);

	}

}
