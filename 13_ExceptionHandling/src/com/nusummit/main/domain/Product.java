package com.nusummit.main.domain;

import com.nusummit.main.exception.InvalidProductPriceException;

public class Product {
	private int productId;
	private String name;
	private double price;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String name, double price) throws InvalidProductPriceException {
		super();
		this.productId = productId;
		this.name = name;
		if (price > 0)
			this.price = price;
		else
			throw new InvalidProductPriceException();
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) throws InvalidProductPriceException {
		if (price > 0)
			this.price = price;
		else 
			throw new InvalidProductPriceException();
	}

}
