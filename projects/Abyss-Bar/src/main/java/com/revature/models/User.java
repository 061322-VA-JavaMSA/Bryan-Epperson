package com.revature.models;

import com.revature.Driver;
import com.revature.models.AbyssBar;

import java.util.Scanner;

import java.util.Objects;

public class User {
	static User user;
	static Driver driver;
	static AbyssBar abyssBar;
	static Scanner userInput = new Scanner(System.in);
	private static int userId;
	private static String userName = "admin";
	private static String userPassword = "pass";
	private static String userPrivilege = "Customer";
	private static int userCredits;
	

	public User(User user) {
		System.out.println("Welcome Miner's to the DRG's Abyss Bar. Please enter your username!");
		String userName = userInput.nextLine();
		setUserName(userName);
		System.out.println("Welcome Miner's to the DRG's Abyss Bar. Please enter your password!");
		String userPassword = userInput.nextLine();
		setPassword(userPassword);
		System.out.println("userName: " + userName);
		System.out.println("userPassword: " + userPassword);
		}

	
	public static void accountOptionsCustomer()
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Welcome " + user + "welcome to the account menu how can we serve you today?");
		System.out.println("1.) pull up the abyss bar menu.");
		System.out.println("2.) add credits to your wallet.");
		System.out.println("3.) Log out and return to the main menu.");
		int userNewInput = userInput.nextInt();
		userInput.nextLine();
		switch(userNewInput) {
		case 1:
			System.out.println("Going to the Menu...");
			System.out.println("User has chosen 1");
			abyssBar.displayCurrentItems();
		case 2:
			System.out.println("Going to the Menu...");
		case 3:
			System.out.println("Going to the main menu...");
			Driver.abyssMenu();
		default:

		}
		
		
		
	}
	
	public static void  userLogin() {
		System.out.println("userName: " + userName);
		System.out.println("userPassword: " + userPassword);
		System.out.println("userPrivilege: " + userPrivilege);
		System.out.println("Please enter your credientals");
		System.out.println("Enter your Username");
		String userField = userInput.nextLine();
		System.out.println("Enter your Password");
		String passwordField = userInput.nextLine();
		if(userName == null && userPassword == null) {
			System.out.println("Please do not leave the fields blank");
			userLogin();
		}

		if(userField.equals(userName)) {
			System.out.println("The username is correct!");
			if(passwordField.equals(userPassword)) {
				System.out.println("password is correct");
				switch(userPrivilege){
				case "Customer":
					System.out.println("User is a customer, redirecting to customer options");
					accountOptionsCustomer();
				case "Employee":
					System.out.println("User is a Employee, redirecting to Employee options");
					
				case "Manager":
					System.out.println("User is a Manager, redirecting to Manager Options");
				}
				
			}
		}
		else {
			System.out.println("Please enter the correct credentials");
			userLogin();
		}
			
	}
	
	

	
	public static User createNewUser(User user){
		 user = new User(user);
		 System.out.println(user);
		return user;
	}
	
	public void resetAccountState(int userId, String userName, String userPassword, int userCredits, String userPrivilege) {
		this.userId = 0;
		this.userName = null;
		this.userPassword = null;
		this.userCredits = 0;
		this.userPrivilege = null;
	}
	
	public int getId() {
		return this.userId; 
	}
	
	public void setId(int userId) {
		this.userId = userId; 
	}
	
	public String getUserName() {
		return this.userName; 
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return this.userPassword;
	}
	
	public void setPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	public int getCredits() {
		return this.userCredits;
	}
	
	public void setCredits(int userCredits) {
		this.userCredits = userCredits;
	}
	
	public String getPrivilege() {
		return this.userPrivilege;
	}
	
	public void setPrivilege(String userPrivilege) {
		this.userPrivilege = userPrivilege;
	}
	
	public static User getCurrentUser() {
		return user;
	}
	
	public void setCurrentUser(User currentUser) {
		this.user = user;
	}
	
	public void changePrivileges() {
		
	}
	
	
}

