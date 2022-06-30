package com.revature;

import com.revature.models.User;
import com.revature.models.AbyssBar;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
import com.revature.utils.ConnectionUtil;


import java.util.Scanner;

public class Driver {

	static Scanner choiceInput = new Scanner(System.in); // This is needed to add inputs to our driver
	static User user;
	static AbyssBar barMenu;
	
	
	
	
	public static void main(String[] args) {
		try {
			ConnectionUtil.getDatabaseConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
			user.createNewUser();
//			System.out.println("current user is:"+ user.getCurrentUser());
			abyssMenu();
		case 2:
			ConnectionUtil.getUserInfo();
			
		case 3:
			System.out.println("Exiting the Abyss Bar, thank you for your patronage");
		default:
			abyssMenu();
			choiceInput.close();
		}
	}
	
	public static void callBarMenu() {
		
		AbyssBar.displayMenu();
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
