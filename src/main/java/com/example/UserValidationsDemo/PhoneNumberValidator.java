package com.example.UserValidationsDemo;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> {

	private static final String phoneRegex = "^\\+?[1-9]\\d{1,14}$";
	
	@Override
	public boolean isValid(String phoneNumber, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		
		if(phoneNumber == null) {
			return true;
		}
		return phoneNumber.matches(phoneRegex);
	}
}
