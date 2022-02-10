package com.company.linearsearch;

import com.sun.source.tree.Tree;

public class InvertTree {
	public TreeNode invertTree(TreeNode root) {
		invert(root);
		return root;
	}

	private void invert(TreeNode root) {
		if (root == null) {
			return;
		}
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		invert(root.left);
		invert(root.right);
	}
}
