package javaProject;

public class Singleton {

	private static Singleton singleInstance = null;

	private Singleton() {

	}

	public static synchronized Singleton getInstance() {
		if (singleInstance == null) {
			singleInstance = new Singleton();
		}
		return singleInstance;

	}

	/*
	 * A singleton class has only one object or instance of class at a time.The
	 * primary purpose of a java Singleton class is to restrict the limit of the
	 * number of object creations to only one.
	 */

	/*
	 * The below can be implemented for Singleton class: Singleton firstInstance =
	 * Singleton.getInstance(); Singleton secondInstance = Singleton.getInstance();
	 * 
	 * System.out.println(firstInstance.hashCode());
	 * System.out.println(secondInstance.hashCode());
	 */

}
