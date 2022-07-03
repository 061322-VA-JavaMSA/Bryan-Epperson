package com.revature.models;

import com.revature.models.User;
import com.revature.utils.ConnectionUtil;
import com.revature.Driver;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;


public class AbyssBar {
	
	private int itmId;
	private String itmName = null;
	private int amountServed;
	private int drinkCost;
	private String drinkDesc;

	
	static Scanner choiceInput = new Scanner(System.in); // This is needed to add inputs to our driver
	
	

	
	public static void displayList() {
		
		
		
		List<AbyssBar> abyssBarList = ConnectionUtil.selectAll();
		
		for(AbyssBar abyssBar : abyssBarList) {
			
			System.out.println("DrinkID: "+abyssBar.getId() + "," +"Item Name: "+ abyssBar.getItem() + "," +"AmountServed: " + abyssBar.getAmountServed() + "," + "Drink Cost: " + abyssBar.getDrinkCost() + ","   + "Desc: " + abyssBar.getDesc());
			
		}
		
	}
	
	public static void createNewItem() {
		System.out.println("----------------------------------------------");
		System.out.println("Hello Miner welcome to the DRG Abyss Bar Menu, what would you like to do?");
		String itmName = choiceInput.next();
		
			
		
		
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
	
	public void setItem(String itmName) {
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
	
	public void setDrinkCost(int drinkCost) {
		this.drinkCost = drinkCost;
	}
	
	public int getDrinkCost() {
		return drinkCost;
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
