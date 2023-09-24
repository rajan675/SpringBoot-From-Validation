package com.company.Entities;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginData {
	
	@NotBlank(message = "Name can not be empty!")
	@Size(min = 3, max = 12, message = "Name must be between 3-12 characters!")
	private String name;
	
	@Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Please enter valid email!")
	private String email;
	
	@AssertTrue(message = "Must agree terms and conditions!")
	private boolean agreed;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	public boolean isAgreed() {
		return agreed;
	}

	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}

	@Override
	public String toString() {
		return "LoginData [name=" + name + ", email=" + email + ", agreed=" + agreed + "]";
	}

	
	
}
