package com.idat.EFRubenDiosesPizza.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PizzaPizzeriaFK implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6260927695546844420L;

	@Column(name = "id_pizza", nullable = false, unique = true)
	private Integer idpizza;
	
	@Column(name = "id_pizzeria", nullable = false, unique = true)
	private Integer idpizzeria;

	public Integer getIdpizza() {
		return idpizza;
	}

	public void setIdpizza(Integer idpizza) {
		this.idpizza = idpizza;
	}

	public Integer getIdpizzeria() {
		return idpizzeria;
	}

	public void setIdpizzeria(Integer idpizzeria) {
		this.idpizzeria = idpizzeria;
	}
	
	

}
