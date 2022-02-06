package com.company.linearsearch;

import java.util.HashMap;
import java.util.Map;

public class FourSumCount {
	public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
		int res = 0;
		Map<Integer, Integer> record = new HashMap<>();
		for (int item : nums3) {
			for (int value : nums4) {
				Integer r = record.getOrDefault(item + value, 0) + 1;
				record.put(item + value, r);
			}
		}
		for (int i : nums1) {
			for (int j : nums2) {
				if (record.containsKey(-i - j)) {
					res += record.get(-i - j);
				}
			}
		}
		return res;
	}
}
