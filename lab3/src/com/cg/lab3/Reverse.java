package com.cg.lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Reverse {
	public int getSorted() {
		Scanner sc = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			arr.add(a);
		}
		Collections.reverse(arr);
		System.out.println("Reverse: " + arr);
		Collections.sort(arr);
		System.out.println("Sorted: " + arr);
		return n;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse r = new Reverse();
		r.getSorted();
	}

}
