package com.qa.Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class CRUDqueries {
	
	private Connection conn;//allows me to connect to the burger_shop db
	private Statement stmt;// allows me to prepare the query I want to execute 
	private ResultSet rs;
	
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
		
		String createstmt = "INSERT INTO burger_order(customer_first_name, customer_last_name, number_of_patties, sauce, salad) VALUES('"+customer_first_name+"', '"+customer_last_name+"', "+number_of_patties+",'"+sauce+"','"+salad+"');";
		try {
			stmt.executeUpdate(createstmt);
			System.out.println("Create statement executed");
		}catch(SQLException e) {
			System.out.println("bad query");
			e.printStackTrace();
			
		}
	}
	public void read() {
		String readStmt = "SELECT * FROM burger_order";
		try {
			rs = stmt.executeQuery(readStmt);
			while (rs.next()) {
				System.out.println("ID: " + rs.getInt("id"));
				System.out.println("customer first name: " + rs.getString("customer_first_name"));
				System.out.println("customer last name: " + rs.getString("customer_last_name"));
				System.out.println("number of patties: " + rs.getInt("number_of_patties"));
				System.out.println("sauce: " + rs.getString("sauce"));
				System.out.println("salad: " + rs.getString("salad"));
			}
		}catch(SQLException e) {
			System.out.println("bad query");
			e.printStackTrace();
		}
	}
	
	public void update() {
		
	}
	
	public void delete(int id) {
		String delStmt = "DELETE FROM burger_order WHERE id="+id+";";
		try {
			stmt.executeUpdate(delStmt);
			System.out.println("Delete Statement executed");
		} catch (SQLException e) {
			System.out.println("Bad Query");
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
