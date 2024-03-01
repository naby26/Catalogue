package com.example.catalogue.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Produit {
	
		 @Id
		 @GeneratedValue(strategy = GenerationType.IDENTITY)
		 private Long id;
		
		 private String reference;
		
		 private String types;

		 private Date expirations;
		
		 private Double prix;
		 
}
