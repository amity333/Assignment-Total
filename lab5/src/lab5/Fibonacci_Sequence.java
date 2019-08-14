package lab5;

import java.util.Scanner;

public class Fibonacci_Sequence {
	
	int nfib(int n) {
		
		int a=1, b=1, c=0;
		for(int i=1;i<=n;i++) {
			a=b;
			b=c;
			c=a+b;
		}
		return c;
	}
	int rfib(int n) {
		if(n==1) {
			return 1;
		}
		else if(n==2) {
			return 1;
		}
		else
			return (rfib(n-1)+rfib(n-2));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Fibonacci_Sequence fb = new Fibonacci_Sequence();
		System.out.println("nonrecursive: "+fb.nfib(n));
		System.out.println("recursive: "+fb.rfib(n));

	}

}
