package com.diandra.lilibeth.pizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EfDiandraLilibethPizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfDiandraLilibethPizzaApplication.class, args);
	}

}
