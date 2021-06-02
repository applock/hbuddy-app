package com.hbuddy.beans;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Daily {
	private List<Food> meals;
	private List<Exercise> activities;
	private Date date;
}
