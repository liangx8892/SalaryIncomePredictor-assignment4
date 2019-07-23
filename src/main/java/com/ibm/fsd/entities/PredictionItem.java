package com.ibm.fsd.entities;

public class PredictionItem {
	private Integer year;
	private Double startingSalary;
	private Double incrementAmount;
	private Double deductionAmount;
	private Double salaryGrowth;
	
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
	public Double getIncrementAmount() {
		return incrementAmount;
	}
	public void setIncrementAmount(Double incrementAmount) {
		this.incrementAmount = incrementAmount;
	}
	public Double getDeductionAmount() {
		return deductionAmount;
	}
	public void setDeductionAmount(Double deductionAmount) {
		this.deductionAmount = deductionAmount;
	}
	public Double getSalaryGrowth() {
		return salaryGrowth;
	}
	public void setSalaryGrowth(Double salaryGrowth) {
		this.salaryGrowth = salaryGrowth;
	}
	
	public String toString() {
		String leftAlignFormat = "| %-4d | %-15.2f | %-16.2f | %-16.2f | %-13.2f | %n";
		String result = String.format(leftAlignFormat, 
					  				  this.year, 
					  				  this.startingSalary,
					  				  this.incrementAmount,
					  				  this.deductionAmount,
					  				  this.salaryGrowth);
		return result.toString();
		
	}
}
