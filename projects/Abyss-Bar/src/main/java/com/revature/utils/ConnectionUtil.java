package com.revature.utils;

import java.util.Scanner;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.revature.models.User;
import com.revature.models.AbyssBar;
public class ConnectionUtil {
	
	

	static Scanner choiceInput = new Scanner(System.in);
	private static Connection connection;
	static User user;
	static AbyssBar aybssBar;
	static String username = "postgres";
	static String password = "RaylaMoonCallumSky";
	static String url = "jdbc:postgresql://database-1.clykcc02lppz.us-east-1.rds.amazonaws.com:5432/postgres";

	
	
	

	

	public static void getUserInfo() {
		
			try {
				Connection connectToMyDataBase = DriverManager.getConnection(url, username, password);
				System.out.println("Enter the name in the userfield to look up a user you are currently looking for.");
				System.out.println("Username");
				System.out.println("|-------------|");
				String username = choiceInput.next();
				System.out.println("Now enter the correct password to the corresponding user");
				System.out.println("Password");
				System.out.println("|-------------|");
				String userpassword = choiceInput.next();
				
				String sqlUser = "select * from users where users.username = '"+ username+"'and users.password = '" +userpassword+"';";
				
				Statement sqlStatement = connectToMyDataBase.createStatement();
				
				
				ResultSet resultUsers = sqlStatement.executeQuery(sqlUser); //output user info such as their id, name, age, password
				

				
				while(resultUsers.next()) {
					user = new User();
					user.setId(resultUsers.getInt("id"));
					user.setUserName(resultUsers.getString("username"));
					user.setPassword(resultUsers.getString("password"));
					user.setPrivilege(resultUsers.getString("privilege"));
					user.setCredits(resultUsers.getInt("credits"));
					user.setAge(resultUsers.getInt("age"));
				}
				
					int currentUserID = user.getId();
					String currentUserName = user.getUserName();
					int currentUserCredits = user.getCredits();
					int currentUserAge = user.getAge();
					String currentPrivilege = user.getPrivilege();
					
					System.out.println("User Info");
					System.out.println("-----------------------------------------");
					System.out.println("UserID: "+ currentUserID);
					System.out.println("UserName: "+ currentUserName);
					System.out.println("# Credits: "+ currentUserCredits);
					System.out.println("Age: "+ currentUserAge);
					System.out.println("CurrentPrivilege: "+ currentPrivilege);
					System.out.println("-----------------------------------------");
					privilegeChecker(currentPrivilege);
			}
			catch(SQLException e){
				System.out.println("Something went wrong here, look into it doofus");
				e.printStackTrace();
			}
			
			
	
		
	}
	public static void privilegeChecker(String userPrivilege) {
		
		String currentUserPrivilege = user.getPrivilege();
		System.out.println(currentUserPrivilege);

		if(currentUserPrivilege.equals("Customer")) {
			System.out.println("redirecting you to the Customer menu");
			user.accountOptionsCustomer();
		}
		
		else if(currentUserPrivilege.equals("Employee")) {
			System.out.println("redirecting you to the Employee menu");
			user.accountOptionsEmployee();
		}
		
		else if(currentUserPrivilege.equals("Manager")) {
			System.out.println("redirecting you to the Manager menu");
			user.accountOptionsManager();
		}
		
		
		}

	
	public static void permissionChanger() {
		try {
			Connection connectToMyDataBase = DriverManager.getConnection(url, username, password);
			System.out.println("Welcome manager what would you like to do?");
			System.out.println("1.)Demote a user!");
			System.out.println("2.)Promote a user!");
			int userChoice = choiceInput.nextInt();
			
			

			switch(userChoice) {
				case 1:
					System.out.println("Select a user you want to demote to customer");
					String userSelection = choiceInput.next();
					
					
					
					String sqlUser = "update users set privilege = 'Customer' where username = '"+userSelection+"'";
					PreparedStatement ps = connectToMyDataBase.prepareStatement(sqlUser);
					int rowsChanged = -1;

					rowsChanged = ps.executeUpdate();
					System.out.println("User Demoted");
				case 2:
					System.out.println("Select a user you want to promote to Employee");
					
					String userSelection2 = choiceInput.next();
					
					String sqlUser2 = "update users set privilege = 'Customer' where username = '"+userSelection2+"'";
			
					PreparedStatement ps2 = connectToMyDataBase.prepareStatement(sqlUser2);
					
					int rowsChanged2 = -1;
					
					rowsChanged2 = ps2.executeUpdate();
					System.out.println("User Promoted");
			}
		}
		catch(SQLException e) {
			System.out.println("This failed");
			e.printStackTrace();
		}
		System.out.println("Passed");
		

		
		
	}
	public static void createUser(String userName, String userPassword, int userAge, int userCredits, String userPrivilege) {
		try {
				System.out.println("This was successful");
				Connection connectToMyDatabase = DriverManager.getConnection(url, username, password);
				

				String newUserSQL = "insert into users (username, password, Age, Credits, Privilege) values ('"+userName+"','"+userPassword+"','"+userAge+"','"+userCredits+"','"+userPrivilege+"')";
				
				
				Statement newUserStatement = connectToMyDatabase.createStatement();
				
				newUserStatement.execute(newUserSQL);
				
				System.out.println("Congratulations Miner your account has been successfully created.");
				System.out.println("Proceeding to the user login screen!");
				getUserInfo();
			}
		catch(SQLException e) {
			System.out.println("Something went wrong!");
			e.printStackTrace();
		}
		
		
	}
	
