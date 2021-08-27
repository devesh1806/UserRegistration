package com.userregistration;
import java.util.Scanner;

public class UserRegistration {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Validate 1.Firstname 2.Lastname 3.EmailID 4.Mobile Number 5.Password");
		int option = sc.nextInt();
		switch(option) {
			case 1:
				String dummyFirst = sc.nextLine();
				String strFirst = sc.nextLine();
				String regexFirst = "^[A-Z][a-z]{3,}";
				if (strFirst.matches(regexFirst)) System.out.println("Firstname is valid.");
				else System.out.println("Firstname is not valid.");
				break;
			
			case 2:
				String dummyLast = sc.nextLine();
				String strLast = sc.nextLine();
				String regexLast = "^[A-Z][a-z]{3,}";
				if (strLast.matches(regexLast)) System.out.println("Lastname is valid.");
				else System.out.println("Lastname is not valid.");
				break;
				
			case 3:
				String dummyEmail = sc.nextLine();
				String strEmail = sc.nextLine();
				String regexEmail = "^[A-Z]?[a-z]{2,}[.+_-]?[0-9a-zA-Z]{0,}@[A-Za-z0-9]{1,}.[a-z]{2,}[.]?([a-z]{2,})?$";
				if (strEmail.matches(regexEmail)) System.out.println("EmailID is valid.");
				else System.out.println("EmailID is not valid.");
				break;
				
			case 4:
				String dummyMobile = sc.nextLine();
				String strMobile = sc.nextLine();
				String regexMobile = "^[0-9-]{1,}\\s[0-9]{10}$";
				if (strMobile.matches(regexMobile)) System.out.println("Mobile Number is valid.");
				else System.out.println("Mobile Number is not valid.");
				break;
				
			case 5:
				String dummyPassword = sc.nextLine();
				String strPassword = sc.nextLine();
				String rule = "^(?=.{8,}$)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).*$";
				if (strPassword.matches(rule)) System.out.println("Password Rule 1,2,3,4 are valid.");
				else System.out.println("Password Rule 1,2,3,4 are not valid.");
				break;
				
			default:
				break;
		}
		
	}
}