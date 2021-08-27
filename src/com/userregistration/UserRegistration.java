package com.userregistration;
import java.util.Scanner;

public class UserRegistration {
	public static void main(String[] args) {
		String regex = "^[A-Z][a-z]{3,}";
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if (str.matches(regex)) System.out.println("Firstname is valid.");
		else System.out.println("Firstname is not valid.");
	}
}
