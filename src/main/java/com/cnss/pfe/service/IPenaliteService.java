package com.cnss.pfe.service;

import java.util.List;

import com.cnss.pfe.persistance.model.Penalite;

public interface IPenaliteService {
	public void add(Penalite penalite);
	public void delete(Penalite penalite);
	public void update(Penalite penalite);
	public List<Penalite>findAll();

}
