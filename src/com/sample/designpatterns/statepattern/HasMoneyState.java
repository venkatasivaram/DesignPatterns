package com.sample.designpatterns.statepattern;

public class HasMoneyState implements VendingMachineState {

	@Override
	public void selectProductAndInsertMoney(int amt, String productName) {
		// TODO Auto-generated method stub
		
	    System.out.println("Already Vending machine has money and product selected,So wait till it finish the current dispensing process ... ");

	}

	@Override
	public void dispenceProduct() {
		// TODO Auto-generated method stub

		 System.out.println("Vending Machine  dispensed the product ...");
	}

}
