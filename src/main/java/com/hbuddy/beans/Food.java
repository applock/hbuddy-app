package com.hbuddy.beans;

import java.util.Map;

import lombok.Data;

@Data
public class Food {
	Map<FoodItems, String> calories;
}
