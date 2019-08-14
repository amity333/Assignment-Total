package com.cg.lab13;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserPassAuth {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
		String s = sc.nextLine();
		System.out.println("Enter password");
		Double n = sc.nextDouble();

		Predicate<String> pr = (String str) -> {

			if (str == "rajsarka") {
				return true;
			}

			else {
				return false;

			}

		};
		System.out.println("user name is " + pr.test(s));

		Predicate<Double> pr1 = (Double x) -> {

			if (x == 165016) {
				return true;
			}

			else {
				return false;
			}

		};
		System.out.println("password is " + pr1.test(n));

	}

}
