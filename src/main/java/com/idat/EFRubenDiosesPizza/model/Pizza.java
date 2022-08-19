package com.idat.EFRubenDiosesPizza.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "pizza")
public class Pizza {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_pizza;
	private String nombre_pizza;
	private String descripcion;
	
	
	public Pizza() {
		super();
	}
	public Integer getId_pizza() {
		return id_pizza;
	}
	public void setId_pizza(Integer id_pizza) {
		this.id_pizza = id_pizza;
	}
	public String getNombre_pizza() {
		return nombre_pizza;
	}
	public void setNombre_pizza(String nombre_pizza) {
		this.nombre_pizza = nombre_pizza;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
