package com.hbuddy.service;

import org.bson.Document;

import com.hbuddy.beans.User;

import io.reactivex.Flowable;

public interface UserService {

	public Flowable<Document> getUser(String id);

	public User addUser(User newUser);

}
