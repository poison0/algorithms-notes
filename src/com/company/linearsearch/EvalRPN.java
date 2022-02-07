package com.company.linearsearch;

import java.util.Stack;

public class EvalRPN {
	public int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<>();
		for (String token : tokens) {
			switch (token) {
				case "+" -> {
					Integer p1 = stack.pop();
					Integer p2 = stack.pop();
					stack.push(p2 + p1);
				}
				case "-" -> {
					Integer p1 = stack.pop();
					Integer p2 = stack.pop();
					stack.push(p2 - p1);
				}
				case "*" -> {
					Integer p1 = stack.pop();
					Integer p2 = stack.pop();
					stack.push(p2 * p1);
				}
				case "/" -> {
					Integer p1 = stack.pop();
					Integer p2 = stack.pop();
					stack.push(p2 / p1);
				}
				default -> stack.push(Integer.parseInt(token));
			}
		}
		return stack.pop();
	}
}
