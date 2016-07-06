package com.sample.designpatterns.statepattern;

public class NoMoneyState implements VendingMachineState {

	@Override
	public void selectProductAndInsertMoney(int amt, String productName) {
		// TODO Auto-generated method stub

		System.out.println("The amount inserted is"+amt +" ProductName is " +productName);
	}

	@Override
	public void dispenceProduct() {
		// TODO Auto-generated method stub
		
		System.out.println("System cannot dispence product because money is not inserted");

	}

}
