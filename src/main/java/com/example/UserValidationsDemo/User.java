package com.example.UserValidationsDemo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class User {
	
	@NotNull(message = "Id is required")
	private Integer id;
	
	@NotBlank(message = "Name is required")
	@Size(min = 2, max = 30, message = "Name should be atleast 2 characters or max 30 characters.")
	private String name;
	
	@Min(value = 18, message = "Age should not be lesser than 18")
	private int age;
	
	@NotBlank(message = "Email is required")
	@Email(message = "Email should be valid")
	private String email; 
	
	@PhoneNumber
	private String phoneNumber;
	
	public User() {}
	public User(Integer id, String name, int age, String email, String phoneNumber) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	} 
	
}
