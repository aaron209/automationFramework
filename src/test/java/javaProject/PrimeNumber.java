package javaProject;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 7;
		boolean isPrime = true;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("the number is prime");
		} else {
			System.out.println("the number is not prime");

		}
	}
}
