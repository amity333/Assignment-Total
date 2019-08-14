package lab5;

import java.util.Scanner;

class AgeException extends Exception {
	AgeException() {
		System.out.print("Enter Valid Age");
	}

}

public class Valid_Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Age: ");
		Scanner sc = new Scanner(System.in);
		int ag = sc.nextInt();
		try {
			if (ag < 15) {
				throw new AgeException();

			} else {
				System.out.println("Valid Age");
			}
		} catch (AgeException e) {

		}

	}

}
