package com.example.UserValidationsDemo;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordMatchValidator implements ConstraintValidator<PasswordMatch, User> {

	@Override
	public boolean isValid(User user, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if(user.getPassword() == null || user.getConfirmPassword() == null) {
			return true;
		}
		boolean isvalid = user.getPassword().equals(user.getConfirmPassword());
		if(!isvalid) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(context.getDefaultConstraintMessageTemplate())
			.addPropertyNode("confirmPassword")
			.addConstraintViolation();
		}
		return isvalid;
	}

}
