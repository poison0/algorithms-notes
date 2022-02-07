package com.company.linearsearch;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		traversal(root, res);
		return res;
	}
	void traversal(TreeNode root, List<Integer> list) {
		if (root != null) {
			traversal(root.left,list);
			list.add(root.val);
			traversal(root.right,list);
		}
	}
}
