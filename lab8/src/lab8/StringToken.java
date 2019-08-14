package lab8;
// : Exercise 1

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		int temp=0;
		System.out.println("Enter String :");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			n =Integer.parseInt(st.nextToken());
			System.out.println(n);
			temp=temp+n;
		}

		System.out.println("Sum of String : " + temp);
	}
}
