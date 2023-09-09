package com.chupryna.RestAPIWeather.util;

import com.chupryna.RestAPIWeather.models.Sensor;
import com.chupryna.RestAPIWeather.services.SensorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Optional;

@Component
public class SensorValidator implements Validator {
    private final SensorsService sensorsService;

    @Autowired
    public SensorValidator(SensorsService sensorsService) {
        this.sensorsService = sensorsService;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Sensor.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Sensor sensor = (Sensor) target;
        Optional<Sensor> existingSensor = sensorsService.findByName(sensor.getName());

        if(existingSensor.isPresent()) {
            errors.rejectValue("name", "", "This name has been used");
        }
    }
}
