package com.companyname.springapp.business.repositories;

import org.springframework.data.repository.CrudRepository;
import com.companyname.springapp.business.entities.Product;
/**
 *  Clase de implementación para JPA de un Objeto de Acceso a Datos (DAO) <br> 
 * Mediante la extensión {@linkplain CrudRepository} que ya contienen un conjunto de clases donde los métodos básicos de acceso <br> 
 * datos (CRUD) ya están implementados y solamente es necesario añadir aquellos que no sigan una notación estándar
 * @author uriel
 *
 */
public interface ProductRepository extends CrudRepository<Product,Integer> {

}
