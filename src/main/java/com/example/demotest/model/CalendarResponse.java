package com.example.demotest.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class CalendarResponse {
    private String storeID;
    private LocalDateTime requestDate;
    private String status;

}
