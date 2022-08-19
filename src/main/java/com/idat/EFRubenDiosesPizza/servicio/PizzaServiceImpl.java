package com.idat.EFRubenDiosesPizza.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EFRubenDiosesPizza.Pizz.OpenFeignPizz;
import com.idat.EFRubenDiosesPizza.dto.PizzeriaDTO;
import com.idat.EFRubenDiosesPizza.model.Pizza;
import com.idat.EFRubenDiosesPizza.model.PizzaDetalle;
import com.idat.EFRubenDiosesPizza.model.PizzaPizzeriaFK;
import com.idat.EFRubenDiosesPizza.repository.DetallePizzaPizzeriaRepository;
import com.idat.EFRubenDiosesPizza.repository.PizzaRepository;

@Service
public class PizzaServiceImpl implements PizzaService {

	@Autowired(required = false)
	private PizzaRepository repository;
	
	@Autowired(required = false)
	private DetallePizzaPizzeriaRepository repositoryPizzaPizzeria;
	
	@Autowired(required = false)
	private OpenFeignPizz feign;
	
	
	@Override
	public List<Pizza> listarPizza() {
		return repository.findAll();
	}

	@Override
	public Pizza obtenerPizza() {
		return null;
	}

	@Override
	public void guardarPizza(Pizza pizza) {
		repository.save(pizza);

	}

	@Override
	public void asignarPizzerias() {
		List<PizzeriaDTO> listado = feign.listadoPizzeriaSeleccionados();
		
		PizzaDetalle detalle = null;
		PizzaPizzeriaFK fk = null;
		
		for (PizzeriaDTO pizzeriaDTO : listado) {
			detalle = new PizzaDetalle();
			fk = new PizzaPizzeriaFK();
			
			fk.setIdpizzeria(pizzeriaDTO.getIdPizzeria());
			fk.setIdpizza(1);
			
			detalle.setFk(fk);
			
			repositoryPizzaPizzeria.save(detalle);
		}
		
		
	}

}
