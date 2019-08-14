package lab4;

import java.util.Scanner;

public class SumCube {

	public int cube(int n) {

		int Temp1;
		int sum = 0;
		while (n > 0) {
			Temp1 = n % 10;
			sum += Math.pow(Temp1, 3);
			n = n / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		SumCube t = new SumCube();
		System.out.println("Sum of the cubes of given number: " + t.cube(n));
	}

}
