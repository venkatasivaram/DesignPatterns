package com.sample.designpatterns.mediatorpattern;

public class ChatClient {

	public static void main(String args[])
	{
		
		ChatMediator chatMediator=new ChatMediatorImpl();
		
		User user1=new UserImpl(chatMediator, "Siva");
		User user2=new UserImpl(chatMediator, "Ssss");
		User user3=new UserImpl(chatMediator, "Aaaa");
		
		chatMediator.addUser(user1);
		chatMediator.addUser(user2);
		chatMediator.addUser(user3);
		
		user1.send("Hi");
	}
}
