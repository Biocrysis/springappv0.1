package com.companyname.springapp.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.companyname.springapp.business.entities.Product;
import com.companyname.springapp.business.services.ProductManager;
import com.companyname.springapp.business.services.SimpleProductManager;

/**
 * 
 * @author uriel
 * @since 10/02/2023
 * @version 1.0
 */


@Configuration
@ComponentScan
public class SpringappBusinessConfig{
	
	//si no inyectamos el product manager antes, no podemos realizar el test de 
	// de inventorycontrollertest
	
	private static Double CHAIR_PRICE = new Double(20.50);
    private static String CHAIR_DESCRIPTION = "Chair";

    private static String TABLE_DESCRIPTION = "Table";
    private static Double TABLE_PRICE = new Double(150.10);
    
    
    @Bean
    public ProductManager loadProductManager() {
    	SimpleProductManager simpleProductManager = new SimpleProductManager();
    	//creacion de lista para guardar un arreglo de productos [precio,detalle]
    	List<Product> products = new ArrayList<Product>();
    	// creacion del producto para rellenarlo
    	Product product = new Product();
    	product.setDescription(CHAIR_DESCRIPTION);
    	product.setPrice(CHAIR_PRICE);
    	//se agrega el producto al arraylist
    	products.add(product);
    	
    	product= new Product();
    	product.setDescription(TABLE_DESCRIPTION);
    	product.setPrice(TABLE_PRICE);
    	products.add(product);
    	
    	// se mandan el arreglo de productos al product manager
    	simpleProductManager.setProducts(products);
    	return simpleProductManager;
    }
    
}