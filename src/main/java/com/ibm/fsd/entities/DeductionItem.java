package com.ibm.fsd.entities;

public class DeductionItem {
	private Integer year;
	private Double startingSalary;
	private Integer numOfDeductions;
	private Double deduction;
	private Double deductionAmount;
	
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Double getStartingSalary() {
		return startingSalary;
	}
	public void setStartingSalary(Double startingSalary) {
		this.startingSalary = startingSalary;
	}
	public Integer getNumOfDeductions() {
		return numOfDeductions;
	}
	public void setNumOfDeductions(Integer numOfDeductions) {
		this.numOfDeductions = numOfDeductions;
	}
	public Double getDeduction() {
		return deduction;
	}
	public void setDeduction(Double deduction) {
		this.deduction = deduction;
	}
	public Double getDeductionAmount() {
		return deductionAmount;
	}
	public void setDeductionAmount(Double deductionAmount) {
		this.deductionAmount = deductionAmount;
	}
	
	public String toString() {
		String leftAlignFormat = "| %-4d | %-15.2f | %-20d | %-11.2f | %-16.2f | %n";
		String result = String.format(leftAlignFormat, 
					  				  this.year, 
					  				  this.startingSalary,
					  				  this.numOfDeductions,
					  				  this.deduction,
					  				  this.deductionAmount);
		return result.toString();
		
	}
}
