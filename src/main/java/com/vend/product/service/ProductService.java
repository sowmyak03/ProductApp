package com.vend.product.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vend.product.dao.ProductRepository;
import com.vend.product.dto.Product;

@Service
public class ProductService {
	
/*	@Autowired
	private ProductRepository productRepository;*/
	
	private List<Product> productList = new ArrayList<>(Arrays.asList(
			new Product("1","Chrome Toaster", "$100"),
			new Product("2","Cooper Kettle", "$49.9")
			));
	
	/*public List<Product> getAllTopics() {
		return (List<Product>) this.productRepository.findAll();
	}
*/
	
	
	public List<Product> getAllProducts() {
		return productList;
	}
	
	public void addProduct(Product product) {
		productList.add(product);
	}

}
