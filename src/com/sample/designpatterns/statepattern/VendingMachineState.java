package com.sample.designpatterns.statepattern;

public interface VendingMachineState{
	
	public void selectProductAndInsertMoney(int amt, String productName);
	
	public void dispenceProduct();

}
