package lab5;

import java.util.Scanner;

class firstNameException extends Exception {
	firstNameException() {
		System.out.println("Last Name Missing...!");
	}
}

class lastNameException extends Exception {
	lastNameException() {
		System.out.println("Last Name Missing...!");
	}

}

public class Validate_Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name:");
		String frstName = sc.nextLine();
		System.out.println("Enter Second Name");
		String lstName = sc.nextLine();

		try {
			if (frstName.isEmpty()) {
				throw new firstNameException();
			}
		} catch (firstNameException ex) {

		}
		try {
			if (lstName.isEmpty()) {
				throw new lastNameException();
			}
		} catch (lastNameException ex) {

		}

		System.out.println("Full Name is: " + frstName + " " + lstName);

	}

}
