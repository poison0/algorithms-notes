package com.company.linearsearch;

import java.util.*;
import java.util.stream.Collectors;

public class FrequencySort {
	public String frequencySort(String s) {
		char[] chars = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		for (char aChar : chars) {
			Integer seq = map.getOrDefault(aChar, 0) + 1;
			map.put(aChar, seq);
		}
		ArrayList<Character> characters = new ArrayList<>(map.keySet());
		characters.sort(Comparator.comparingInt(map::get).reversed());
		StringBuilder res = new StringBuilder();
		for (Character character : characters) {
			res.append(String.valueOf(character).repeat(Math.max(0, map.get(character))));
		}
		return res.toString();
	}
}
