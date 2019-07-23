package com.ibm.fsd.utils;

import java.util.List;

import com.ibm.fsd.entities.DeductionItem;
import com.ibm.fsd.entities.IncrementItem;
import com.ibm.fsd.entities.PredictionItem;

public class ReportPrinter {

	public static void printIncrementReport(List<IncrementItem> list) {
		System.out.println("Increment report:");
		System.out.format("+------+-----------------+----------------------+--------------+------------------+%n");
		System.out.format("| Year | Starting Salary | Number of Increments | Increment %%  | Increment Amount |%n");
		System.out.format("+------+-----------------+----------------------+--------------+------------------+%n");
		for (IncrementItem item : list) {
			System.out.print(item.toString());
		    System.out.format("+------+-----------------+----------------------+--------------+------------------+%n");
		}
		
	}
	
	public static void printDeductionReport(List<DeductionItem> list) {		
		System.out.println("Deduction report:");
		System.out.format("+------+-----------------+----------------------+-------------+------------------+%n");
		System.out.format("| Year | Starting Salary | Number of Deductions | Deduction %% | Deduction Amount |%n");
		System.out.format("+------+-----------------+----------------------+-------------+------------------+%n");
		for (DeductionItem item : list) {
			System.out.print(item.toString());
		    System.out.format("+------+-----------------+----------------------+-------------+------------------+%n");
		}
	}
	
	public static void printPredictionReport(List<PredictionItem> list) {		
		System.out.println("Prediction:");
		System.out.format("+------+-----------------+------------------+------------------+---------------+%n");
		System.out.format("| Year | Starting Salary | Increment Amount | Deduction Amount | Salary Growth |%n");
		System.out.format("+------+-----------------+------------------+------------------+---------------+%n");
		for (PredictionItem item : list) {
			System.out.print(item.toString());
		    System.out.format("+------+-----------------+------------------+------------------+---------------+%n");
		}
	}

}
