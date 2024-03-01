package com.example.catalogue.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catalogue.models.Depense;
import com.example.catalogue.repositories.DepenseRepository;

import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepenseService {

	/**
	 * Instanciation de l'interface DepenseRepository
	 */
	 @Autowired
	 private DepenseRepository depenseRepository;

	/**
	 *  Méthode pour ajouter une dépense qui prend en :
	 * @param depense
	 * @return un message de succés ou d'échec
	 */
	public Depense addDepense(Depense depense) {
	        return depenseRepository.save(depense);
	    }

	/**
	 * Méthode pour récupérer toutes les dépenses
	 * @return la liste des dépenses
	 */
	public List<Depense> getAllDepense() {
	        return depenseRepository.findAll();
	    }

}
