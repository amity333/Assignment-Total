package com.cg.lab3;

//Exercise:2

import java.util.Arrays;
import java.util.Scanner;

public class UpperCase {
	public void upper() {
		String S = "";
		System.out.print("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		char[] ch = str1.toCharArray();
		Arrays.sort(ch);

		String str = new String(ch);
		System.out.println("Sorted:" + str);
		if (str.length() % 2 != 0) {
			for (int i = 0; i < str.length() / 2 + 1; i++) {
				S += Character.toUpperCase(str.charAt(i));
			}
			for (int i = str.length() / 2 + 1; i < str.length(); i++) {
				S += Character.toLowerCase(str.charAt(i));
			}

		}

		else {
			for (int i = 0; i < str.length() / 2; i++) {
				S += Character.toUpperCase(str.charAt(i));

			}
			for (int i = str.length() / 2; i < str.length(); i++) {
				S += Character.toLowerCase(str.charAt(i));
			}

		}

		System.out.println(S);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpperCase up = new UpperCase();
		up.upper();

	}
}
