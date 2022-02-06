package com.company.linearsearch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsNearbyDuplicate {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		if (k == 0) {
			return false;
		}
		int l = 0;
		int q = -1;
		HashSet<Integer> record = new HashSet<>();
		while (q < nums.length-1) {
			if (record.contains(nums[q + 1])) {
				return true;
			}else {
				if (q - l <= k-1) {
					if (q - l == k-1) {
						record.remove(nums[l++]);
					}
					record.add(nums[++q]);
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		boolean b = new ContainsNearbyDuplicate().containsNearbyDuplicate(new int[]{1, 2, 1}, 0);
		System.out.println(b);
	}
}
