package com.idat.EFRubenDiosesPizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.EFRubenDiosesPizza.model.PizzaDetalle;

public interface DetallePizzaPizzeriaRepository extends JpaRepository<PizzaDetalle, Integer> {

}
