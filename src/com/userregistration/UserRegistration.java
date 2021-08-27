package com.userregistration;
import java.util.Scanner;

public class UserRegistration {
	public static void main(String[] args) {
		String regex = "^[A-Z][a-z]{3,}";
		Scanner sc = new Scanner(System.in);
		System.out.println("Validate 1.Firstname 2.Lastname");
		int option = sc.nextInt();
		switch(option) {
			case 1:
				String str = sc.nextLine();
				if (str.replace(" ", "").matches(regex)) System.out.println("Firstname is valid.");
				else System.out.println("Firstname is not valid.");
				break;
			
			case 2:
				String str1 = sc.nextLine();
				if (str1.replace(" ", "").matches(regex)) System.out.println("Lastname is valid.");
				else System.out.println("Lastname is not valid.");
				break;
				
			default:
				break;
		}
		
	}
}
