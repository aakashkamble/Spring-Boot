package com.springboot.DTO;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserDTO {

	private long id;
	
	@NotEmpty(message = "User First name should not be null or empty")
	private String firstName;
	
	@NotEmpty(message = "User Last name should not be null or empty")
	private String lastName;
	
	@NotEmpty(message = "User Email should not be null or empty")
	@Email
	private String email;
	
}
