package com.example.catalogue.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.catalogue.models.Depense;
import com.example.catalogue.services.DepenseService;

/**
 * La classe DepenseController implémente toutes les methodes de
 * la classe DepenseService
 */
@RestController
@RequestMapping("/api/catalogues")
//@RequiredArgsConstructor
public class DepenseController {
@Autowired
 private DepenseService depenseService;

    /**
     * Méthode GET pour récupérer toutes les Depenses
     * @return depenseService.getAllDepense()
     */
    @GetMapping("/depenses")
    public List<Depense> listDepense() {
        return depenseService.getAllDepense();
    }

    /**
     * Méthode POST pour enregistrer une Depense
     * @param depense
     * @return depenseService.addDepense(depense)
     */
    @PostMapping("/depenses")
    public Depense save(@RequestBody Depense depense) {
    	return depenseService.addDepense(depense);
    }
  
}
  

