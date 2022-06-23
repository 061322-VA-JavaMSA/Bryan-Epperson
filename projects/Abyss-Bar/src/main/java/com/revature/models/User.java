package com.revature.models;


import java.util.Scanner;

import java.util.Objects;

public class User {
	
	static Scanner userInput = new Scanner(System.in);
	
	static String userName;
	static String userPassword;
	static String userPrivilege;
	static int userCredits;
	

	public User() {
		System.out.println("Welcome Miner's to the DRG's Abyss Bar. Please enter your username!");
		String userName = userInput.nextLine();
		System.out.println("Welcome Miner's to the DRG's Abyss Bar. Please enter your password!");
		String userPassword = userInput.nextLine();
		
		newUserCreate(userName, userPassword);
		
			
		}
	public void newUserCreate(String userName, String userPassword) {
		
		System.out.println("Welcome aboard to DRG Abyss Bar " + userName + " We hope you enjoy your stay on Space Rig 17!");
		String userPrivilege = "customer";
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
	}
	
}

