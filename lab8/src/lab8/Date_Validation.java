package lab8;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

//Exercise 6:

public class Date_Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
		int y = sc.nextInt();
		System.out.println("Enter month");
		int m = sc.nextInt();
		System.out.println("ENter date");
		int d = sc.nextInt();
		LocalDate input = LocalDate.of(y, m, d);
		LocalDate systemdate = LocalDate.now();

		Period diff = Period.between(input, systemdate);

		System.out.printf("\nDifference is %d years, %d months and %d days \n\n", diff.getYears(), diff.getMonths(),
				diff.getDays());


	}

}
