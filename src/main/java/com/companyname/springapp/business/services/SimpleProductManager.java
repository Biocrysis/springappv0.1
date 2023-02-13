package com.companyname.springapp.business.services;

/**
 * Clase que implementa los metodos de la interfaz
 * @author uriel
 * @since 13/02/2023
 * @version 1.0
 */
import java.util.List;

import com.companyname.springapp.business.entities.Product;

public class SimpleProductManager implements ProductManager{
	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		//excepcion para marcar que el o los metodos no estan implementados.
		throw new UnsupportedOperationException();
	}

	@Override
	public void increasePrice(int percentage) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	public void serProducts(List<Product> products) {
		throw new UnsupportedOperationException();
	}
	
	
}
