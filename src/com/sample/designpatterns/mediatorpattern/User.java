package com.sample.designpatterns.mediatorpattern;

public abstract class User {
	ChatMediator chatMediator;
	String message;
	
	public User(ChatMediator med, String name)
	{
		this.chatMediator=med;
		this.message=name;
	}
	
	public abstract void send(String message);
	
	public abstract void receive(String message);
}
