package com.diandra.lilibeth.pizza.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cliente_pizza")
public class ClientePizza {
	
	@Id
	private ClientePizzaFK fk = new ClientePizzaFK();
	
	

}
