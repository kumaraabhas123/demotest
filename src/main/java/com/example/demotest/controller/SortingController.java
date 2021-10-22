package com.example.demotest.controller;

import com.example.demotest.service.SortingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SortingController {

    @Autowired
    private SortingService sortingService;


}
