package com.cg.lab3;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Char_Count {

	static final int MAX_CHAR = 250;

	static void characterCount(String str) {
		int count[] = new int[MAX_CHAR];

		int len = str.length();

		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;

		char ch[] = new char[str.length()];
		for (int i = 0; i < len; i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {

				if (str.charAt(i) == ch[j])
					find++;
			}

			if (find == 1)
				System.out.println("Number of " + str.charAt(i) + " is:" + count[str.charAt(i)]);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		characterCount(str);
	}

}
