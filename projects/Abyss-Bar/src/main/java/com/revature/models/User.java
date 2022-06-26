package com.revature.models;

import com.revature.Driver;

import java.util.Scanner;

import java.util.Objects;

public class User {
	static User user;
	static Driver driver;
	static Scanner userInput = new Scanner(System.in);
	private static int userId;
	private static String userName = null;
	private static String userPassword = null;
	private static String userPrivilege;
	private static int userCredits;
	

	public User() {
		System.out.println("Welcome Miner's to the DRG's Abyss Bar. Please enter your username!");
		String userName = userInput.nextLine();
		setUserName(userName);
		System.out.println("Welcome Miner's to the DRG's Abyss Bar. Please enter your password!");
		String userPassword = userInput.nextLine();
		setPassword(userPassword);
		
		newUserCreate(userName, userPassword);
		
		System.out.println("userName: " + userName);
		System.out.println("userPassword: " + userPassword);
		}
	public void newUserCreate(String userName, String userPassword) {
		
		System.out.println("Welcome aboard to DRG Abyss Bar " + userName + " We hope you enjoy your stay on Space Rig 17!");
		setPrivilege("Customer");
		getUserName();
		getPassword();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
	
	public static void  userLogin() {
		System.out.println("userName: " + userName);
		System.out.println("userPassword: " + userPassword);
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
			if(passwordField.equals(userPassword)) {
				accountOptions();
				userInput.close();
			}
		}
	}
	
	
	public static void accountOptions()
	{
		int userChoice = userInput.nextInt();
		userInput.nextLine();
		if(userPrivilege == "Customer") {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("What would you like to do user?");
			System.out.println("1.) Log out and back to the main menu?");
			System.out.println("2.) Go to the bar and get some drinks?");
			System.out.println("3.) View current information about your account.");
			switch(userChoice) {
			case 1:			
			driver.abyssMenu();
			case 2:
			User.userLogin();
			case 3:
			System.out.println("Exiting the Abyss Bar, thank you for your patronage");
			System.exit(0);
			default:

			}
			
		}
		
		
		
		
	}
	
	public static User createNewUser(User u){
		 u = new User();
		return u;
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
	
	public void changePrivileges() {
		
	}
	
	
}

