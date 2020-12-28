package com.epita.tpaliment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epita.tpaliment.entity.Aliment;
import com.epita.tpaliment.infra.DaoAliment;

@Service
public class AlimentServiceImpl implements AlimentService {
	
	@Autowired
	DaoAliment dao;
	
	public void afficherComposition(String nom) {
		Aliment a = new Aliment();
		a.getNom();
		dao.create(a);
	}

}
