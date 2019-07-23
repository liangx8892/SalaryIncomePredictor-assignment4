package com.ibm.fsd;

import java.util.Scanner;

import com.ibm.fsd.collections.InputCollection;
import com.ibm.fsd.collections.OutputCollection;
import com.ibm.fsd.entities.InputItem;
import com.ibm.fsd.utils.PredictionCalculator;
import com.ibm.fsd.utils.ReportPrinter;

public class SalaryPredictor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		InputCollection inputCollection = new InputCollection();
		int index = 0;
		
		for(; index < inputCollection.size() ; index++) {
			InputItem item = inputCollection.getItem(index);
			System.out.print(item.getInputMessage());
			String inputValue = scanner.next();
			while(!item.validate(inputValue)) {
				System.out.print(item.getInvalidMessage());
				inputValue = scanner.next();
			}
			item.setValue(inputValue);
		}
		
		
		scanner.close();
		
		
		OutputCollection outputCollection = new OutputCollection();
		PredictionCalculator.calculate(inputCollection, outputCollection);
		
		
		
		ReportPrinter.printIncrementReport(outputCollection.getIncrementList());
		ReportPrinter.printDeductionReport(outputCollection.getDeductionList());
		ReportPrinter.printPredictionReport(outputCollection.getPredictionList());
	}

}
