package com.diandra.lilibeth.pizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diandra.lilibeth.pizza.client.OpenFeignClient;
import com.diandra.lilibeth.pizza.dto.Cliente;
import com.diandra.lilibeth.pizza.model.ClientePizza;
import com.diandra.lilibeth.pizza.model.ClientePizzaFK;
import com.diandra.lilibeth.pizza.model.Pizza;
import com.diandra.lilibeth.pizza.repository.ClientePizzaRepository;
import com.diandra.lilibeth.pizza.repository.PizzaRepository;

@Service
public class PizzaServiceImpl implements PizzaService{

	@Autowired
	private PizzaRepository repo; 
	
	@Autowired
	private ClientePizzaRepository repoclientepizza;
	
	@Autowired
	private OpenFeignClient feign;
	
	
	@Override
	public List<Pizza> listar() {
		
		return repo.findAll();
	}

	@Override
	public Pizza obtenerID(Integer id) {
		
		return repo.findById(id).orElse(null);
	}

	@Override
	public void guardar(Pizza pizza) {
		
		repo.save(pizza);
		
	}

	@Override
	public void eliminar(Integer id) {
		repo.findById(id);
		
	}

	@Override
	public void actualizar(Pizza pizza) {
		repo.saveAndFlush(pizza);
		
	}

	@Override
	public void asignarClientePizza() {
		
		List<Cliente> listado = feign.listarClientesSeleccionados();;
		ClientePizzaFK fk = null;
		ClientePizza pizza = null;
		
		for(Cliente cliente : listado) {
			fk = new ClientePizzaFK();
			fk.setIdCliente(cliente.getIdCliente());
			fk.setIdPizza(1);
			
			pizza = new ClientePizza();
			pizza.setFk(fk);
			
			repoclientepizza.save(pizza);
			
		}
		
	}

}
