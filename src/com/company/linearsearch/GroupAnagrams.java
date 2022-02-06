package com.company.linearsearch;

import java.util.*;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();
		for (String value : strs) {
			char[] chars = value.toCharArray();
			Arrays.sort(chars);
			String str = new String(chars);
			List<String> sigArr = map.getOrDefault(str, new ArrayList<>());
			sigArr.add(value);
			map.put(str, sigArr);
		}
		return new ArrayList<>(map.values());
	}
}
