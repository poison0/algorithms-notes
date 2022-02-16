package com.company.linearsearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LetterCombinations {
	String[][] letterMap = new String[][]{{"a", "b", "c"}, {"d", "e", "f"}
			, {"g", "h", "i"}, {"j", "k", "l"}, {"m", "n", "o"},
			{"p", "q", "r", "s"}, {"t", "u", "v"}, {"w", "x", "y", "z"}};
	List<String> res = new ArrayList<>();
	public List<String> letterCombinations(String digits) {

		if (digits == null || "".equals(digits)) {
			return res;
		}

		String[] split = digits.split("");
		combination(split, 0, "");
		return res;
	}

	private void combination(String[] split,int digitsIndex,String str) {
		if (digitsIndex == split.length) {
			res.add(str);
			return;
		}
		String[] letter = letterMap[Integer.parseInt(split[digitsIndex]) - 2];
		for (int i = 0; i < letter.length; i++) {
			combination(split, digitsIndex + 1, str + letter[i]);
		}
	}

	public static void main(String[] args) {
		List<String> list = new LetterCombinations().letterCombinations("2353");
		System.out.println(list);
	}
}
