package com.hbuddy;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;

@OpenAPIDefinition(info = @Info(title = "hbuddy-app", version = "1.0", description = "Health Buddy App - An open initiative for healthy lifestyle.", contact = @Contact(url = "http://something.com", name = "Iman Biswas", email = "ibsanchar@gmail.com")))
public class Application {

	public static void main(String[] args) {
		Micronaut.run(Application.class, args);
	}
}
