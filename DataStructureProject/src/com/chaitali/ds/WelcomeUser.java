package com.chaitali.ds;

import java.util.Scanner;

public class WelcomeUser {
	public static void main(String[] args) {
		
		//que6//
		Scanner scanner = new Scanner(System.in);
		String username = "a";
		String password = "b";

		int count = 0;
		do {
			System.out.println("Enter username and password");
			String uname = scanner.next();
			String upass = scanner.next();
			if (uname.equals(username) && upass.equals(password))

			{
				System.out.println("Welcome " + username);
				break;
			}
			count++;
		} while (count < 3);

		if (count == 3) {
			System.out.println("contact admin");
		}
	}
}