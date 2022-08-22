package com.qa.Project;

import java.util.Scanner;

public class Runner {
	
		public static void main(String[] args) {
				
			CRUDqueries query = new CRUDqueries();
			
			Scanner sc = new Scanner(System.in);
			
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
			query.create(a, b, numberOfPatties,c, d);
			query.CloseConn();
			
			
		}

}
