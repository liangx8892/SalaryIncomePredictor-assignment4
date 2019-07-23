package com.ibm.fsd.utils;

import com.ibm.fsd.collections.InputCollection;
import com.ibm.fsd.collections.OutputCollection;
import com.ibm.fsd.entities.DeductionItem;
import com.ibm.fsd.entities.IncrementItem;
import com.ibm.fsd.entities.PredictionItem;

public class PredictionCalculator {
	public static void calculate(InputCollection input, OutputCollection output) {
		Double salary = input.getCurrentSalary();
		Double incrementRate = input.getIncrement() / 100;
		Integer incrementNum = 1;
		switch(input.getIncrementFrequence()) {
			case 1:
				incrementNum = 4;
				break;
			case 2:
				incrementNum = 2;
				break;
			case 3:
			default:
				incrementNum = 1;
					
		}
		
		Double deductionRate = input.getDeduction() / 100;
		Integer deductionNum = 1;
		switch(input.getDeductionFrequence()) {
			case 1:
				deductionNum = 4;
				break;
			case 2:
				deductionNum = 2;
				break;
			case 3:
			default:
				deductionNum = 1;
				
		}
		Integer years = input.getYears();
		
		
		for(int i = 1 ; i <= years ; i++) {
			IncrementItem incrementItem = new IncrementItem();
			DeductionItem deductionItem = new DeductionItem();
			PredictionItem predictionItem = new PredictionItem();
			
			incrementItem.setYear(i);
			deductionItem.setYear(i);
			predictionItem.setYear(i);
			
			incrementItem.setStartingSalary(salary);
			incrementItem.setNumOfIncrements(incrementNum);
			incrementItem.setIncrement((Math.pow(1+incrementRate, incrementNum) - 1) * 100);
			incrementItem.setIncrementAmount(
					incrementItem.getStartingSalary() * incrementItem.getIncrement() / 100);
			
			deductionItem.setStartingSalary(
					incrementItem.getStartingSalary()+incrementItem.getIncrementAmount());
			deductionItem.setNumOfDeductions(deductionNum);
			deductionItem.setDeduction((1 - Math.pow(1-deductionRate, deductionNum)) * 100);
			deductionItem.setDeductionAmount(
					deductionItem.getStartingSalary() * deductionItem.getDeduction() / 100);
			
			predictionItem.setStartingSalary(incrementItem.getStartingSalary());
			predictionItem.setIncrementAmount(incrementItem.getIncrementAmount());
			predictionItem.setDeductionAmount(deductionItem.getDeductionAmount());
			predictionItem.setSalaryGrowth(
					predictionItem.getIncrementAmount() - predictionItem.getDeductionAmount());
			
			salary = predictionItem.getStartingSalary() + predictionItem.getSalaryGrowth();
			
			output.addIncrementItem(incrementItem);
			output.addDeductionItem(deductionItem);
			output.addPredictionItem(predictionItem);
		}
	}
}
