package javaProject;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

	// longest sub string with no repetition
	public static String longestSubStrings(String str) {
		Set<Character> set = new HashSet<Character>();
		String longestTillNow = "";
		String longestOverall = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (set.contains(ch)) {
				longestTillNow = "";
				set.clear();
			}
			set.add(ch);
			longestTillNow += ch;
			if (longestTillNow.length() > longestOverall.length()) {
				longestOverall = longestTillNow;
			}
		}
		return longestOverall;
	}

	public static void main(String[] args) {
		System.out.println(longestSubStrings("kishorsubedi"));
	}
}
