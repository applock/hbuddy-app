package com.hbuddy.api;

import java.util.Date;

import javax.inject.Inject;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hbuddy.beans.ApiResponse;
import com.hbuddy.beans.Daily;
import com.hbuddy.service.UserService;

import io.micronaut.http.HttpResponse;

public class UserController implements UserControllerAPI {

	private Logger logger = LoggerFactory.getLogger(UserController.class);

	@Inject
	UserService userSvc;

	public UserController(UserService userSvc) {
		this.userSvc = userSvc;
	}

	@Override
	public ApiResponse getUserDailyData(String userId, Date date) {
		logger.info("Getting daily feeds for user id {}", userId);
		return ApiResponse.builder().withData(userSvc.getUser(userId)).build();
	}

	@Override
	public HttpResponse<ApiResponse> feedDailyData(String userId, @Valid Daily data) {
		// TODO Auto-generated method stub
		return null;
	}

}
