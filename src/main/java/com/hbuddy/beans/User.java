package com.hbuddy.beans;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class User implements Serializable {

	private static final long serialVersionUID = -5110489350239043540L;
	
	private String id;
	private String userId;
	
	@Size(min = 2, max = 20)
	private String firstName;
	@Size(min = 2, max = 20)
	private String lastName;
	private Date dob;
	private Address address;
	
	@Email
	private String email;
	
	@Min(5) @Max(200)
	private float weight;

}
