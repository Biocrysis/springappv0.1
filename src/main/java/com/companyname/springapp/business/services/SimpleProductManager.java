package com.companyname.springapp.business.services;

/**
 * Clase que implementa los metodos de la interfaz
 * 
 * @author uriel
 * @since 13/02/2023
 * @version 1.0
 * 
 */

import java.util.List;

import com.companyname.springapp.business.entities.Product;

public class SimpleProductManager implements ProductManager {
	
private List<Product> products;


	public List<Product> getProducts() {
		
		// excepcion para marcar que el o los metodos no estan implementados.
		//throw new UnsupportedOperationException();
		
		return products;
	}

	public void increasePrice(int percentage) {
		
		throw new UnsupportedOperationException();
	}
	
	
	public void setProducts(List<Product> products) {
		//throw new UnsupportedOperationException();
		this.products=products;
	}

}
