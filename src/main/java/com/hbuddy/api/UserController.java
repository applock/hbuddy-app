package com.hbuddy.api;

import java.util.Date;

import javax.inject.Inject;
import javax.validation.Valid;

import com.hbuddy.beans.ApiResponse;
import com.hbuddy.beans.Daily;
import com.hbuddy.service.UserService;

import io.micronaut.http.HttpResponse;

public class UserController implements UserControllerAPI {
	
	@Inject
	UserService userSvc;

	@Override
	public HttpResponse<ApiResponse> getUserDailyData(String userId, Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpResponse<ApiResponse> feedDailyData(String userId, @Valid Daily data) {
		// TODO Auto-generated method stub
		return null;
	}

}
