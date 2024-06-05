package com.example.vehicle_production.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleId;

    private String vehicleName;
    private String vehicleModel;
    private int yearOfManufacture;
    private String vehicleColor;
}
