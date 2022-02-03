package com.company.linearsearch;

import java.util.Arrays;

public class Solution {
	//167
	public int[] twoSum(int[] numbers, int target) {
		for(int i = 0;i<numbers.length;i++){
			int s = binarySearch(numbers,i,target-numbers[i]);
			if(s != -1){
				return new int[]{i,s};
			}
		}
		return null;
	}
	int binarySearch(int[] numbers, int n, int target){
		int i = n+1;//[i,j]
		int j = numbers.length-1;
		while(i<=j){
			int mid = i + (j - i)/2;
			if(numbers[mid] == target){
				return mid;
			}
			if(numbers[mid] < target){
				i = mid+1;
			}
			if(numbers[mid] > target){
				j = mid - 1;
			}
		}
		return -1;
	}

	public int[] twoSum2(int[] numbers, int target) {
		int i = 0;
		int j = numbers.length-1;
		while (i<j){
			int num = numbers[i] + numbers[j];
			if(target > num){
				i++;
			} else if (target < num) {
				j--;
			}else {
				return new int[]{i + 1, j + 1};
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int[] ints = new Solution().twoSum2(new int[]{2, 3, 4},6);
		System.out.println(Arrays.toString(ints));
	}

}

