package com.companyname.springapp.business.services;
/**
 * Clase para testear 
 * @author uriel
 * @since 13/02/2023
 * @version 1.0
 */

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.companyname.springapp.business.entities.Product;

public class SimpleProductManagerTests{
	
	private SimpleProductManager productManager;
	
	private List<Product> products;
	
	private static int PRODUCT_COUNT = 2;
	
	private static Double CHAIR_PRICE = new Double(20.50);
	private static String CHAIR_DESCRIPTION = "Chair";
	
	private static String TABLE_DESCRIPTION = "Table";
	private static Double TABLE_PRICE = new Double(150.10);
	
	private static int POSITIVE_PRICE_INCREASE = 10;
	
	
	
	@Before
	public void setUp() throws Exception {
		productManager = new SimpleProductManager();
		
		products= new ArrayList<Product>();
		
		//lista de productos
		Product product= new Product();
		product.setDescription(CHAIR_DESCRIPTION); //ingresa valores al producto
		product.setPrice(CHAIR_PRICE);
		products.add(product); //agrega el producto al arraylist de productos
		
		
		product= new Product();
		product.setDescription(TABLE_DESCRIPTION);
		product.setPrice(TABLE_PRICE);
		products.add(product);
		
		// implemenatmos los metodos que se toman de la interfaz productManager los cuales son para obtener
		// producto e insertar productos
		productManager.setProducts(products); // se rellena la lista de products
		
		
	}
	
	@Test
	public void testProductsWithNoProducts() {
		productManager = new SimpleProductManager();
		assertNull(productManager.getProducts());
	}
	// TEST PARA COMPORAR SI LOS OBTENER PRODUCTOS Y OBTENER SUS DESCRIPCION Y PRODUCTOS.
	/**
	 * @param testGetProducts() metodo que verifica que la cantidad de productos se igual 
	 */
	@Test
	public void testGetProducts() {
		
		List<Product> products=productManager.getProducts();
		assertNotNull(products);
		assertEquals(PRODUCT_COUNT, productManager.getProducts().size());
		
		Product product = products.get(0);
		assertEquals(CHAIR_DESCRIPTION, product.getDescription());
		assertEquals(CHAIR_PRICE, product.getPrice());
		
		 product = products.get(1);
		assertEquals(TABLE_DESCRIPTION, product.getDescription());
		assertEquals(TABLE_PRICE, product.getPrice());
		
	}
	
	// TEST PARA INCREMENTE EL  PORCENTAJE DEL PRECIO (10%) EN LOS PRODUCTOS
	@Test
	public void testIncreasePriceWithNullListOfProducts() {
		try {
			productManager = new SimpleProductManager();
			productManager.increasePrice(POSITIVE_PRICE_INCREASE);
		} catch (NullPointerException ex) {
			fail("Products list is null");
		}
	}
	
	@Test
	public void testIncreasePriceWithEmptyListOfProducts() {
		try {
			productManager = new SimpleProductManager();
			productManager.setProducts(new ArrayList<Product>()); // crea arreglo para insertar a la lista products PRODUCT_COUNT
			productManager.increasePrice(POSITIVE_PRICE_INCREASE);
			
		} catch (Exception e) {
			fail("Product list is empty");
		}
	}
	
	@Test
	public void testIncreasePriceWithPositivePercentage() {
		productManager.increasePrice(POSITIVE_PRICE_INCREASE);
		double expectedChairPriceWithIncrease = 22.55;
        double expectedTablePriceWithIncrease = 165.11;
        
        List<Product> products= productManager.getProducts();
        Product product = products.get(0);
        //comparamos que el valor relaizado en la operacion se igual al valor esperado que se establecio 
        assertEquals(expectedChairPriceWithIncrease, product.getPrice(),0);
        
        product=products.get(1);
        assertEquals(expectedTablePriceWithIncrease,product.getPrice(),0);
        
	}
	
}