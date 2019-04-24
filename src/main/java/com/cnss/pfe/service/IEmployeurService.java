package com.cnss.pfe.service;
import java.util.List;

import com.cnss.pfe.persistance.model.Employeur;

public interface IEmployeurService {
	
	public void add(Employeur employeur);
	public void delete(Employeur employeur);
	public void update(Employeur employeur);
	public List<Employeur>findAll();
}
