package javaProject;

public class AddAndFactorial {

	public static void main(String[] args) {
		// addition
		int[] num = { 4, 7, 6, 9 };
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println(sum);

		// factorial
		int nums = 5;
		int fact = 1;
		for (int i = 1; i <= nums; i++) {
			fact = fact * i;
		}
		System.out.println(fact);

		// missing number
		int[] numbers = { 1, 2, 3, 5, 6 };
		int sumNum = 0;
		int sumNum1 = 0;
		for (int i = 0; i < numbers.length; i++) {
			sumNum = sumNum + numbers[i];
		}
		for (int i = 1; i <= 6; i++) {
			sumNum1 = sumNum1 + i;
		}
		System.out.println(sumNum1 - sumNum);
	}
}
