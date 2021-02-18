package javaProject;

public class Reverse {

	public static void main(String[]args) {
		String name = "kishor";
		StringBuffer str = new StringBuffer(name);
		System.out.println(str.reverse());
		
		//other way
		for(int i =name.length()-1; i>=0; i--) {
			System.out.println(name.charAt(i));
		}
		
		int num = 462;
		String strNum = String.valueOf(num);
		StringBuffer str1 = new StringBuffer(strNum);
		System.out.println(str1.reverse());
	}
}
