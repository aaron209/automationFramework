package javaProject;

public class Capitalize {

	public static void main(String[] args) {
		String name, firstname, firstName, lastname, lastName, firstLastName;
		name = "kishor subedi";
		String names[] = name.split(" ");
		firstname = names[0];
		firstName = firstname.substring(0, 1).toUpperCase() + firstname.substring(1);
		lastname = names[1];
		lastName = Character.toUpperCase(lastname.charAt(0)) + lastname.substring(1);
		// lastName = lastname.substring(0,1).toUpperCase()+lastname.substring(1);
		firstLastName = firstName + " " + lastName;
		System.out.println(firstLastName);
	}
}
