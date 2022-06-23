package com.revature;

import com.revature.models.User;

import java.util.Scanner;

public class Driver {

	static Scanner choiceInput = new Scanner(System.in); // This is needed to add inputs to our driver
	
	
	public static void main(String[] args) {
				abyssMenu();
		
	}
	
	public static void abyssMenu() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Welcome to DRG's Abyss Bar Menu, how can we get you started today?");
		System.out.println("Please choose a valid input!");
		System.out.println("1: Create a new account.");
		System.out.println("2: Login to your account.");
		System.out.println("3: Exit the Bar.");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		int userChoice = choiceInput.nextInt();
		switch(userChoice) {
		case 1:
			createNewUser();
			abyssMenu();
		case 2:
			loginToAccount();
		case 3:
			System.out.println("Exiting the Abyss Bar, thank you for your patronage");
			System.exit(0);
		default:
			abyssMenu();
		}
	}

	public static void createNewUser(){
		User u = new User();
	}
	
	public static void loginToAccount() {
		
	}
}
