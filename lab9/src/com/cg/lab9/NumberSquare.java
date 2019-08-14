package com.cg.lab9;

//: Exercise 3

import java.util.HashMap;
import java.util.Iterator;

public class NumberSquare {

	public static HashMap<Integer, Integer> getSquare(int[] a) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> map = new HashMap();
		for (int n : a) {
			map.put(n, n * n);
		}
		return map;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, };
		HashMap<Integer, Integer> map = getSquare(a);
		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + " " + map.get(key));
		}

	}

}
