package com.company.linearsearch;

public class SumOfLeftLeaves {
	public int sumOfLeftLeaves(TreeNode root) {
		if(root == null){
			return 0;
		}
		if (root.left == null && root.right == null) {
			return root.val;
		}
		return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.left);
	}
}
