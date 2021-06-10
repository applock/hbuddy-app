package com.hbuddy.repo;

import javax.inject.Singleton;

import org.bson.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoDatabase;

import io.micronaut.context.annotation.Value;
import io.reactivex.Flowable;

@Singleton
public class UserRepository {

	private Logger logger = LoggerFactory.getLogger(UserRepository.class);

	private final MongoClient mongoClient;

	@Value("${hbuddy.db}")
	private String DB;

	public UserRepository(MongoClient mongoClient) {
		this.mongoClient = mongoClient;
	}

	public final MongoDatabase getMongoClient() {
		return mongoClient.getDatabase(DB);
	}

	public Flowable<Document> getUser(String userId) {
		logger.info("Getting user..");
		return Flowable.fromPublisher(getMongoClient().getCollection("user").find());
	}
}