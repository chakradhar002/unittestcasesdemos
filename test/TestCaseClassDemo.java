package com.demo.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class TestCaseClassDemo extends TestCase {
	
	
	protected double fValue1;
	protected double fValue2;
	
	@Before
	public void setUp() {
		
		fValue1=2.0;
		fValue2=4.0;
	}
	
	
	@Test
	public void testLogic() {
	  // count the number of test cases
		System.out.println("no of test case = "+this.countTestCases());
		
		String name=this.getName();
		System.out.println("name  = "+this.getName());
		
		this.setName("testnew");
		String newname=this.getName();
		System.out.println("updated name  = "+this.getName());
	}
	
	// used for  closed the  cnnection or clean up acitivties
	@After
	public void tearDown() {
		
		System.out.println("cleard all");
	}
	

}
