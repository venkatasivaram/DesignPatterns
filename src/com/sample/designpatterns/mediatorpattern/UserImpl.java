package com.sample.designpatterns.mediatorpattern;

public class UserImpl extends User{

	public UserImpl(ChatMediator med, String name) {
		super(med, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send(String message) {
		// TODO Auto-generated method stub
		System.out.println(this.message+": Sending Message="+message);
		chatMediator.sendMessage(message, this);
	}

	@Override
	public void receive(String message) {
		// TODO Auto-generated method stub
		System.out.println("The message received is "+message);
	}
	
	

}
