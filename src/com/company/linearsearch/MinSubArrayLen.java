package com.company.linearsearch;

public class MinSubArrayLen {
	public int minSubArrayLen(int target, int[] nums) {
		int i = 0;
		int j = -1; //[i,j]
		int sum = 0;
		int len = nums.length+1;
		while (i < nums.length){
			if (j+1 < nums.length && target > sum) {
				j++;
				sum += nums[j];
			}else {
				sum -= nums[i];
				i++;
			}
			if (sum >= target) {
				if (len > (j - i + 1)) {
					len = j-i+1;
				}
			}
		}
		if (len == nums.length + 1) {
			return 0;
		}
		return len;
	}

	public static void main(String[] args) {
		int i = new MinSubArrayLen().minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
		System.out.println(i);
	}
}
