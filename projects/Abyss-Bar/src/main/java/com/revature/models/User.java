package com.revature.models;

import com.revature.Driver;

import com.revature.utils.ConnectionUtil;

import com.revature.models.AbyssBar;

import java.util.Scanner;
import java.util.List;
import java.util.Objects;

public class User {
	static User user;
	static Driver driver;
	static AbyssBar abyssBar;
	static Scanner userInput = new Scanner(System.in);
	private int userId;
	private String userName = null;
	private String userPassword = null;
	private String userPrivilege;
	private int userCredits = 0;
	private int userAge = 18;
	

	public User() {

		}

	
	public static void accountOptionsCustomer()
	{
		
		

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Welcome to the Customer menu how can we serve you today?");
		System.out.println("1.) pull up the abyss bar menu.");
		System.out.println("2.) Make an offer.");
		System.out.println("3.) return to Login");
		System.out.println("4.) return to the main menu");
		int userChoice = userInput.nextInt();
		userInput.nextLine();
		switch(userChoice) {
			case 1:
				AbyssBar.displayList();
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				accountOptionsCustomer();
				
			case 2:
				ConnectionUtil.makeDrinkOffer();
				userInput.nextLine();
			case 3:
				userLogin();
			case 4:
				Driver.abyssMenu();
				// make a bid here
		}
		
		
		
		
		
//		int userNewInput = userInput.nextInt();
//		userInput.nextLine();
//		switch(userNewInput) {
//		case 1:
//			System.out.println("Going to the Menu...");
//			System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
//			Driver.callBarMenu();
//		case 2:
//			System.out.println("Going to the Menu...");
//		case 3:
//			System.out.println("Going to the main menu...");
//			
//			Driver.abyssMenu();
//		default:

	}
		
		
		
	
	
	
	public static void accountOptionsEmployee()
	{
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("What would you like to do as an Employee?");
		System.out.println("1.)View Pending Offers");
		System.out.println("2.)Create a new item");
		System.out.println("3.) Log out and return to the main menu.");
		
		int userChoice = userInput.nextInt();
		
		switch(userChoice) {
		case 1:
			ConnectionUtil.viewOfferList();
		case 2:
			AbyssBar.createNewItem();
		case 3:
			ConnectionUtil.editOfferList();
		}




		
		
		
		
	}
	
	
	public static void accountOptionsManager() {
		System.out.println("What would you like to do manager");
		System.out.println("1.) View employees");
		System.out.println("2.) change permissions of employees(Unfinished)");
		
		int userChoice = userInput.nextInt();
		
		switch(userChoice) {
		case 1:
			ConnectionUtil.viewEmployeeList();
		case 2:
			ConnectionUtil.permissionChanger();
		}
		
		
	}
	
	public static void  userLogin() {

		ConnectionUtil.getUserInfo();
//		System.out.println("What would you like to do manager");
//		System.out.println("1.) View employees");
//		System.out.println("2.) change permissions of employees(Unfinished)");
//		
//		int userChoice = userInput.nextInt();
//		
//		switch(userChoice) {
//		case 1:
//			ConnectionUtil.getUserInfo();
//		}
		
		
			
	}
	
	

	
	public static void createNewUser(){
		System.out.println("----------------------------------------------");
		System.out.println("Hello Miner welcome to the DRG Abyss Bar Menu, please enter a username you would like to use");
		String userName = userInput.next();
		
		System.out.println("Now enter a password.");
		String userPassword = userInput.next();
			
		
		int userCredits = 0;
		int userAge = 21;
		String userPrivilege = "Customer"; // all new users should be set to customers
		
		System.out.println("Proceeding to login...");
		userInput.nextLine();
		ConnectionUtil.createUser(userName, userPassword, userAge, userCredits, userPrivilege);
		userLogin();
		
	}
	

	public static void displayList() {
		
		
		
		List<User> userList = ConnectionUtil.selectAllUsers();
		
		for(User users : userList) {
			
			System.out.println("UserId: " +users.getId() +" Username: " +  users.getUserName() + " Userpassword: " + users.getPassword() + " age: " + users.getAge() + " # credits in wallet: " + users.getCredits() + " Current Privilege: " + users.getPrivilege());
		
			
		}
		
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
	
//	public void setCurrentUser(User user) {
//		this.user = user;
//	}
	
	public void setAge(int userAge) {
		this.userAge = userAge;
	}
	
	public int getAge() {
		return userAge;
	}
	
	public void changePrivileges() {
		
	}


	@Override
	public int hashCode() {
		return Objects.hash(userAge, userCredits, userId, userName, userPassword, userPrivilege);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return userAge == other.userAge && userCredits == other.userCredits && userId == other.userId
				&& Objects.equals(userName, other.userName) && Objects.equals(userPassword, other.userPassword)
				&& Objects.equals(userPrivilege, other.userPrivilege);
	}
	
	
}

