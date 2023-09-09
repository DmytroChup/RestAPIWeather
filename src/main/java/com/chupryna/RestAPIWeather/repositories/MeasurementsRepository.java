package com.chupryna.RestAPIWeather.repositories;

import com.chupryna.RestAPIWeather.models.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasurementsRepository extends JpaRepository<Measurement, Integer> {
}
