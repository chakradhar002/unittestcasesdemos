package com.demo.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.demo.PrimeNumberChecker;

@RunWith(Parameterized.class)
public class TestPrimeParmatrized {

	private Integer inputnumber;
	private Boolean expectedValue;
	PrimeNumberChecker primeNumberChecker;

	@Before
	public void intilize() {

		primeNumberChecker = new PrimeNumberChecker();
	}

	public TestPrimeParmatrized(Integer inputnumber, Boolean expectedValue) {
		this.inputnumber = inputnumber;
		this.expectedValue = expectedValue;

	}

	@Parameterized.Parameters
	public static Collection demoPrime() {
		return Arrays.asList(new Object[][]{
			{1,false}
			
			
		});
		
	}
	
	@Test
	public void testPrimeNumberChecker() {
		
		assertEquals(expectedValue, primeNumberChecker.validate(inputnumber));
		
	}

}
