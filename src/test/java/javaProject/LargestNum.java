package javaProject;

public class LargestNum {

	public static void main(String[] args) {
		// single array
		int[] num = { 4, 7, 1, 9 };
		int largestNum = num[0];
		int smallestNum = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > largestNum) {
				largestNum = num[i];
			} else if (num[i] < smallestNum) {
				smallestNum = num[i];
			}
		}
		System.out.println(largestNum);

		// multi dimensional array
		int[][] num1 = { { 4, 8, 9 }, { 5, 2, 1 } };
		int minNum = num1[0][0];
		int maxNum = num1[0][0];
		int colNum = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				if (num1[i][j] > maxNum) {
					maxNum = num1[i][j];
				} else if (num1[i][j] < minNum) {
					minNum = num1[i][j];
					colNum = j;

				}
			}
		}
		System.out.println(minNum);
		System.out.println(colNum);

		// print largest num from column where the smallest value is
		int maxNumInColumn = num1[0][colNum];
		int k = 0;
		while (k < 2) {
			if (num1[k][colNum] > maxNumInColumn) {
				maxNumInColumn = num1[k][colNum];
			}
			k++;
		}
		System.out.println(maxNumInColumn);
	}
}
