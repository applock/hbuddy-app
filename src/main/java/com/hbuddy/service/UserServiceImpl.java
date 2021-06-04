package com.hbuddy.service;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.hbuddy.beans.User;
import com.hbuddy.repo.UserRepository;

@Singleton
public class UserServiceImpl implements UserService {

	@Inject
	UserRepository userRepo;

	public UserServiceImpl(UserRepository userRepo) {
		this.userRepo = userRepo;
	}

	@Override
	public User getUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User addUser(User newUser) {
		// TODO Auto-generated method stub
		return null;
	}

}
