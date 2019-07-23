package com.ibm.fsd.entities;

public class IncrementItem {
	private Integer year;
	private Double startingSalary;
	private Integer numOfIncrements;
	private Double increment;
	private Double incrementAmount;
	
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
	public Integer getNumOfIncrements() {
		return numOfIncrements;
	}
	public void setNumOfIncrements(Integer numOfIncrements) {
		this.numOfIncrements = numOfIncrements;
	}
	public Double getIncrement() {
		return increment;
	}
	public void setIncrement(Double increment) {
		this.increment = increment;
	}
	public Double getIncrementAmount() {
		return incrementAmount;
	}
	public void setIncrementAmount(Double incrementAmount) {
		this.incrementAmount = incrementAmount;
	}
	
	
	public String toString() {
		String leftAlignFormat = "| %-4d | %-15.2f | %-20d | %-12.2f | %-16.2f | %n";
		String result = String.format(leftAlignFormat, 
					  				  this.year, 
					  				  this.startingSalary,
					  				  this.numOfIncrements,
					  				  this.increment,
					  				  this.incrementAmount);
		return result.toString();
		
	}
	
}
