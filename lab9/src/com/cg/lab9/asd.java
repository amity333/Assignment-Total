package com.cg.lab9;

import java.util.HashMap;

import java.util.Map;

public class asd {

	public static void main(String args[]) {

		int[] i = { 2, 4, 5, 6, 3 };

		Map<String, String> map = getSquares(i);

		System.out.println(map);

	}

	public static Map<String, String> getSquares(int[] i) {

		Map<String, String> map = new HashMap<String, String>();

		for (int k = 0; k < i.length; k++) {

			String Key = Integer.toString(i[k]);

			String value = Integer.toString(i[k] * i[k]);

			map.put(Key, value);

		}

		return map;

	}

}
