package com.rafaelfavetta.mibri.controller;

import com.rafaelfavetta.mibri.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;
}
