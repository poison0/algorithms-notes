package com.company.linearsearch;

public class Palindrome {
	public boolean isPalindrome(String s) {
		char[] chars = s.toCharArray();
		int i = 0;
		int j = chars.length-1;
		while (i < j) {
			if (!isNumOrLetter(chars[i])) {
				i++;
				continue;
			}
			if (!isNumOrLetter(chars[j])) {
				j--;
				continue;
			}
			if (lowCase(chars[i]) != lowCase(chars[j])) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	boolean isNumOrLetter(char i) {
		return (i >= 48 && i <= 57) || (i >= 97 && i <= 122) || (i >= 65 && i <= 90);
	}

	char lowCase(char i) {
		if(i >= 65 && i <= 90){
			return (char) (i + 32);
		}
		return i;
	}

	public static void main(String[] args) {
		boolean palindrome = new Palindrome().isPalindrome(",,,,,,,,,,,,acva");
		System.out.println(palindrome);
	}
}