	public static void createNewItem(String itemName, int amountServed, int drinkCost, String drinkDesc) {
		
		
		try {
			aybssBar = new AbyssBar();
			Connection connectToMyDataBase = DriverManager.getConnection(url, username, password);
			System.out.println("----------------------------------------------");
			System.out.println("Hello fellow employee what would you like to add to the Bar Menu?");
			String itemToAdd = choiceInput.next();
			
			
			choiceInput.nextLine();
			Statement sqlItemStatement = connectToMyDataBase.createStatement();
			
			String sqlNewItem = "insert into drink_menu (drink_name, amount_served, cost_in_creds, description_of_drink) values ('"+itemName+"','"+amountServed+"','"+drinkCost+"','"+drinkDesc+"')";
			
			sqlItemStatement.execute(sqlNewItem);
			System.out.println("Item has been added!");

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("this failed.");
			e.printStackTrace();
		}
	}
	
	
	public static Connection getDatabaseConnection() throws SQLException, IOException {
		
		if(connection == null || connection.isClosed()) {
			connection = DriverManager.getConnection(url, username, password);
		}
		
		try {
			
			Connection doesDataBaseWork = DriverManager.getConnection(url, username, password);

			System.out.println("We got a connection bro...");
			
			
			
			
			doesDataBaseWork.close();
			
			
			
			
			
			
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Oh dang there was an error, shoot.");
			e.printStackTrace();
		}
		
		return connection;
		
	}
	


	
	public static List<User> selectAllUsers(){
		

		
		List<User> userList = new ArrayList<User>();
		
		
		try {
			Connection connectToMyDataBase = DriverManager.getConnection(url, username, password);
			
			
			Statement SQlItmstatement = connectToMyDataBase.createStatement();
			
			ResultSet rsUsers = SQlItmstatement.executeQuery("Select * from users");
			
			while(rsUsers.next()) {
				User users = new User();
				users.setId(rsUsers.getInt("id"));
				users.setUserName(rsUsers.getString("username"));
				users.setPassword(rsUsers.getString("password"));
				users.setAge(rsUsers.getInt("age"));
				users.setCredits(rsUsers.getInt("credits"));
				users.setPrivilege(rsUsers.getString("privilege"));
				
				userList.add(users);
				
			}
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return userList;
		
	}
	
	
	
	public static List<AbyssBar> selectAll(){
		

		
		List<AbyssBar> abyssBarList = new ArrayList<AbyssBar>();
		
		
		try {
			Connection connectToMyDataBase = DriverManager.getConnection(url, username, password);
			
			
			Statement SQlItmstatement = connectToMyDataBase.createStatement();
			
			ResultSet rsItms = SQlItmstatement.executeQuery("Select * from drink_menu");
			
			while(rsItms.next()) {
				AbyssBar abyssBar = new AbyssBar();
				abyssBar.setId(rsItms.getInt("id"));
				abyssBar.setItem(rsItms.getString("drink_name"));
				abyssBar.setAmountServed(rsItms.getInt("amount_served"));
				abyssBar.setDrinkCost(rsItms.getInt("cost_in_creds"));
				abyssBar.setDesc(rsItms.getString("description_of_drink"));
				
				
				abyssBarList.add(abyssBar);
				
			}
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return abyssBarList;
		
	}
	

	
	public static void updateAbyssBar() {}
	
	
	public static void pendingOffersForDrinks() {
		
	}
	
	
}
