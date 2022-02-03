package com.company.linearsearch;

import java.util.*;

public class Intersection {
	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		Set<Integer> recordSet = new HashSet<>();
		for (int value : nums1) {
			set.add(value);
		}
		for (int i : nums2) {
			if (set.contains(i)) {
				recordSet.add(i);
			}
		}
		int[] re = new int[recordSet.size()];
		Iterator<Integer> iterator = recordSet.iterator();
		int i =0;
		while (iterator.hasNext()) {
			re[i++] = iterator.next();
		}
		return re;
	}
	public int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer,Integer> map = new HashMap<>();
		ArrayList<Integer> record = new ArrayList<>();
		for (int value : nums1) {
			boolean b = map.containsKey(value);
			if (b) {
				map.put(value, map.get(value) + 1);
			}else {
				map.put(value, 1);
			}
		}
		for (int value : nums2) {
			if (map.containsKey(value) && map.get(value) > 0) {
				record.add(value);
				map.put(value, map.get(value) - 1);
			}
		}
		int[] re = new int[record.size()];
		Iterator<Integer> iterator = record.iterator();
		int i =0;
		while (iterator.hasNext()) {
			re[i++] = iterator.next();
		}
		return re;
	}
}
