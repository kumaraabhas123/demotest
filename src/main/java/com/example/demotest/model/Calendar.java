package com.example.demotest.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalTime;

@Data
@AllArgsConstructor
public class Calendar {
    private String storeID;
    private String Day;
    private LocalTime cutOffTime;
}
