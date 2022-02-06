package com.company.linearsearch;

import java.util.HashSet;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> record = new HashSet<>();
		for (int num : nums) {
			if (record.contains(num)) {
				return true;
			}else {
				record.add(num);
			}
		}
		return false;
	}
}
