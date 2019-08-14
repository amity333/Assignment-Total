package lab5;

import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Choose : \n 1. Red \n 2. Yello \n 3. Green");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choice: ");
		int n = sc.nextInt();

		switch (n) {
		case 1:
			System.out.println("STOP");
			break;

		case 2:
			System.out.println("READY");
			break;

		case 3:
			System.out.println("GO");
			break;
		default:
			System.out.println("Enter the valid input...!!!");
		}

	}

}
