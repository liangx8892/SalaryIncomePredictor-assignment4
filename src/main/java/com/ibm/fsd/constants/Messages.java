package com.ibm.fsd.constants;

public interface Messages {
	public static final String ENTER_SALARY 
		= "Please enter your current salary, which should be greater than 1 (e.g. 1000): ";
	public static final String SALARY_INVALID 
		= "Salary you entered is invalid, please enter again (e.g. 1000): ";

	public static final String ENTER_INCREMENT 
		= "Please enter salary increment in percent, only accept positive number (e.g. 20): ";
	public static final String INCREMENT_INVALID 
		= "Salary increment you entered is invalid, please enter again (e.g. 20): ";

	public static final String ENTER_INCREMENT_FREQUENCE
		= "Please select a salary increment frequence from following: " +
		  System.lineSeparator() +
		  "1. quarterly" +
		  System.lineSeparator() +
		  "2. semi-annually" +
		  System.lineSeparator() +
		  "3. annually" +
		  System.lineSeparator();
	public static final String INCREMENT_FREQUENCE_INVALID 
		= "Salary increment frequence you entered is invalid, please enter again "
		+ "(1. quarterly, 2. semi-annually, 3. annually): ";
	
	public static final String ENTER_DEDUCTION
		= "Please enter salary deduction in percent, only accept positive number (e.g. 20): ";
	public static final String DEDUCTION_INVALID 
		= "Salary deduction you entered is invalid, please enter again (e.g. 20): ";
	
	public static final String ENTER_DEDUCTION_FREQUENCE
		= "Please select a salary deduction frequence from following: " +
		  System.lineSeparator() +
		  "1. quarterly" +
		  System.lineSeparator() +
		  "2. semi-annually" +
		  System.lineSeparator() +
		  "3. annually" +
		  System.lineSeparator();
	public static final String DEDUCTION_FREQUENCE_INVALID 
		= "Salary deduction frequence you entered is invalid, please enter again "
		+ "(1. quarterly, 2. semi-annually, 3. annually): ";
	
	public static final String ENTER_YEARS 
		= "Please enter how many years you want to predict, only accept positive integer number (e.g. 3): ";
	public static final String YEARS_INVALID 
		= "Years you entered is invalid, please enter again (e.g. 20): ";
}
