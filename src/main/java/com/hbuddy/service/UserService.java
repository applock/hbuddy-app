package com.hbuddy.service;

import com.hbuddy.beans.User;

public interface UserService {

	public User getUser(String id);

	public User addUser(User newUser);

}
