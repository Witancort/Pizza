package com.diandra.lilibeth.pizza.service;

import java.util.List;

import com.diandra.lilibeth.pizza.model.Pizza;

public interface PizzaService {
	
	List<Pizza> listar();
	Pizza obtenerID(Integer id);
	void guardar(Pizza pizza);
	void eliminar(Integer id);
	void actualizar(Pizza pizza);
	
	void asignarClientePizza();
	

}
