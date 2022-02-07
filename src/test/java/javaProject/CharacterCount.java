package javaProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharacterCount {

	public static void main(String[] args) {
		String name = "abcdadefghehf";
		// out put is =a2bcd2e2f2gh2
		String name1 = "";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] cha = name.toCharArray();
		for (Character ch : cha) {
			if (map.containsKey(ch)) {
				int count = map.get(ch);
				map.put(ch, count + 1);
			} else {
				map.put(ch, 1);
			}
		}
		Set<Character> set = map.keySet();
		for (Character c : set) {
			name1 = name1 + c + map.get(c);
		}
		System.out.println(name1);
	}

}
