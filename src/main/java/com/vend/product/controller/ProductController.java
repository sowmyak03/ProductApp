package com.vend.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vend.product.dto.Product;
import com.vend.product.service.ProductService;


@RestController
@EnableAutoConfiguration
public class ProductController {
	
	@Autowired
	 ProductService productService;
	
	@RequestMapping("/products")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

}
