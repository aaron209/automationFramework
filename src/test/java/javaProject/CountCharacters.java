package javaProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountCharacters {

	public static void main(String[] args) {
		// count characters in string
		String name = "this is my name";
		char[] names = name.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character ch : names) {
			if (map.containsKey(ch)) {
				int count = map.get(ch);
				map.put(ch, count + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);

		// duplicate characters
		Set<Character> set = map.keySet();
		for (Character ch : set) {
			if (map.get(ch) > 1) {
				System.out.println(ch + ": " + map.get(ch));
			}
		}
	}
}
