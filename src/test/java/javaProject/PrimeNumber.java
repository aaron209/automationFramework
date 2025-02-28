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

	// prime number from the array
	public void is_prime_number(int[] num) {

		for (int j = 0; j < num.length; j++) {
			boolean isPrime = true;
			for (int i = 2; i < num[j] / 2; i++) {
				if (num[j] % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(num[j] + "The number is prime");
			} else {
				System.out.println(num[j] + "the number is not prime");
			}
		}
	}
}
