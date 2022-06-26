package com.revature.models;


import com.revature.Driver;
import java.util.Objects;
import java.util.Scanner;


public class AbyssBar {
	
	
	static Scanner choiceInput = new Scanner(System.in); // This is needed to add inputs to our driver
	
	public static void displayCurrentItems() {
		int userInput = choiceInput.nextInt();
		choiceInput.nextLine();
		System.out.println("Welcome to our bar here is what is currently on the menu.(Please note the menu is always susecptile to change)");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Item here");
		System.out.println("Bar Menu.");
		Driver.abyssMenu();
		
	}
	
}
