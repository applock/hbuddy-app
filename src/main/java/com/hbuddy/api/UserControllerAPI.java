package com.hbuddy.api;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;
import static com.hbuddy.constants.AppConstants.USER_ENDPOINTS;
import static com.hbuddy.constants.AppConstants.X_USERNAME;

import java.util.Date;

import static com.hbuddy.constants.AppConstants.X_DATE;

import javax.validation.Valid;

import com.hbuddy.beans.ApiResponse;
import com.hbuddy.beans.Daily;

@Controller(USER_ENDPOINTS)
public interface UserControllerAPI {

	@Get(uri = "/dailyData", produces = MediaType.APPLICATION_JSON)
	public HttpResponse<ApiResponse> getUserDailyData(@Header(X_USERNAME) String username, @Header(X_DATE) Date date);

	@Post(uri = "/dailyData", consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON)
	public HttpResponse<ApiResponse> feedDailyData(@Header(X_USERNAME) String username, @Body @Valid Daily data);
}