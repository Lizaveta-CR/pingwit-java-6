package com.pingwit.core.les_14.classwork.point_1;

public class ValidationResult {

    private boolean isValid;
    private String message;

    public ValidationResult(boolean isValid, String message) {
        this.isValid = isValid;
        this.message = message;
    }

    @Override
    public String toString() {
        return "ValidationResult{" +
            "isValid=" + isValid +
            ", message='" + message + '\'' +
            '}';
    }
}
