package javaProject;

public class NestedLoop {

	public static void main(String[] args) {

		// pyramid
		int k = 10;
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(k);
				System.out.print("\t");
			}
			System.out.println("");
			k++;
		}

		// different way
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.println("");
		}
		// pascal triangle
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(" " + ncr(i, j));
			}
			System.out.println();
		}
	}

	public static int fact(int num) {
		int factorial;
		for (factorial = 1; num > 1; num--) {
			factorial *= num;
		}
		return factorial;
	}

	public static int ncr(int n, int r) {
		return fact(n) / (fact(n - r) * fact(r));
	}

}
