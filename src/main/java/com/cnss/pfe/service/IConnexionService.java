package com.cnss.pfe.service;

import java.util.List;

import com.cnss.pfe.persistance.model.Connexion;


public interface IConnexionService {
	public void add(Connexion connexion);
	public void delete(Connexion connexion);
	public void update(Connexion connexion);
	public List<Connexion>findAll();

}
