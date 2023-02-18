package com.companyname.springapp.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.companyname.springapp.business.entities.Product;
import com.companyname.springapp.business.repositories.ProductRepository;

public class JPAProductManager {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getProducts(){
		return (List<Product>) productRepository.findAll();
	}
	public void increasePrice(int percentage) {
		List<Product> products = (List<Product>) productRepository.findAll();
		if(products!=null) {
			for(Product product : products) {
				Double newPrice = product.getPrice() * (100/percentage)/100;
				product.setPrice(newPrice);
				productRepository.save(product);
			}
		}
	}
}
