package com.revature;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Driver {

	public static void main(String[] args) {
		//String url = "jdbc:[driver]://[url]:[port]/[db-name]";
		//String url = "jdbc:postgresql://localhost:5432/postgres";
		String url = "jdbc:postgresql://database-1.cllvqmegtmuc.us-east-1.rds.amazonaws.com:5432/postgres";
		String username = "postgres";
		String password = "p4ssw0rd";
		
		try {
			Connection c = DriverManager.getConnection(url, username, password);
			System.out.println(c.getMetaData().getDriverName());
			Statement s = c.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}