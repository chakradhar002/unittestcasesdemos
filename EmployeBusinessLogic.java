package com.demo;

public class EmployeBusinessLogic {
   //write case for this
	public double calulateYearlySal(EmployeeDetails empdetails) {

		double yearlysal = 0;
		yearlysal = empdetails.getMonthSal() * 12;

		return yearlysal;
	

	}

	public double calulateApprialSal(EmployeeDetails empdetails) {

		double yearApprialSal = 0;

		if (empdetails.getMonthSal() < 10000) {

			yearApprialSal = 5000;
			
			System.out.println(yearApprialSal);

		} else {

			yearApprialSal = 1000;
			
			System.out.println(yearApprialSal);
		}
		return yearApprialSal;

	}

}
