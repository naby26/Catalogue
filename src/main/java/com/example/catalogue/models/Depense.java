package com.example.catalogue.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * on a défini la classe dépense qui a pour attributs : id, reference, description, date et montant
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Depense {
	/**
	 * 1°) id: est l'identifiant de dépense c'est à dire la clé primaire de la table dépense et est autoincrémenté
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * 2°) reference: est la référence de la dépense
	 */
	private String reference;

	/**
	 * 3°) description: c'est pour décrire la dépense
	 */
	private String description;

	/**
	 * 4°) date: est la date dont la dépense est effectuée
	 */
	private Date date;

	/**
	 * 5°) montant: est le montant de la dépense effectuée
	 */
	private Double montant;
		 
	}
