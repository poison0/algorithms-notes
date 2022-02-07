package com.company.linearsearch;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		traversal(root, res);
		return res;
	}

	void traversal(TreeNode root, List<Integer> list) {
		if (root != null) {
			list.add(root.val);
			traversal(root.left,list);
			traversal(root.right,list);
		}
	}
}
