package com.cg.lab3;

import java.util.Arrays;

public class SecondSmallest {
	public static int getSecondSmallest(int a[]) {
		Arrays.sort(a);
		return a[1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 6, 9, 2, 5, 8 };
		System.out.println(getSecondSmallest(a));
	}

}
