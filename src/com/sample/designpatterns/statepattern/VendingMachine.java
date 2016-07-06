package com.sample.designpatterns.statepattern;

public class VendingMachine implements VendingMachineState {
	
	private VendingMachineState VendingMachine;
	
	
	
	
	public VendingMachine()
	{
		VendingMachine =new NoMoneyState();
	}

	public VendingMachineState getVendingMachine() {
		return VendingMachine;
	}

	
	
	
	public void setVendingMachine(VendingMachineState vendingMachine) {
		VendingMachine = vendingMachine;
	}

	@Override
	public void selectProductAndInsertMoney(int amt, String productName) {
		// TODO Auto-generated method stub
		
		VendingMachine.selectProductAndInsertMoney(amt, productName);
		
		VendingMachineState hasMoneyState = new HasMoneyState();
		
		 /*
		    * Money has been inserted so vending Machine changed the
		    * internal state to 'hasMoneyState'
		    */
		    
		    if( VendingMachine instanceof NoMoneyState )
		    {
		      setVendingMachine(hasMoneyState);
		      System.out.println("VendingMachine internal state has been moved to : "
		                     + VendingMachine.getClass().getName());
		    }


	}

	@Override
	public void dispenceProduct() {
		// TODO Auto-generated method stub
		
		VendingMachineState noMoneyState=new NoMoneyState();
		VendingMachine.dispenceProduct();
		
		/* After dispatching the product it will move to No money state */
		
		if( VendingMachine instanceof HasMoneyState )
	    {
		setVendingMachine(noMoneyState);
		
		System.out.println("VendingMachine internal state has been moved to : "
                + VendingMachine.getClass().getName());
	    }
	}

}
