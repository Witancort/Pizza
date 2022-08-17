package com.diandra.lilibeth.pizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diandra.lilibeth.pizza.model.Pizza;

public interface PizzaRepository extends JpaRepository<Pizza, Integer> {

}
