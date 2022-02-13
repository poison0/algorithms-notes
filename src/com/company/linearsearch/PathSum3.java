package com.company.linearsearch;

public class PathSum3 {
	public int pathSum(TreeNode root, int targetSum) {
		if (root == null) {
			return 0;
		}
		int res = path(root,targetSum);
		res += pathSum(root.left, targetSum);
		res += pathSum(root.right, targetSum);
		return res;
	}
	public int path(TreeNode root, int targetSum) {
		if (root == null) {
			return 0;
		}
		int res = 0;
		if (targetSum == root.val) {
			res += 1;
		}
		res += path(root.left, targetSum - root.val);
		res += path(root.right, targetSum - root.val);
		return res;
	}
}
