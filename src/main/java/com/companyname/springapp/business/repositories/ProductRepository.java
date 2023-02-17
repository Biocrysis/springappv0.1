package com.companyname.springapp.business.repositories;

/**
 * Clase de implementación para JPA de un Objeto de Acceso a Datos (DAO) \n
 * 
 * @author uriel
 * @version 1.0
 * @serial 16/02/2023
 */
import com.companyname.springapp.business.entities.Product;
public interface ProductRepository  extends CrudRepository<Product,Integer>{
	
}
