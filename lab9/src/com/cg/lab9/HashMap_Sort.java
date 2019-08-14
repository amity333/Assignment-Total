package com.cg.lab9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//: Exercise 1

public class HashMap_Sort {

	public static List<String> getValues(HashMap<String, String> m) {
		List<String> list = new ArrayList<String>();
		for (Entry<String, String> hm : m.entrySet()) {
			list.add((String) hm.getValue());
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("4", "N");
		m.put("5", "C");
		m.put("1", "A");
		m.put("2", "G");

		// System.out.println(m);
		List<String> list = getValues(m);
		for (String s : list)
			System.out.println(s);

	}

}
