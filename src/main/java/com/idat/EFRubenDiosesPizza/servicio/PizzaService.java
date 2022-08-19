package com.idat.EFRubenDiosesPizza.servicio;

import java.util.List;

import com.idat.EFRubenDiosesPizza.model.Pizza;

public interface PizzaService {
	
	public List<Pizza> listarPizza();
	public Pizza obtenerPizza();
	public void guardarPizza(Pizza pizza);
	public void asignarPizzerias();

}
