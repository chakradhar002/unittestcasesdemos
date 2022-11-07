package com.demo.test;

import junit.framework.TestResult;
import junit.framework.TestSuite;

public class TestSuiteDemo {
	
	public static void main(String ar[]) {
		
		
		TestSuite suite = new TestSuite(TestCaseClassDemo.class,TestJunit.class,AnnotationDemos.class);
		TestResult r = new TestResult();
		
		suite.run(r);
		System.out.println(" nuber of  test cases "+r.runCount());
		
	}

}
