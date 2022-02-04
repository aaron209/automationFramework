package javaProject;

public class SquareNumber {

	public static boolean isSquareNum(int num) {
		boolean result = false;
		for (int i = 1; i < num; i++) {
			if (i * i == num) {
				result = true;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		boolean num = isSquareNum(25);
		System.out.println(num);
	}
}
