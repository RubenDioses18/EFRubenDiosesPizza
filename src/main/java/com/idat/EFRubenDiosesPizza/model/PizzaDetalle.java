package com.idat.EFRubenDiosesPizza.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "detalle_pizzapizzeria")
public class PizzaDetalle {
	@Id
	private PizzaPizzeriaFK fk = new PizzaPizzeriaFK();

	public PizzaPizzeriaFK getFk() {
		return fk;
	}

	public void setFk(PizzaPizzeriaFK fk) {
		this.fk = fk;
	}

}
