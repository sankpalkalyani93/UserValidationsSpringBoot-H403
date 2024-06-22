package com.example.UserValidationsDemo;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;


@Documented
@Constraint(validatedBy = PhoneNumberValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PhoneNumber {
	//1. default error message which will be displayed when the validation fails
	String message() default "Invalid Phone Number";
	
	//2. to define validation groups
	Class<?>[] groups() default {};
	
	//3. to carry the metadata information consumed by the validation client
	Class<? extends Payload>[] payload() default {};
}
