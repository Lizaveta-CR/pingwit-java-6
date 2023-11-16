package com.pingwit.spring.les_11.classwork.annotation;

import com.pingwit.spring.les_11.classwork.repository.TeslaRepository;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraintvalidation.SupportedValidationTarget;
import javax.validation.constraintvalidation.ValidationTarget;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SupportedValidationTarget(ValidationTarget.ANNOTATED_ELEMENT)
public class TeslaVINValidator implements ConstraintValidator<UniqueVIN, String> {

    private final TeslaRepository teslaRepository;

    public TeslaVINValidator(TeslaRepository teslaRepository) {this.teslaRepository = teslaRepository;}

    @Override
    public boolean isValid(String vin, ConstraintValidatorContext context) {
        boolean isValid = !teslaRepository.existsByVIN(vin);
        if (!isValid) {
            log.debug("Tesla with vin={} is not valid, exception will be thrown", vin);
        }
        return isValid;
    }
}
