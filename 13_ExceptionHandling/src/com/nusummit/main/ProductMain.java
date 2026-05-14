package com.nusummit.main;

import com.nusummit.main.domain.Product;
import com.nusummit.main.exception.InvalidProductPriceException;

public class ProductMain {
	public static void main(String[] args) {
		try {
			Product product = new Product(101, "Nirma", 100);
			System.out.println(product.getProductId());
			System.out.println(product.getName());
			System.out.println(product.getPrice());
		} catch (InvalidProductPriceException e) {
			System.out.println(e.getMessage());
		}

	}
}
