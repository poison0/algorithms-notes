package com.company.linearsearch;

public class SearchInsert {
	public int searchInsert(int[] nums, int target) {
		int l = 0;
		int r = nums.length-1;
		int mid;
		while (l <= r) {
			mid = l + (r - l) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			if (nums[mid] < target) {
				l = mid + 1;
			}
			if (nums[mid] > target) {
				r = mid -1;
			}
		}
		return l;
	}

	public static void main(String[] args) {
		int i = new SearchInsert().searchInsert(new int[]{1,3,5,6}, 5);
		System.out.println(i);
	}
}
