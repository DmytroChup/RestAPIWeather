package com.chupryna.RestAPIWeather.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

@Entity
@Table(name = "Measurement")
public class Measurement {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "value")
    @NotNull
    @Min(-100)
    @Max(100)
    private Double value;

    @Column(name = "raining")
    @NotNull
    private Boolean isRaining;

    @Column(name = "measurement_data_time")
    @NotNull
    private LocalDateTime measurementDataTime;

    @ManyToOne
    @JoinColumn(name = "sensor_name", referencedColumnName = "name")
    @NotNull
    private Sensor sensor;

    public Measurement() {
    }

    public Measurement(Double value, Boolean raining, LocalDateTime measurementDataTime) {
        this.value = value;
        this.isRaining = raining;
        this.measurementDataTime = measurementDataTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Boolean isRaining() {
        return isRaining;
    }

    public void setRaining(Boolean isRaining) {
        this.isRaining = isRaining;
    }

    public LocalDateTime getMeasurementDataTime() {
        return measurementDataTime;
    }

    public void setMeasurementDataTime(LocalDateTime measurementDataTime) {
        this.measurementDataTime = measurementDataTime;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }
}
