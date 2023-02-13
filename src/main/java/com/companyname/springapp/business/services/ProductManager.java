package com.companyname.springapp.business.services;

import java.util.List;

/**
 * Interfaz que nos ayudara a gestionar la clase producto.
 * la cual contiene metodos para incrementar el precio y recuperar los productos.
 * @author uriel
 * @since 13/02/2023
 * @version 1.0
 */

import com.companyname.springapp.business.entities.Product;

public interface ProductManager {
	/**
	 * 
	 * @param percentage valor del precio de un producto
	 */
	public void increasePrice(int percentage);

	public List<Product> getProducts();
}
