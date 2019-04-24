package com.cnss.pfe.service;

import java.util.List;

import com.cnss.pfe.persistance.model.Ds;

public interface IDsService {
	public void add(Ds ds);
	public void delete(Ds ds);
	public void update(Ds ds);
	public List<Ds>findAll();
	public List<Ds> findByCriteria(int cleEmp, int cle2);
}
