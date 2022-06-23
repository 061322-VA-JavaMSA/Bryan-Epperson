package com.revature;


import java.util.Scanner;

public class Driver {

	static Scanner scan; // This is needed to add inputs to our driver
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		String username = null;
		
		
		String password = null;
		
		
		System.out.println("Please enter a username:");
		username = scan.nextLine();
		System.out.println("Please enter a password:");
		password = scan.nextLine();
		
		System.out.println(username + "  " + password);
		
		
		
		
		
	}

}
