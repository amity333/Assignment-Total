package lab8;
//: Exercise 7

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserName_Validation {

	static boolean validate(String str) {

		boolean flag = Pattern.matches("\\w{8,}_job", str);
		if (flag) {
			return true;
			// System.out.println(flag);
		} else {
			return false;
			// System.out.println(flag);
		}

		// return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Username: ");
		String str = sc.nextLine();
		// UserName_Validation s=new UserName_Validation();

		System.out.println(UserName_Validation.validate(str));

		// if(UserName_Validation.validate(str)) {
		// System.out.println("Valid Name");
		// }else {
		// System.out.println("Invalid name");
		// }
	}
}
