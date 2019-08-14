package com.cg.lab3;

import java.util.Scanner;

class NoOfOccurenceOfCharacters {
	static final int MAX_CHAR = 250;

	static void getOccuringChar(String str) {
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
		getOccuringChar(str);

		/*
		 * public static void characterCount(String str) { int i; int find = 1; char[]
		 * ch = str.toCharArray(); List count = new ArrayList(); int l = str.length();
		 * for (i = 0; i < l - 1; i++) { count.add(str.charAt(i)); }
		 * 
		 * for (i = 0; i < l - 1; i++) {
		 * 
		 * if (ch[i] == str.charAt(i + 1)) { // find++; }
		 * 
		 * find++; } for (int j = 0; j <= l - 1; j++) { if (str.charAt(i) == ch[j]) ;
		 * 
		 * }
		 * 
		 * System.out.println(count + "" + find); }
		 * 
		 * public static void main(String[] args) { // TODO Auto-generated method stub
		 * // Scanner sc= new Scanner(System.in); // String str= sc.nextLine(); String
		 * str = "abcabc"; characterCount(str);
		 */

	}
}
