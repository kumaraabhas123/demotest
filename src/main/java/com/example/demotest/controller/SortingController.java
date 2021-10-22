package com.example.demotest.controller;

import com.example.demotest.model.Sorting;
import com.example.demotest.service.SortingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class SortingController {

    @Autowired
    private SortingService sortingService;

    @PostMapping("/sortProducts")
    public List<Sorting> sortProducts(@RequestBody List<Sorting> productListInput){
        List<Sorting> productOutput = sortingService.sortProducts(productListInput);
        return productOutput;
    }


}
