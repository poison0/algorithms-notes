package com.company.linearsearch;

public class IsSymmetric {
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}
		if (root.left == null || root.right == null) {
			if (root.left != null || root.right != null) {
				return false;
			}
		}
		return symmetric(root.left,root.right);
	}

	public boolean symmetric(TreeNode p,TreeNode q) {
		if (p == null && q == null) {
			return true;
		}else if (p == null) {
			return false;
		}else if (q == null) {
			return false;
		}
		return p.val == q.val && symmetric(p.left,q.right) && symmetric(p.right,q.left);
	}
}
