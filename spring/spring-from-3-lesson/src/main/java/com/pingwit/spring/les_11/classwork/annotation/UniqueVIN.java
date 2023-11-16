package com.pingwit.spring.les_11.classwork.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Constraint(validatedBy = TeslaVINValidator.class)
public @interface UniqueVIN {

    String message() default "VIN=${validatedValue} arleady exists";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
