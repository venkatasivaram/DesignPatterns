package com.sample.designpatterns.chresponsibilitypattern;

public interface DispenceChain {
	
	public void setNextChain(DispenceChain dc);
	
	public void dispence(Currency cur);

}
