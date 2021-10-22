package com.example.demotest.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class ProductAvailability {
    private String storeNo;
    private String productId;
    private LocalDate date;
    private double availQty;
}