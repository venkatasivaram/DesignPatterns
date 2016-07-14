package com.sample.designpatterns.chresponsibilitypattern;

public class Dollar50Dispenser implements DispenceChain {
	
	private DispenceChain dc; 

	@Override
	public void setNextChain(DispenceChain dc) {
		// TODO Auto-generated method stub
		this.dc=dc;
	}

	@Override
	public void dispence(Currency cur) {
		// TODO Auto-generated method stub

		
		
	}

}
