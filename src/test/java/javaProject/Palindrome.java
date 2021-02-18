package javaProject;

public class Palindrome {

	public static void main(String[] args) {
		String name = "madam";
		String name1 = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			name1 = name1 + name.charAt(i);
		}
		if (name.equals(name1)) {
			System.out.println("the string is palindrome");
		} else {
			System.out.println("the string is not palindrome");

		}
	}
}
