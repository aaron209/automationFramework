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

		// count digit
		String digit = "";
		for (int i = 0; i < name.length(); i++) {
			if (Character.isDigit(name.charAt(i))) {
				digit = digit + name.charAt(i);
			}
		}
		System.out.println(digit.length());

		// count digit other way
		int num = 5783;
		int counts = 1;
		while (true) {
			if (num >= 10) {
				num = num / 10;
				counts++;
			} else {
				break;
			}
		}
		System.out.println(counts);

		// count number of even and odd digits
		int num1 = 34528;
		int evenCount = 0;
		int oddCount = 0;
		while (num1 > 0) {
			int rem = num1 % 10;
			if (rem % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
			num1 = num1 / 10;
		}
		System.out.println(evenCount);
		System.out.println(oddCount);

	}
}
