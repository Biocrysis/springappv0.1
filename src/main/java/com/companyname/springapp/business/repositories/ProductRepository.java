package com.companyname.springapp.business.repositories;

import org.springframework.data.repository.CrudRepository;
import com.companyname.springapp.business.entities.Product;
/**
 *  Clase de implementaci�n para JPA de un Objeto de Acceso a Datos (DAO) <br> 
 * Mediante la extensi�n {@linkplain CrudRepository} que ya contienen un conjunto de clases donde los m�todos b�sicos de acceso <br> 
 * datos (CRUD) ya est�n implementados y solamente es necesario a�adir aquellos que no sigan una notaci�n est�ndar
 * @author uriel
 *
 */
public interface ProductRepository extends CrudRepository<Product,Integer> {

}
