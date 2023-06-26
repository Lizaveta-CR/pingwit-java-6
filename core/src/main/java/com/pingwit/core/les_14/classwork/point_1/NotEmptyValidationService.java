package com.pingwit.core.les_14.classwork.point_1;

import java.lang.reflect.Field;

public class NotEmptyValidationService implements LegoAnnotationService {

    @Override
    public ValidationResult validate(Lego lego) throws IllegalAccessException {
        Field[] declaredFields = lego.getClass().getDeclaredFields();
        ValidationResult validationResult = new ValidationResult(true, "OK!");
        for (Field field : declaredFields) {
            NotEmpty annotation = field.getAnnotation(NotEmpty.class);
            if (annotation != null) {
                field.setAccessible(true);
                Object value = field.get(lego);
                if (value instanceof String) {
                    String fieldValue = (String) value;
                    if (fieldValue.isEmpty()) {
                        validationResult = new ValidationResult(false, field.getName() + " is invalid");
                        break;
                    }
                }
            }
        }
        return validationResult;
    }
}
