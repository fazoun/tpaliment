package com.epita.tpaliment.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Aliment {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id; 
	
	private String nom; 
	
	@OneToMany (cascade = CascadeType.ALL)
	private GroupeAliment groupeAliment; 
	
	@OneToMany (cascade = CascadeType.ALL)
	private SousGroupeAliment sousGroupeAliment;
	
	@OneToOne (cascade = CascadeType.ALL)
	private CodeAliment codeAliment;
	
	@OneToOne (cascade = CascadeType.ALL)
	private CompositionAliment compositionAliment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}