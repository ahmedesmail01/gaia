package com.gaia.ecommerce;

import org.springframework.boot.SpringApplication;

public class TestGaiaBackendApplication {

	public static void main(String[] args) {
		SpringApplication.from(GaiaBackendApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
