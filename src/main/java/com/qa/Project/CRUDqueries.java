package com.qa.Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class CRUDqueries {
	
	private Connection conn;//allows me to connect to the burger_shop db
	private Statement stmt;// allows us to prepare the query I want to execute 
	
	
	public CRUDqueries() {
		try {
			conn = DriverManager.getConnection(DBconfig.URL, DBconfig.USER, DBconfig.PASS);
			this.stmt = conn.createStatement();
			System.out.println("Connection Successful!");
		}catch(SQLException e) {
			System.out.println("Incorrect Credintials!");
			e.printStackTrace();
			
		}
			}
	
	public void create(String customer_first_name, String customer_last_name, int number_of_patties, String sauce, String salad) {
		
		//String customer_first_name = "xxx";
		//String customer_last_name = "xxxx";
		//int number_of_patties = 2;
		//String sauce = "yes";
		//String salad = "yes";
		
		String createstmt = "INSERT INTO burger_order(customer_first_name, customer_last_name, number_of_patties, sauce, salad) VALUES('"+customer_first_name+"', '"+customer_last_name+"', "+number_of_patties+",'"+sauce+"','"+salad+"');";
		try {
			stmt.executeUpdate(createstmt);
			System.out.println("Create statement executed");
		}catch(SQLException e) {
			System.out.println("bad query");
			e.printStackTrace();
			
		}
	}
	
	
	
	
	public void CloseConn() {
		try {
			conn.close();
			System.out.println("Connection Closed");
		}catch(SQLException e) {
			System.out.println("Closing Connection...");
			e.printStackTrace();
		}
	}
}
