package javaProject;

import java.util.ArrayList;
import java.util.List;

public class Parse {

	public static void main(String[] args) {

		// converting int array to String list
		int[] num = { 4, 2, 7, 8 };
		List<String> list = new ArrayList<>();

		for (int i = 0; i < num.length; i++) {
			list.add(String.valueOf(num[i])); // converting into list
			String.valueOf(num[i]); // converting into string
		}
		System.out.println(list);
	}
}
