package lab8;
//: Exercise 5

import java.util.Scanner;

public class PositiveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean positive = true;
		System.out.println("Enter The String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length() - 1; i++) {
			char s1 = str.charAt(i);
			if (s1 >= str.charAt(i + 1)) {
				positive = false;
			}
		}
		System.out.println(positive);
	}

}
