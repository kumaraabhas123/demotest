package com.example.demotest.service;

import com.example.demotest.model.Sorting;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class SortingService {
    private  static final ArrayList<Sorting> ProductList = new ArrayList<>();


    public void getResult(){
         ProductList.stream().sorted();


    }

}
