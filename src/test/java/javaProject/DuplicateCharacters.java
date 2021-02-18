package javaProject;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// duplicate characters
		String name = "thisismyname";
		System.out.println("the duplicate characters are:");
		for (int i = 0; i < name.length(); i++) {
			for (int j = i + 1; j < name.length(); j++) {
				if (name.charAt(i) == name.charAt(j)) {
					System.out.println(name.charAt(i));
				}
			}
		}
		// remove duplicate characters
		System.out.println("after removing duplicate characters");
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < name.length(); i++) {
			if (set.add(name.charAt(i)) == true) {
				System.out.print(name.charAt(i));
			}

		}

	}
}