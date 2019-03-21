package com.vend.product.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private String id;
	private String name;
	private String price;

	public Product() {
	}

	public Product(String id, String name, String price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
