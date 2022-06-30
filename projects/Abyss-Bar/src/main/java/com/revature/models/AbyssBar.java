package com.revature.models;

import com.revature.models.User;
import com.revature.utils.ConnectionUtil;
import com.revature.Driver;
import java.util.Objects;
import java.util.Scanner;


public class AbyssBar {
	
	private int itmId;
	private String itmName;
	private int amountServed;
	private int drinkCost;
	private String drinkDesc;

	
	static Scanner choiceInput = new Scanner(System.in); // This is needed to add inputs to our driver
	
	
	public static void displayMenu() {
		System.out.println("	Welcome to our bar what would you like to do?	");
		System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
		System.out.println("1.) Display the menu");
		System.out.println("2.) return to Account Options.");
		System.out.println("3.) sign out and return to the main menu.");
		int userInput = choiceInput.nextInt(); // make not to not put scanners before print statements or code you intend to execute.
		choiceInput.nextLine();
		switch(userInput) {
		case 1:
			System.out.println("Displaying menu");
			System.out.println("SQL STATEMENTE HERE");
		case 2:
			System.out.println("Exiting menu....");
		case 3:
			System.out.println("Returning to the main menu!");
			Driver.abyssMenu();
		}
		
	}
	
	public static void createNewItem() {
		System.out.println("----------------------------------------------");
		System.out.println("Hello Miner welcome to the DRG Abyss Bar Menu, what would you like to do?");
		String itmName = choiceInput.next();
		
			
		

		String userPrivilege = "Customer"; // all new users should be set to customers
		int amountServed = 0;
		int drinkCost = 20;
		String drinkDesc = "sample";
		System.out.println("Proceeding to add item..");
		choiceInput.nextLine();
		ConnectionUtil.createNewItem(itmName, amountServed ,drinkCost, drinkDesc);
		
	}
	
	
	
	public int getId() {
		return itmId;
		
	}
	
	public void setId(int itmId) {
		this.itmId = itmId;
	}
	public String getItem() {
		return itmName;
	}
	
	public void setItem(String itemName) {
		this.itmName = itmName;
	}
	
	public int getAmountServed() {
		return amountServed;
	}
	
	public void setAmountServed(int amountServed) {
		this.amountServed = amountServed;
	}
	
	public String getDesc(){
		return drinkDesc;
	}
	
	public void setDesc(String drinkDesc){
		this.drinkDesc = drinkDesc;
	}
	
	public static void tipLLoyd() {
		
	}


	@Override
	public int hashCode() {
		return Objects.hash(amountServed, drinkCost, drinkDesc, itmId, itmName);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbyssBar other = (AbyssBar) obj;
		return amountServed == other.amountServed && drinkCost == other.drinkCost
				&& Objects.equals(drinkDesc, other.drinkDesc) && itmId == other.itmId
				&& Objects.equals(itmName, other.itmName);
	}
	
	
	
}
