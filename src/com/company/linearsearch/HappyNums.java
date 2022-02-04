package com.company.linearsearch;

import java.util.HashMap;
import java.util.Map;

public class HappyNums {
	public boolean isHappy(int n) {
		Map<Integer,Integer> record = new HashMap<>();
		return getHappy(n,record);
	}

	boolean getHappy(int n, Map<Integer,Integer> record) {
		if (n == 1) {
			return true;
		}
		if (record.containsKey(n)) {
			return false;
		}
		char[] chars = String.valueOf(n).toCharArray();
		int sum = 0;
		for (char aChar : chars) {
			int s = Integer.parseInt(String.valueOf(aChar));
			sum += s*s;
		}
		record.put(n, 1);
		return getHappy(sum, record);
	}

	public static void main(String[] args) {
		boolean happy = new HappyNums().isHappy(19);
		System.out.println(happy);
	}
}
