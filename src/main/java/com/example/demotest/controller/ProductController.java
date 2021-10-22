package com.example.demotest.controller;


import com.example.demotest.model.ProductInput;
import com.example.demotest.model.ProductResponse;
import com.example.demotest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    /**
     * Gets Product availability status along with store no, product id, requested date and requested quantity.
     *
     * Checks Product availability on required date input by user and if status is equal to
     * "No Capacity" or "No Content" or "Available", then return product details and Http Status OK
     * Otherwise return Response code 204 - no content.
     *
     * @param productInput Object of ProductInput, stores data input by user
     * @return product response i.e, product availability status and Http Status.
     *
     */
    @PostMapping("/getProdAvailability")
    public ResponseEntity<ProductResponse> getProductAvailability(@RequestBody ProductInput productInput)
    {
        productService.setAvailability();
        productService.setCapacity();
        String status= productService.getProductAvailability(productInput.getDate());
        if(status.equals("Available") || status.equals("No Content") || status.equals("No Capacity")){
            ProductResponse productResponse = new ProductResponse(productInput.getStoreNo(), productInput.getProductId(), productInput.getDate(), productInput.getReqQty(), status);
            return new ResponseEntity<>(productResponse, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
