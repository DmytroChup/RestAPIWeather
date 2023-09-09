package com.chupryna.RestAPIWeather.util;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.ArrayList;
import java.util.List;

public class ErrorsUtil {
    public static void returnError(BindingResult bindingResult) {
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        List<String> errors = new ArrayList<>();
        for(FieldError error: fieldErrors) {
            String errorMessage = error.getField() + " - " + error.getDefaultMessage();
            errors.add(errorMessage);
        }
        throw new MeasurementException(errors);
    }
}
