package com.bharti.restfulws.domain.usermaintenance;

import com.bharti.restfulws.domain.User;

// Create User Request
public class CreateUserRequest extends UserRequest {
	
	private static final long serialVersionUID = 1L;
	
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}