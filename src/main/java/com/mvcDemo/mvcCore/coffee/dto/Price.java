package com.mvcDemo.mvcCore.coffee.dto;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {PriceValidator.class})
public @interface Price {
    String message() default "가격은 100원 이상 30000원 이하여야 합니다.";
     Class<?>[] groups() default {};
     Class<? extends Payload> [] payload() default {};
}
