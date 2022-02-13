package com.company.linearsearch;

public class SumNumbers {
	int total = 0;
	public int sumNumbers(TreeNode root) {
		numbers(0,root);
		return total;
	}

	public void numbers(int sum,TreeNode root) {
		if (root != null) {
			sum = sum* 10 + root.val ;
			if (root.left == null && root.right == null) {
				total += sum;
			}
			numbers(sum, root.left);
			numbers(sum, root.right);
		}
	}
}
