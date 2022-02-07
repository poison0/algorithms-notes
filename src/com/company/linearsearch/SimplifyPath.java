package com.company.linearsearch;

import org.w3c.dom.ls.LSOutput;

import java.util.Stack;

public class SimplifyPath {
	public String simplifyPath(String path) {
		Stack<String> stack = new Stack<>();
		String[] split = path.split("/");
		for (String s : split) {
			if (s.equals("..")) {
				if (stack.size() > 0) {
					stack.pop();
				}
			}
			if (!s.equals(".") && !s.equals("") && !s.equals("..")) {
				stack.push(s);
			}
		}
		StringBuilder res = new StringBuilder();
		for (String s : stack) {
			res.append("/").append(s);
		}
		if (res.length() == 0) {
			res.append("/");
		}
		return res.toString();
	}

	public static void main(String[] args) {
		System.out.println(new SimplifyPath().simplifyPath("/../"));
	}
}
