package com.company.linearsearch;

import java.security.KeyPair;
import java.util.*;

public class LevelOrder {
	public List<List<Integer>> levelOrder(TreeNode root) {
		if (root == null) {
			return Collections.emptyList();
		}
		List<List<Integer>> res = new ArrayList<>();
		Queue<Pair> list = new LinkedList<>();
		list.add(new Pair(root, 0));
		while (!list.isEmpty()) {
			Pair pop = list.poll();
			Integer level = pop.level;
			TreeNode node = pop.node;
			if (res.size() == level) {
				res.add(new ArrayList<>());
			}
			res.get(level).add(node.val);
			if (node.right != null) {
				list.add(new Pair(node.right,level+1));
			}
			if (node.left != null) {
				list.add(new Pair(node.left,level+1));
			}
		}
		return res;
	}
	static class Pair{
		private TreeNode node;
		private Integer level;

		public Pair(TreeNode node, Integer level) {
			this.node = node;
			this.level = level;
		}
	}
}
