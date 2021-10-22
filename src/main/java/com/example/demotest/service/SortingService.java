package com.example.demotest.service;

import com.example.demotest.model.Sorting;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SortingService {
   public List<Sorting> sortProducts(List<Sorting> productListInput){
       List<Sorting> sorted= productListInput.stream().sorted(Comparator.comparing(Sorting::getProductId)
                                .thenComparing(Sorting::getLaunchDate)).collect(Collectors.toList());
       return sorted;
    }

}
