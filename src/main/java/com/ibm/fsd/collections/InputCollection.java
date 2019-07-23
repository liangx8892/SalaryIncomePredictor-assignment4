package com.ibm.fsd.collections;

import java.util.ArrayList;
import java.util.List;

import com.ibm.fsd.constants.Messages;
import com.ibm.fsd.constants.Patterns;
import com.ibm.fsd.entities.InputItem;

public class InputCollection {
	
	private List<InputItem> inputList;
	
	public InputCollection() {
		inputList = new ArrayList<InputItem>();
		
		inputList.add(new InputItem(Messages.ENTER_SALARY, 
					  				Messages.SALARY_INVALID, 
					  				Patterns.SALARY_PATTERN));
		
		inputList.add(new InputItem(Messages.ENTER_INCREMENT, 
									Messages.INCREMENT_INVALID, 
									Patterns.INCREMENT_PATTERN));
		
		inputList.add(new InputItem(Messages.ENTER_INCREMENT_FREQUENCE, 
									Messages.INCREMENT_FREQUENCE_INVALID, 
									Patterns.INCREMENT_FREQUENCE_PATTERN));
		
		inputList.add(new InputItem(Messages.ENTER_DEDUCTION, 
									Messages.DEDUCTION_INVALID, 
									Patterns.DEDUCTION_PATTERN));
		
		inputList.add(new InputItem(Messages.ENTER_DEDUCTION_FREQUENCE, 
									Messages.DEDUCTION_FREQUENCE_INVALID, 
									Patterns.DEDUCTION_FREQUENCE_PATTERN));
		
		inputList.add(new InputItem(Messages.ENTER_YEARS, 
									Messages.YEARS_INVALID, 
									Patterns.YEARS_PATTERN));
	}
	
	public InputItem getItem(int index) {
		return this.inputList.get(index);
	}
	
	public Double getCurrentSalary() {
		return this.getDoubleValueByIndex(0);
	}
	
	public Double getIncrement() {
		return this.getDoubleValueByIndex(1);
	}
	
	public Integer getIncrementFrequence() {
		return this.getIntValueByIndex(2);
	}
	
	public Double getDeduction() {
		return this.getDoubleValueByIndex(3);
	}
	
	public Integer getDeductionFrequence() {
		return this.getIntValueByIndex(4);
	}
	
	public Integer getYears() {
		return this.getIntValueByIndex(5);
	}
	
	private Double getDoubleValueByIndex(int index) {
		Double value = null;
		String input = inputList.get(index).getValue();
		if(input != null && inputList.get(index).isValid()) {
			value = Double.parseDouble(input);
		}
		return value;
	}
	
	private Integer getIntValueByIndex(int index) {
		Integer value = null;
		String input = inputList.get(index).getValue();
		if(input != null && inputList.get(index).isValid()) {
			value = Integer.parseInt(input);
		}
		return value;
	}
	
	public int size() {
		return this.inputList.size();
	}
}