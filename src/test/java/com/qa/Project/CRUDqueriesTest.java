package com.qa.Project;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class CRUDqueriesTest {

	
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
			System.out.println("Test");
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
