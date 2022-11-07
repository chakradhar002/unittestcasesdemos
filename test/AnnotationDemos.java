package com.demo.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

public class AnnotationDemos {
	
	//execute beore clas
	
	@BeforeClass
	public static void beforeClass() {
		
		System.out.println(" in before class");
	}
	
	@AfterClass
	public static void afterClass() {
		
		System.out.println(" in before class");
	}

	
	@AfterClass
	public static void after() {
		
		System.out.println(" in before class");
	}

	
	
	@Test
	public  void test() {
		
		System.out.println(" in before class");
	}
}
