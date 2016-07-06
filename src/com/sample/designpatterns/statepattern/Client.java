package com.sample.designpatterns.statepattern;

public class Client {
	
	public static void main(String args[])
	{
		VendingMachine vendingMachine = new VendingMachine();
		
		vendingMachine.dispenceProduct();
		
		vendingMachine.selectProductAndInsertMoney(100, "Fanta");
		
		vendingMachine.dispenceProduct();
		
		vendingMachine.dispenceProduct();
	}

}
