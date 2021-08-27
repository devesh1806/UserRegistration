package com.userregistration;
import java.util.Scanner;

public class UserRegistration {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Validate 1.Firstname 2.Lastname 3.EmailID 4.Mobile Number");
		int option = sc.nextInt();
		switch(option) {
			case 1:
				String dummy = sc.nextLine();
				String str = sc.nextLine();
				String regex = "^[A-Z][a-z]{3,}";
				if (str.matches(regex)) System.out.println("Firstname is valid.");
				else System.out.println("Firstname is not valid.");
				break;
			
			case 2:
				String dummy1 = sc.nextLine();
				String str1 = sc.nextLine();
				String regex1 = "^[A-Z][a-z]{3,}";
				if (str1.matches(regex1)) System.out.println("Lastname is valid.");
				else System.out.println("Lastname is not valid.");
				break;
				
			case 3:
				String dummy2 = sc.nextLine();
				String str2 = sc.nextLine();
				String regex2 = "^[A-Z]?[a-z]{3,}[.-_+]?[0-9a-zA-Z]{0,}@[A-Za-z0-9]{1,}.[a-z]{2,}[.]?([a-z]{2})?$";
				if (str2.matches(regex2)) System.out.println("EmailID is valid.");
				else System.out.println("EmailID is not valid.");
				break;
				
			case 4:
				String dummy3 = sc.nextLine();
				String str3 = sc.nextLine();
				String regex3 = "^[0-9-]{1,}\\s[0-9]{10}$";
				if (str3.matches(regex3)) System.out.println("Mobile Number is valid.");
				else System.out.println("Mobile Number is not valid.");
				break;
				
			default:
				break;
		}
		
	}
}