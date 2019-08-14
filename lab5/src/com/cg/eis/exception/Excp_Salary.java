package com.cg.eis.exception;

import java.util.Scanner;

class EmployeeException extends Exception{
	EmployeeException()
	{
		System.out.println("You are not Eligible");
	}
}
public class Excp_Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Your Salary: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		try {
			if(n>=3000)
			{
				System.out.println("You are Eligible");
			}
			else {
				throw new EmployeeException();
			}
		}
		catch(EmployeeException e) {}

	}

}
