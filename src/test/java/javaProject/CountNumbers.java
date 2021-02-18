package javaProject;

public class CountNumbers {

	public static void main(String[] args) {
		String name = "this is my name123";
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(count);

		// count only characters
		int count1 = 0;
		for (int j = 0; j < name.length(); j++) {
			if (Character.isLetter(name.charAt(j))) {
				count1++;
			}
		}
		System.out.println(count1);
	}
}
