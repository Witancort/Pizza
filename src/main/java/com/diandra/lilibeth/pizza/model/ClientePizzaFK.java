package com.diandra.lilibeth.pizza.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class ClientePizzaFK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4671860146585526713L;
	
	@Column(name="id_pizza",nullable = false, unique = true)
	private Integer idPizza;
	
	@Column(name= "id_cliente",nullable = false,unique = true)
	private Integer idCliente;

}
