package com.demo.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.demo.EmployeBusinessLogic;
import com.demo.EmployeeDetails;

public class TestEmployDetails {

	EmployeBusinessLogic employeBusinessLogic = new EmployeBusinessLogic();
	EmployeeDetails empl = new EmployeeDetails();

	@Test
	public void testcalulateApprialSal() {

		empl.setName("Ram");
		empl.setMonthSal(5000);
		empl.setAge(24);

		double appraisal = employeBusinessLogic.calulateApprialSal(empl);

		assertEquals(5000, appraisal, 0.0);

	}
	

}
