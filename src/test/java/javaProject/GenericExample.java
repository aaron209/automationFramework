package javaProject;

import java.util.ArrayList;
import java.util.List;

public class GenericExample<T> {
	T name;

	public GenericExample(T name) {
		this.name = name;
	}

	public void print() {
		System.out.println(name);
	}

	public static <T> void genericInMethodName(T value) {
		System.out.println(value);
	}

	public static <T> T returnType(T value) {
		return value;
	}

	public static void wildCard(List<?> list) {
		System.out.println(list);
	}

	public static void main(String[] args) {
		GenericExample<String> obj = new GenericExample<String>("this is my name");
		obj.print();
		genericInMethodName(453);
		System.out.println(returnType(34));
		List<Integer> list = new ArrayList<Integer>();
		list.add(54);
		wildCard(list);
	}

}
