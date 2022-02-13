package com.company.linearsearch;

import java.util.ArrayList;
import java.util.List;

public class PathSum {
	public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		List<List<Integer>> path = new ArrayList<>();
		sum(root, targetSum, 0, new ArrayList<>(), path);
		return path;
	}

	public void sum(TreeNode root,int targetSum,int sum, List<Integer> oneSum,List<List<Integer>> path) {
		if (root != null) {
			sum += root.val;
			oneSum.add(root.val);
			if (root.left == null && root.right == null) {
				if (targetSum == sum) {
					path.add(new ArrayList<>(oneSum));
					oneSum.clear();

				}
			}
			sum(root.left, targetSum, sum, oneSum, path);
			sum(root.right, targetSum, sum, oneSum, path);
		}
	}
}
