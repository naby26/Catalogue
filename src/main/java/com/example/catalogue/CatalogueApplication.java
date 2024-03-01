package com.example.catalogue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * La classe catalogueApplication est la classe principale ou l'application
 */
@EnableDiscoveryClient
@SpringBootApplication
public class CatalogueApplication {
	/**
	 * On définie ici la méthode main
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(CatalogueApplication.class, args);
	}
	
}
