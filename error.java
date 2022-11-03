package Thursday_Exercises;

import java.util.Scanner;

public class error {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password, confirm_password;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your password :");
		password= sc.next();
		System.out.println("re-enter your password :");
		confirm_password = sc.next();
		if (password.equals(confirm_password))
		{
			System.out.println("Password matched");
			
		}
		else
			System.out.println("Password is wrong");
	}

}