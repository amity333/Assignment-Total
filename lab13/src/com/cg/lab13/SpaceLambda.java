package com.cg.lab13;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.*;

public class SpaceLambda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line of no with one space between each no");
		String s = sc.nextLine();

		Consumer<String> con = (String str) -> {
			System.out.println(str.replaceAll("", "  ").trim());
		};

		con.accept(s);
	}

}
