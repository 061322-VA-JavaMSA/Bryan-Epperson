package com.revature;

import com.revature.models.User;

import java.util.Scanner;

public class Driver {

	static Scanner choiceInput = new Scanner(System.in); // This is needed to add inputs to our driver
	static User user;
	
	public static void main(String[] args) {
				User currentUser = new User();
				abyssMenu();
//				User currentUser = createNewUser();
		
	}
	
	public static void abyssMenu() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Welcome to DRG's Abyss Bar Menu, how can we get you started today?");
		System.out.println("Please choose a valid input!");
		System.out.println("1: Create a new account.");
		System.out.println("2: Login to your account.");
		System.out.println("3: Exit the Bar.");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		int userChoice = choiceInput.nextInt(); //this parses the next int not the next line.
		choiceInput.nextLine();
		switch(userChoice) {
		case 1:
			user.createNewUser(user);
			abyssMenu();
		case 2:
			user.userLogin();
		case 3:
			System.out.println("Exiting the Abyss Bar, thank you for your patronage");
		default:
			abyssMenu();
			choiceInput.close();
		}
	}

//	public static void accountOptions() {
//		int userChoice = choiceInput.nextInt();
//		choiceInput.nextLine();
//		if(userPrivilege == "Customer") {
//			System.out.println("Welcome customer! What would you like to do today");
//			System.out.println("1: Go to the AbyssBar menu");
//			System.out.println("2: Add credits to your wallet.");
//			System.out.println("3: Logout and return to the main menu.");
//			if(userChoice == 1) {
//				System.out.println("Welcome to the bar, here is the menu!");
//				System.out.println("This feature needs to be added");
//				
//			}
//			if(userChoice == 2) {
//				System.out.println("How much credits would you like to add to your account?");
//				System.out.println("This feature needs to be added");
//			}
//			if(userChoice == 3) {
//				System.out.println("returning to the main menu!");
//				abyssMenu();
//			}
//			else
//				System.out.println("invalid credentials");
//				accountOptions();
//		}
//		if(userPrivilege == "Manager") {
//			System.out.println("Welcome Manager! What would you like to do today");
//		}
		
	
	
}
