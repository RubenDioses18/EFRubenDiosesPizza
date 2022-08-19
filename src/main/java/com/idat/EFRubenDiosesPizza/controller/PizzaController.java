package com.idat.EFRubenDiosesPizza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.EFRubenDiosesPizza.model.Pizza;
import com.idat.EFRubenDiosesPizza.servicio.PizzaService;

@Controller
@RequestMapping("/api/v1/pizza")
public class PizzaController {
	
	@Autowired(required = false)
	private PizzaService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Pizza> listarPizza(){
		return service.listarPizza();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody Pizza obtenerPizza(@PathVariable Integer id) {
		return null;
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarPizza(@RequestBody Pizza pizza) {
		service.guardarPizza(pizza);
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void asignarPizzerias() {
		service.asignarPizzerias();
	}

}
