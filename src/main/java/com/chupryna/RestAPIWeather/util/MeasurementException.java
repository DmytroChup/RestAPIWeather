package com.chupryna.RestAPIWeather.util;

import java.util.List;

public class MeasurementException extends RuntimeException {
    private final List<String> errors;
    public MeasurementException(List<String> errors) {
        this.errors = errors;
    }

    public List<String> getErrors() {
        return errors;
    }
}
