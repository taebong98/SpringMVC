package com.mvcDemo.mvcCore.coffee.dto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class PriceValidator implements ConstraintValidator<Price, Integer> {
    @Override
    public void initialize(Price constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return value == null || (value >= 100 && value <= 30000);
    }
}
