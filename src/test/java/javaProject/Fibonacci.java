package javaProject;

public class Fibonacci {

	public static void main(String[] args) {
		int num = 7, num1 = 1, num2 = 2;
		for (int i = 0; i < num; i++) {
			System.out.println(num1 + "");
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
	}
}
