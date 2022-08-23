package com.qa.Project;

import java.util.Scanner;

public class order {
	
	private static Scanner sc = new Scanner(System.in);
	
	public String getInput() {
		System.out.println("Enter Order");
		return sc.nextLine();
	}
	
	public void options() {
		CRUDqueries q = new CRUDqueries();
		String crud = getInput();
		
		
		try {
			
			
			do {
				switch (crud.toLowerCase()) {
				case "order":
					System.out.println("Please Enter First Name");
						String a = sc.nextLine();
						System.out.println("Please Enter Last Name");
						String b =sc.nextLine();
						System.out.println("how many patties do you want?");
						int numberOfPatties = sc.nextInt();
						sc.nextLine();
						System.out.println("What sauce do you want on your burger ?");
						String c = sc.nextLine();
						System.out.println("Do you want salad on the burger ?");
						String d = sc.nextLine();
						q.create(a, b, numberOfPatties,c, d);
						break;
				case "read":
					q.read();
					break;
				case "update":
					
					break;
				case "delete":
					
					break;
					default:
						System.out.println("Invalid Order");
				}
				System.out.println("Would you like to continue? (y/n)");
				String quit = sc.nextLine();
				if (quit.toLowerCase().equals("y")) {
					crud = getInput();
				} else if (quit.toLowerCase().equals("n")) {
					crud = "quit";
				} else {
					System.out.println("Please enter 'y' or 'n'");
				}

			} while (!crud.equals("quit"));
			System.out.println("Goodbye!");
		} finally {
			q.CloseConn();
		}
			}
		
	}
	
	
	
	
	
	
	
	
	
	
