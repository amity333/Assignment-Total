package lab5;

import java.util.Scanner;

public class PrimeNo {
	public void Prime(int n) {
		// boolean prime=true;
		for (int i = 2; i <= n; i++) {
			boolean prime = true;
			for (int j = 2; j <= i - 1; j++) {
				if (i % j == 0) {
					prime = false;
					// break;
				}

			}
			if (prime)
				System.out.print(i + " ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int n=20;
		System.out.println("Enter number ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PrimeNo P = new PrimeNo();
		P.Prime(n);

	}

}
