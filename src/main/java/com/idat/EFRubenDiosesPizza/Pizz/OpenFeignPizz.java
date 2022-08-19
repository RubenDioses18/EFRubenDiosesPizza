package com.idat.EFRubenDiosesPizza.Pizz;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.EFRubenDiosesPizza.dto.PizzeriaDTO;

@FeignClient(name = "idat-pizzeria", url= "localhost:8083")
public interface OpenFeignPizz {
	
	@GetMapping("/api/v1/pizzeria/listar")
	public List<PizzeriaDTO> listadoPizzeriaSeleccionados();

}
