package com.ibm.fsd.collections;

import java.util.ArrayList;
import java.util.List;

import com.ibm.fsd.entities.DeductionItem;
import com.ibm.fsd.entities.IncrementItem;
import com.ibm.fsd.entities.PredictionItem;

public class OutputCollection {
	private List<IncrementItem> incrementList;
	private List<DeductionItem> deductionList;
	private List<PredictionItem> predictionList;
	
	public OutputCollection() {
		incrementList = new ArrayList<IncrementItem>();
		deductionList = new ArrayList<DeductionItem>();
		predictionList = new ArrayList<PredictionItem>();
	}

	
	public void addIncrementItem(IncrementItem item) {
		incrementList.add(item);
	}
	
	public void addDeductionItem(DeductionItem item) {
		deductionList.add(item);
	}
	
	public void addPredictionItem(PredictionItem item) {
		predictionList.add(item);
	}
	
	public List<IncrementItem> getIncrementList() {
		return incrementList;
	}

	public List<DeductionItem> getDeductionList() {
		return deductionList;
	}

	public List<PredictionItem> getPredictionList() {
		return predictionList;
	}
	
	
}
