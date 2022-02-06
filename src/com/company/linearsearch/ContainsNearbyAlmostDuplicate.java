package com.company.linearsearch;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ContainsNearbyAlmostDuplicate {
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		TreeSet<Long> set = new TreeSet<>();
		for (int i = 0; i < nums.length; i++) {
			Long ceiling = set.ceiling((long) nums[i] - (long) t);
			if (ceiling != null && ceiling <= (long) nums[i] + (long) t) {
				return true;
			}
			set.add((long)nums[i]);
			if (set.size() >= k + 1) {
				set.remove((long)nums[i-k]);
			}
		}
		return false;
	}
	public static void main(String[] args) {
		boolean b = new ContainsNearbyAlmostDuplicate().containsNearbyAlmostDuplicate(new int[]{-2147483648,2147483647}, 1,1);
		System.out.println(b);
	}
}
