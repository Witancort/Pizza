package com.diandra.lilibeth.pizza.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.diandra.lilibeth.pizza.dto.Cliente;

@FeignClient(name= "idat-cliente", url="ocalhost:8080")
public interface OpenFeignClient {
	
	@GetMapping("/api/cliente/v1/listar")
	public List<Cliente> listarClientesSeleccionados();
	
	

}
