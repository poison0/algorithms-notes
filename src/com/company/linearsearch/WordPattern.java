package com.company.linearsearch;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	public boolean wordPattern(String pattern, String s) {
		Map<Character, String> map = new HashMap<>();
		Map<String, Boolean> recordMap = new HashMap<>();
		char[] chars = pattern.toCharArray();
		String[] words = s.split(" ");
		if (chars.length != words.length) {
			return false;
		}
		for (int i = 0; i < chars.length; i++) {
			if (map.containsKey(chars[i])) {
				if (!map.get(chars[i]).equals(words[i])) {
					return false;
				}
			}else {
				if (recordMap.containsKey(words[i])) {
					return false;
				}
				recordMap.put(words[i], true);
				map.put(chars[i], words[i]);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		boolean b = new WordPattern().wordPattern("aaa", "aa aa aa dog");

	}
}
