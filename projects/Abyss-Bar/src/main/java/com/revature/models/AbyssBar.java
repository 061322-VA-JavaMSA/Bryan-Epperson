package com.revature.models;

import com.revature.models.User;
import com.revature.Driver;
import java.util.Objects;
import java.util.Scanner;


public class AbyssBar {
	
	
	static User currentUser;
	
	static Scanner choiceInput = new Scanner(System.in); // This is needed to add inputs to our driver
	
	
	public static void displayCurrentItems() {
		System.out.println("This function has been called!");
		currentUser.setCurrentUser(currentUser);
		currentUser.getCurrentUser();
		System.out.println("Current User:" + currentUser.getUserName());
		int userInput = choiceInput.nextInt();
		choiceInput.nextLine();
		System.out.println("Welcome to our bar here is what is currently on the menu.(Please note the menu is always susecptile to change)");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Item here");
		System.out.println("Bar Menu.");
		
	}
	
	
	public void setCurrentUser(User currentUser) {
		System.out.println("Current User has been set");
		this.currentUser = currentUser;
	}
	
	public static void tipLLoyd() {
		
	}
	
	
	
}
