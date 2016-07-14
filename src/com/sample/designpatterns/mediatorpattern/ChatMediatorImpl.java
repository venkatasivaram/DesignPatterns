package com.sample.designpatterns.mediatorpattern;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

	private List<User> users;

	public ChatMediatorImpl() {
		// TODO Auto-generated constructor stub
		this.users = new ArrayList<>();
	}

	@Override
	public void sendMessage(String msg, User use) {
		// TODO Auto-generated method stub
		for (User u : this.users) {
			// message should not be received by the user sending it
			if (u != use) {
				u.receive(msg);
			}
		}
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
      this.users.add(user);
	}

}
