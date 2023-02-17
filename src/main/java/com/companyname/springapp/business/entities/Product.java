package com.companyname.springapp.business.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase POJO la cual nos ayuda a modelar datos, <br>
 * utilizando las anotaciones JPA realiza el mapeo entre los campos del objeto y
 * aquellos de la base de datos. Asimismo. <br>
 * Con el fin de que la clase Product se persista correctamente
 * 
 * @author uriel
 * @since 13/02/2023
 * @version 1.0
 *
 */

//con las notaciones hacemos persisnte la clase.
//ademas que se mapea(se hace referencia en nuestra BD de la tabla prodcuts

@Entity
@Table(name = "products")
public class Product {

	// mapeamos la propiedad ID de nuestra clase(objeto) con el de nuesta BD
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String description;
	private Double price;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Description: " + description + ";");
		buffer.append("Price: " + price + ";");
		return buffer.toString();
	}

}