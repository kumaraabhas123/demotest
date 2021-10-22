package com.example.demotest.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class ProductResponse {

    private String storeNo;
    private String productId;
    private LocalDate date;
    private double reqQty;
    private String status;
}
