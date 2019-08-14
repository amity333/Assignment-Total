package com.cg.lab9;

//: Exercise 2

import java.util.HashMap;

public class Character_Count {

	// countCharacter

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaaaaaaasssssssdddddddffffffgggggg";
		countCharacter(str);

	}

	public static void countCharacter(String str) {
		// TODO Auto-generated method stub

		HashMap<Character, Integer> charCount = new HashMap();
		char[] strArray = str.toCharArray();
		for (char c : strArray) {
			if (charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c) + 1);
			} else {
				charCount.put(c, 1);
			}
		}
		for (Character key : charCount.keySet()) {
			System.out.print(" "+key + " " + charCount.get(key));
		}
	}

}
