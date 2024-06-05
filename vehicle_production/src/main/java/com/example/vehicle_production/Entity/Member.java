package com.example.vehicle_production.Entity;

import jakarta.persistence.Id;

public class Member {
    @Id
    private String userId;

    private String password;
    private boolean isActive;
}
