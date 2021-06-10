package com.hbuddy.service;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.bson.Document;

import com.hbuddy.beans.User;
import com.hbuddy.repo.UserRepository;

import io.reactivex.Flowable;

@Singleton
public class UserServiceImpl implements UserService {

	@Inject
	UserRepository userRepo;

	public UserServiceImpl(UserRepository userRepo) {
		this.userRepo = userRepo;
	}

	@Override
	public Flowable<Document> getUser(String id) {
		return userRepo.getUser(id);
	}

	@Override
	public User addUser(User newUser) {
		// TODO Auto-generated method stub
		return null;
	}

}
