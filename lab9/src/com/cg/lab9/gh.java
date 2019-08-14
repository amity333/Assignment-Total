package com.cg.lab9;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.List;

import java.util.Map.Entry;

public class gh {

	public static void main(String args[])

	{

		HashMap<String, String> hm = new HashMap<String, String>();

		hm.put("3", "HTML");

		hm.put("1", "CSS");

		hm.put("2", "java");

		List<String> list = getValues(hm);

		for (String s : list) {

			System.out.println(s);

		}

	}

	public static List<String> getValues(HashMap<String, String> hm) {

		List<String> list = new ArrayList<String>();

		for (Entry<String, String> m : hm.entrySet()) {

			list.add((String) m.getValue());

		}

		return list;

	}

}
