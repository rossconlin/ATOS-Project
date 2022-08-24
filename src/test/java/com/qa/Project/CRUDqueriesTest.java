package com.qa.Project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class CRUDqueriesTest {

	CRUDqueries queries = new CRUDqueries();
		@BeforeAll
		public static void start() {
			System.out.println("Before All");
		}
		
		@BeforeEach
		public void setUp() {
			
			System.out.println("Before Each");
		}
		
		@Test
		public void test1() {
			String result =queries.create("ross", "conlin", 0, "yes", "no");
			assertEquals("INSERT INTO burger_order(customer_first_name, customer_last_name, number_of_patties, sauce, salad) VALUES('ross', 'conlin', 0,'yes','no');", result);
			System.out.println("Test");
		}
		@Test
		public void test2() {
			assertEquals("SELECT * FROM burger_order",queries.read());
		}
		
		@Test
		public void test3() {
			String result = queries.update(0, null);
			equals("UPDATE burger_order SET customer_first_name + customer_last_name = '\" + updateVal + \"' WHERE id = \" + id + \";\";");
		}
		@Test
		public void test4() {
			String result = queries.delete(2);
			assertEquals("DELETE FROM burger_order WHERE id='+id+';",queries.read());
					
		}
		
		@Test
		public void test5() {
			String result = queries.CloseConn();
		}
		
		
		
		@AfterEach
		public void clean() {
			System.out.println("After Each");
		}
		
		@AfterAll
		public static void stop() {
			System.out.println("After All");
		}
}
