package com.company.linearsearch;

public class IsBalanced {
	public boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}

		return 	Math.abs(balanced(root.left) - balanced(root.right)) <= 1
				&& isBalanced(root.left)
				&& isBalanced(root.right);
	}

	public int balanced(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(balanced(root.left),balanced(root.right));
	}
}
