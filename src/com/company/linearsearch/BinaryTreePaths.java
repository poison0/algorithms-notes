package com.company.linearsearch;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> record = new ArrayList<>();
		treePaths(root,"", record);
		return record;
	}

	public void treePaths(TreeNode root, String path,List<String> record) {
		if (root == null) {
			return;
		}
		path += root.val;
		if (root.left == null && root.right == null) {
			record.add(path);
		}
		path += "->";
		treePaths(root.left,path,record);
		treePaths(root.right,path,record);
	}
}
