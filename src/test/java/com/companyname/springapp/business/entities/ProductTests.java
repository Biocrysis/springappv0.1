package com.companyname.springapp.business.entities;

/**
 * Clase para testerar la Clase entididad (POJO) Product
 * @author uriel
 * @since 13/02/2023
 * @version 1.0
 */
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProductTests {
	
	private Product product;
	//before se utiliza para indicar que un método se debe ejecutar antes de cada prueba en una clase
	@Before
	public void setUp() throws Exception{
		product = new Product();
	}
	
	@Test
	public void testSetAndGetDescription() {
		String testDescription = "aDescription";
		//verefica que el objeto es null
		assertNull(product.getDescription());
		product.setDescription(testDescription);
		
		//assertEquals verifica que el valor esperado coincide con el valor devuelto
		assertEquals(testDescription, product.getDescription());
	}
	
	@Test
	public void testSetAndGetPrice() {
		double testPrice= 100.00;
		assertEquals(0, 0,0);
		product.setPrice(testPrice);
		assertEquals(testPrice, product.getPrice(),0);
	}
}