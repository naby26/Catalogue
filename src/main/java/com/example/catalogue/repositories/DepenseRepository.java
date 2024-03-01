package com.example.catalogue.repositories;

//Package : repositories

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.catalogue.models.Depense;

/**
 * l'interface Depenserepository etend JpaRepository
 */
	public interface DepenseRepository extends JpaRepository<Depense, Long> {
		
	}

