package javaProject;

public class Reverse {

	public static void main(String[] args) {
		String name = "kishor";
		StringBuffer str = new StringBuffer(name);
		System.out.println(str.reverse());

		// other way
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.println(name.charAt(i));
		}

		int num = 462;
		String strNum = String.valueOf(num);
		StringBuffer str1 = new StringBuffer(strNum);
		System.out.println(str1.reverse());

		// reverse elements of array
		int[] nums = { 23, 54, 67, 45 };
		for (int i = nums.length - 1; i >= 0; i--) {
			System.out.println(nums[i]);
		}
		
		// reverse only letters
		String nameReverse = "abcd563efgh673xyz890";
		String[] namesReverse = nameReverse.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
		StringBuilder builder = new StringBuilder();
		for (String names : namesReverse) {
			try {
				Integer.parseInt(names);
				builder.append(names);
			} catch (Exception e) {
				builder.append(new StringBuilder(names).reverse());
			}
		}
		System.out.println(builder);
	}
}
