package com.example.springboot.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.dtos.ProductRecordsDto;
import com.example.springboot.models.ProductModel;
import com.example.springboot.repository.ProductRepository;


import jakarta.validation.Valid;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @PostMapping("/products")
    public ResponseEntity<ProductModel> saveProduct(@RequestBody @Valid ProductRecordsDto productRecordsDto){
        var productModel = new ProductModel();
        BeanUtils.copyProperties(productRecordsDto, productModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(productRepository.save(productModel));

    }


    
}
