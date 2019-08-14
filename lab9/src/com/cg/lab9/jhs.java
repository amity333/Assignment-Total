package com.cg.lab9;

import java.util.HashMap;

import java.util.Map;

public class jhs {
	public static void main(String args[]) {

		char[] ch = { 'A', 'P', 'P', 'L', 'E' };

		Map<String, String> map = countCharacter(ch);

		System.out.println(map);

	}

	private static Map<String, String> countCharacter(char[] ch) {

		Map<String, String> map = new HashMap<String, String>();

		for (char c = 'A'; c <= 'Z'; c++) {

			int count = 0;

			for (int i = 0; i < ch.length; i++) {

				if (c == ch[i]) {

					count++;

				}

			}

			String s = Character.toString(c);

			String count1 = Integer.toString(count);

			if (count != 0) {

				map.put(s, count1);

			}

		}

		System.out.print(map.entrySet());

		return map;

	}

}
