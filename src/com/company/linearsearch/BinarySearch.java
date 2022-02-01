package com.company.linearsearch;

public class BinarySearch {

	int search(int[] arr,int n,int target){
		int l = 0, r = n - 1;//始终查找[l,r]中的内容
		while (l <= r) {
			int mie = (r + l) / 2;
			if (target == arr[mie]) {
				return arr[mie];
			}
			if (target > arr[mie]) {
				l = mie + 1;
			}else {
				r = mie - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int index = new BinarySearch().search(new int[]{1, 2, 3, 4, 5}, 5, 9);
		System.out.println(index);
	}
}
