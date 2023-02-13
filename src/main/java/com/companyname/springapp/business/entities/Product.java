package com.companyname.springapp.business.entities;

/**
 * Clase POJO la cual nos ayuda a modelar datos, con sus propiedades o atributos simples de un clase
 * @author uriel
 * @since 13/02/2023
 * @version 1.0
 *
 */


public class Product {
	

	private String description;
	private Double price;
	
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
		buffer.append("Description"+description+";");
		buffer.append("Price"+price+";");
		return buffer.toString();
	}
	
	
	
}