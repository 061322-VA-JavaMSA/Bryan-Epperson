package com.revature.services;

import java.util.List;

import com.revature.daos.UserDAO;
import com.revature.daos.UserPostgres;
import com.revature.models.User;

public class UserService {

	private UserDAO ud = new UserPostgres();
	
	public List<User> getUsers(){
		return ud.retrieveUsers();
	}
	
	public User createUser(User u) {
		// logic to validate u
		// if ok
//		u = ud.createUser(u);
		return ud.createUser(u);
	}
}
